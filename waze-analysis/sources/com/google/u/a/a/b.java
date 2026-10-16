package com.google.u.a.a;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    PROCESSING_PURPOSE_UNSPECIFIED(0),
    PROCESSING_PURPOSE_NOTHING(21),
    PROVISION_OF_SERVICE(1),
    PROVISION_OF_SERVICE_INFRASTRUCTURE(18),
    ADS_RELATED_PROVISION_OF_SERVICE(2),
    PRODUCT_PERSONALIZATION(3),
    CONTEXTUALIZATION(23),
    REVENUE_GENERATION(4),
    USER_SUPPORT(5),
    CLOUD_PROCESSING_INFRASTRUCTURE(22),
    CLOUD_PROCESSING_INFRASTRUCTURE_VALIDATION(33),
    ACCOUNT_MANAGEMENT(24),
    USER_COMMUNICATIONS(25),
    MODEL_TRAINING(30),
    VERIFICATION_TESTING_VALIDATION(6),
    DEBUGGING_AND_MONITORING(7),
    INFRASTRUCTURE_METRICS(8),
    DATA_RECOVERY(26),
    BUSINESS_ANALYSIS(9),
    MARKET_RESEARCH(10),
    RESEARCH_EXPERIMENTATION(11),
    TRUST_SAFETY(12),
    TRUST_SAFETY_ANTI_FRAUD(15),
    TRUST_SAFETY_ANTI_SPAM(16),
    TRUST_SAFETY_SECURITY(17),
    TRUST_SAFETY_ANTI_ABUSE(19),
    COMPLIANCE_LEGAL_SUPPORT(13),
    LIMITED_MANUAL_ACCESS(14),
    COMPLIANCE_LEGAL_SUPPORT_TAKEOUT(20),
    COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_LEGAL(27),
    COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_CONSUMER(28),
    COMPLIANCE_LEGAL_SUPPORT_ELI(29),
    EXP_MODEL_TRAINING_FOR_PRODUCTION(31),
    MODEL_GROUNDING(32),
    UNRECOGNIZED(-1);

    private final int K;

    b(int i2) {
        this.K = i2;
    }

    public static b a(int i2) {
        switch (i2) {
            case 0:
                return PROCESSING_PURPOSE_UNSPECIFIED;
            case 1:
                return PROVISION_OF_SERVICE;
            case 2:
                return ADS_RELATED_PROVISION_OF_SERVICE;
            case 3:
                return PRODUCT_PERSONALIZATION;
            case 4:
                return REVENUE_GENERATION;
            case 5:
                return USER_SUPPORT;
            case 6:
                return VERIFICATION_TESTING_VALIDATION;
            case 7:
                return DEBUGGING_AND_MONITORING;
            case 8:
                return INFRASTRUCTURE_METRICS;
            case 9:
                return BUSINESS_ANALYSIS;
            case 10:
                return MARKET_RESEARCH;
            case 11:
                return RESEARCH_EXPERIMENTATION;
            case 12:
                return TRUST_SAFETY;
            case 13:
                return COMPLIANCE_LEGAL_SUPPORT;
            case 14:
                return LIMITED_MANUAL_ACCESS;
            case 15:
                return TRUST_SAFETY_ANTI_FRAUD;
            case 16:
                return TRUST_SAFETY_ANTI_SPAM;
            case 17:
                return TRUST_SAFETY_SECURITY;
            case 18:
                return PROVISION_OF_SERVICE_INFRASTRUCTURE;
            case 19:
                return TRUST_SAFETY_ANTI_ABUSE;
            case 20:
                return COMPLIANCE_LEGAL_SUPPORT_TAKEOUT;
            case 21:
                return PROCESSING_PURPOSE_NOTHING;
            case 22:
                return CLOUD_PROCESSING_INFRASTRUCTURE;
            case 23:
                return CONTEXTUALIZATION;
            case 24:
                return ACCOUNT_MANAGEMENT;
            case 25:
                return USER_COMMUNICATIONS;
            case 26:
                return DATA_RECOVERY;
            case 27:
                return COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_LEGAL;
            case 28:
                return COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_CONSUMER;
            case 29:
                return COMPLIANCE_LEGAL_SUPPORT_ELI;
            case 30:
                return MODEL_TRAINING;
            case 31:
                return EXP_MODEL_TRAINING_FOR_PRODUCTION;
            case 32:
                return MODEL_GROUNDING;
            case 33:
                return CLOUD_PROCESSING_INFRASTRUCTURE_VALIDATION;
            default:
                return null;
        }
    }

    public static ei b() {
        return a.f12580a;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.K;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.K);
    }
}
