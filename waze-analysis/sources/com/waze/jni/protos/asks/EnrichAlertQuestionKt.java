package com.waze.jni.protos.asks;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.alerters.AlerterSubType;
import com.waze.jni.protos.alerters.AlerterType;
import com.waze.jni.protos.asks.EnrichAlertQuestion;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EnrichAlertQuestionKt {
    public static final EnrichAlertQuestionKt INSTANCE = new EnrichAlertQuestionKt();

    /* compiled from: WazeSource */
    public final class AnswerKt {
        public static final AnswerKt INSTANCE = new AnswerKt();

        private AnswerKt() {
        }

        /* renamed from: -initializeblockedLaneVariant, reason: not valid java name */
        public final EnrichAlertQuestion.Answer.BlockedLaneVariant m25950initializeblockedLaneVariant(l<? super BlockedLaneVariantKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            BlockedLaneVariantKt.Dsl.Companion companion = BlockedLaneVariantKt.Dsl.Companion;
            EnrichAlertQuestion.Answer.BlockedLaneVariant.Builder builderNewBuilder = EnrichAlertQuestion.Answer.BlockedLaneVariant.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            BlockedLaneVariantKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* renamed from: -initializehazardVariant, reason: not valid java name */
        public final EnrichAlertQuestion.Answer.HazardVariant m25951initializehazardVariant(l<? super HazardVariantKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            HazardVariantKt.Dsl.Companion companion = HazardVariantKt.Dsl.Companion;
            EnrichAlertQuestion.Answer.HazardVariant.Builder builderNewBuilder = EnrichAlertQuestion.Answer.HazardVariant.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            HazardVariantKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* renamed from: -initializenotThereVariant, reason: not valid java name */
        public final EnrichAlertQuestion.Answer.NotThereVariant m25952initializenotThereVariant(l<? super NotThereVariantKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            NotThereVariantKt.Dsl.Companion companion = NotThereVariantKt.Dsl.Companion;
            EnrichAlertQuestion.Answer.NotThereVariant.Builder builderNewBuilder = EnrichAlertQuestion.Answer.NotThereVariant.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            NotThereVariantKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: WazeSource */
        public final class BlockedLaneVariantKt {
            public static final BlockedLaneVariantKt INSTANCE = new BlockedLaneVariantKt();

            private BlockedLaneVariantKt() {
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final EnrichAlertQuestion.Answer.BlockedLaneVariant.Builder _builder;

                private Dsl(EnrichAlertQuestion.Answer.BlockedLaneVariant.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ EnrichAlertQuestion.Answer.BlockedLaneVariant _build() {
                    EnrichAlertQuestion.Answer.BlockedLaneVariant blockedLaneVariantBuild = this._builder.build();
                    x.e(blockedLaneVariantBuild, "build(...)");
                    return blockedLaneVariantBuild;
                }

                public final void clearSubType() {
                    this._builder.clearSubType();
                }

                public final AlerterSubType.BlockedLaneSubType getSubType() {
                    AlerterSubType.BlockedLaneSubType subType = this._builder.getSubType();
                    x.e(subType, "getSubType(...)");
                    return subType;
                }

                public final int getSubTypeValue() {
                    return this._builder.getSubTypeValue();
                }

                public final void setSubType(AlerterSubType.BlockedLaneSubType blockedLaneSubType) {
                    x.f(blockedLaneSubType, "value");
                    this._builder.setSubType(blockedLaneSubType);
                }

                public final void setSubTypeValue(int i2) {
                    this._builder.setSubTypeValue(i2);
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(EnrichAlertQuestion.Answer.BlockedLaneVariant.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(EnrichAlertQuestion.Answer.BlockedLaneVariant.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class HazardVariantKt {
            public static final HazardVariantKt INSTANCE = new HazardVariantKt();

            private HazardVariantKt() {
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final EnrichAlertQuestion.Answer.HazardVariant.Builder _builder;

                private Dsl(EnrichAlertQuestion.Answer.HazardVariant.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ EnrichAlertQuestion.Answer.HazardVariant _build() {
                    EnrichAlertQuestion.Answer.HazardVariant hazardVariantBuild = this._builder.build();
                    x.e(hazardVariantBuild, "build(...)");
                    return hazardVariantBuild;
                }

                public final void clearSubType() {
                    this._builder.clearSubType();
                }

                public final AlerterSubType.HazardSubType getSubType() {
                    AlerterSubType.HazardSubType subType = this._builder.getSubType();
                    x.e(subType, "getSubType(...)");
                    return subType;
                }

                public final int getSubTypeValue() {
                    return this._builder.getSubTypeValue();
                }

                public final void setSubType(AlerterSubType.HazardSubType hazardSubType) {
                    x.f(hazardSubType, "value");
                    this._builder.setSubType(hazardSubType);
                }

                public final void setSubTypeValue(int i2) {
                    this._builder.setSubTypeValue(i2);
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(EnrichAlertQuestion.Answer.HazardVariant.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(EnrichAlertQuestion.Answer.HazardVariant.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class NotThereVariantKt {
            public static final NotThereVariantKt INSTANCE = new NotThereVariantKt();

            private NotThereVariantKt() {
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final EnrichAlertQuestion.Answer.NotThereVariant.Builder _builder;

                private Dsl(EnrichAlertQuestion.Answer.NotThereVariant.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ EnrichAlertQuestion.Answer.NotThereVariant _build() {
                    EnrichAlertQuestion.Answer.NotThereVariant notThereVariantBuild = this._builder.build();
                    x.e(notThereVariantBuild, "build(...)");
                    return notThereVariantBuild;
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(EnrichAlertQuestion.Answer.NotThereVariant.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(EnrichAlertQuestion.Answer.NotThereVariant.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final EnrichAlertQuestion.Answer.Builder _builder;

            private Dsl(EnrichAlertQuestion.Answer.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ EnrichAlertQuestion.Answer _build() {
                EnrichAlertQuestion.Answer answerBuild = this._builder.build();
                x.e(answerBuild, "build(...)");
                return answerBuild;
            }

            public final void clearAnswerKey() {
                this._builder.clearAnswerKey();
            }

            public final void clearBlockedLane() {
                this._builder.clearBlockedLane();
            }

            public final void clearHazard() {
                this._builder.clearHazard();
            }

            public final void clearPointsAward() {
                this._builder.clearPointsAward();
            }

            public final void clearValidation() {
                this._builder.clearValidation();
            }

            public final void clearVariant() {
                this._builder.clearVariant();
            }

            public final String getAnswerKey() {
                String answerKey = this._builder.getAnswerKey();
                x.e(answerKey, "getAnswerKey(...)");
                return answerKey;
            }

            public final EnrichAlertQuestion.Answer.BlockedLaneVariant getBlockedLane() {
                EnrichAlertQuestion.Answer.BlockedLaneVariant blockedLane = this._builder.getBlockedLane();
                x.e(blockedLane, "getBlockedLane(...)");
                return blockedLane;
            }

            public final EnrichAlertQuestion.Answer.HazardVariant getHazard() {
                EnrichAlertQuestion.Answer.HazardVariant hazard = this._builder.getHazard();
                x.e(hazard, "getHazard(...)");
                return hazard;
            }

            public final int getPointsAward() {
                return this._builder.getPointsAward();
            }

            public final EnrichAlertQuestion.Answer.NotThereVariant getValidation() {
                EnrichAlertQuestion.Answer.NotThereVariant validation = this._builder.getValidation();
                x.e(validation, "getValidation(...)");
                return validation;
            }

            public final EnrichAlertQuestion.Answer.VariantCase getVariantCase() {
                EnrichAlertQuestion.Answer.VariantCase variantCase = this._builder.getVariantCase();
                x.e(variantCase, "getVariantCase(...)");
                return variantCase;
            }

            public final boolean hasBlockedLane() {
                return this._builder.hasBlockedLane();
            }

            public final boolean hasHazard() {
                return this._builder.hasHazard();
            }

            public final boolean hasValidation() {
                return this._builder.hasValidation();
            }

            public final void setAnswerKey(String str) {
                x.f(str, "value");
                this._builder.setAnswerKey(str);
            }

            public final void setBlockedLane(EnrichAlertQuestion.Answer.BlockedLaneVariant blockedLaneVariant) {
                x.f(blockedLaneVariant, "value");
                this._builder.setBlockedLane(blockedLaneVariant);
            }

            public final void setHazard(EnrichAlertQuestion.Answer.HazardVariant hazardVariant) {
                x.f(hazardVariant, "value");
                this._builder.setHazard(hazardVariant);
            }

            public final void setPointsAward(int i2) {
                this._builder.setPointsAward(i2);
            }

            public final void setValidation(EnrichAlertQuestion.Answer.NotThereVariant notThereVariant) {
                x.f(notThereVariant, "value");
                this._builder.setValidation(notThereVariant);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(EnrichAlertQuestion.Answer.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(EnrichAlertQuestion.Answer.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    private EnrichAlertQuestionKt() {
    }

    /* renamed from: -initializeanswer, reason: not valid java name */
    public final EnrichAlertQuestion.Answer m25949initializeanswer(l<? super AnswerKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AnswerKt.Dsl.Companion companion = AnswerKt.Dsl.Companion;
        EnrichAlertQuestion.Answer.Builder builderNewBuilder = EnrichAlertQuestion.Answer.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AnswerKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EnrichAlertQuestion.Builder _builder;

        /* compiled from: WazeSource */
        public final class AnswersProxy extends c {
            private AnswersProxy() {
            }
        }

        private Dsl(EnrichAlertQuestion.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EnrichAlertQuestion _build() {
            EnrichAlertQuestion enrichAlertQuestionBuild = this._builder.build();
            x.e(enrichAlertQuestionBuild, "build(...)");
            return enrichAlertQuestionBuild;
        }

        public final /* synthetic */ void addAllAnswers(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllAnswers(iterable);
        }

        public final /* synthetic */ void addAnswers(a aVar, EnrichAlertQuestion.Answer answer) {
            x.f(aVar, "<this>");
            x.f(answer, "value");
            this._builder.addAnswers(answer);
        }

        public final /* synthetic */ void clearAnswers(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearAnswers();
        }

        public final void clearStatsAlertId() {
            this._builder.clearStatsAlertId();
        }

        public final void clearStatsAlerterType() {
            this._builder.clearStatsAlerterType();
        }

        public final void clearTitleType() {
            this._builder.clearTitleType();
        }

        public final /* synthetic */ a getAnswers() {
            List<EnrichAlertQuestion.Answer> answersList = this._builder.getAnswersList();
            x.e(answersList, "getAnswersList(...)");
            return new a(answersList);
        }

        public final int getStatsAlertId() {
            return this._builder.getStatsAlertId();
        }

        public final AlerterType getStatsAlerterType() {
            AlerterType statsAlerterType = this._builder.getStatsAlerterType();
            x.e(statsAlerterType, "getStatsAlerterType(...)");
            return statsAlerterType;
        }

        public final int getStatsAlerterTypeValue() {
            return this._builder.getStatsAlerterTypeValue();
        }

        public final EnrichAlertQuestion.QuestionTitleType getTitleType() {
            EnrichAlertQuestion.QuestionTitleType titleType = this._builder.getTitleType();
            x.e(titleType, "getTitleType(...)");
            return titleType;
        }

        public final int getTitleTypeValue() {
            return this._builder.getTitleTypeValue();
        }

        public final /* synthetic */ void plusAssignAllAnswers(a<EnrichAlertQuestion.Answer, AnswersProxy> aVar, Iterable<EnrichAlertQuestion.Answer> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllAnswers(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAnswers(a<EnrichAlertQuestion.Answer, AnswersProxy> aVar, EnrichAlertQuestion.Answer answer) {
            x.f(aVar, "<this>");
            x.f(answer, "value");
            addAnswers(aVar, answer);
        }

        public final /* synthetic */ void setAnswers(a aVar, int i2, EnrichAlertQuestion.Answer answer) {
            x.f(aVar, "<this>");
            x.f(answer, "value");
            this._builder.setAnswers(i2, answer);
        }

        public final void setStatsAlertId(int i2) {
            this._builder.setStatsAlertId(i2);
        }

        public final void setStatsAlerterType(AlerterType alerterType) {
            x.f(alerterType, "value");
            this._builder.setStatsAlerterType(alerterType);
        }

        public final void setStatsAlerterTypeValue(int i2) {
            this._builder.setStatsAlerterTypeValue(i2);
        }

        public final void setTitleType(EnrichAlertQuestion.QuestionTitleType questionTitleType) {
            x.f(questionTitleType, "value");
            this._builder.setTitleType(questionTitleType);
        }

        public final void setTitleTypeValue(int i2) {
            this._builder.setTitleTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EnrichAlertQuestion.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EnrichAlertQuestion.Builder builder, o oVar) {
            this(builder);
        }
    }
}
