package exercises.doobie

import doobie._
import exercises.Test
import shapeless.HNil
import org.scalatest.Spec
import org.scalatest.prop.Checkers
import org.scalacheck.Shapeless._

class ConnectingToDatabaseSectionSpec extends Spec with Checkers {

  def `compute constant value` = {
    check(
      Test.testSuccess(
        ConnectingToDatabaseSection.constantValue _,
        42 :: HNil
      )
    )
  }

  def `compute constant value from database` = {
    check(
      Test.testSuccess(
        ConnectingToDatabaseSection.constantValueFromDatabase _,
        42 :: HNil
      )
    )
  }

  def `combine two small programs` = {
    check(
      Test.testSuccess(
        ConnectingToDatabaseSection.combineTwoPrograms _,
        (42, 25) :: HNil
      )
    )
  }

  def `combine two small programs with applicative` = {
    check(
      Test.testSuccess(
        ConnectingToDatabaseSection.combineTwoProgramsWithApplicative _,
        67 :: HNil
      )
    )
  }

}