package main;

import lipid.*;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.drools.ruleunits.api.RuleUnitProvider;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        LipidScoreUnit lipidScoreUnit = new LipidScoreUnit();

        RuleUnitInstance<LipidScoreUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(lipidScoreUnit);

        try {

            instance.fire();
            // TODO INTRODUCE THE QUERIES IF DESIRED


        } finally {
            instance.close();
        }
    }
}
