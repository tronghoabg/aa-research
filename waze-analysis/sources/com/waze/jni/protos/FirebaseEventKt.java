package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.FirebaseEvent;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FirebaseEventKt {
    public static final FirebaseEventKt INSTANCE = new FirebaseEventKt();

    private FirebaseEventKt() {
    }

    /* renamed from: -initializeparam, reason: not valid java name */
    public final FirebaseEvent.Param m25147initializeparam(l<? super ParamKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ParamKt.Dsl.Companion companion = ParamKt.Dsl.Companion;
        FirebaseEvent.Param.Builder builderNewBuilder = FirebaseEvent.Param.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ParamKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class ParamKt {
        public static final ParamKt INSTANCE = new ParamKt();

        private ParamKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final FirebaseEvent.Param.Builder _builder;

            private Dsl(FirebaseEvent.Param.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ FirebaseEvent.Param _build() {
                FirebaseEvent.Param paramBuild = this._builder.build();
                x.e(paramBuild, "build(...)");
                return paramBuild;
            }

            public final void clearName() {
                this._builder.clearName();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final String getName() {
                String name = this._builder.getName();
                x.e(name, "getName(...)");
                return name;
            }

            public final String getValue() {
                String value = this._builder.getValue();
                x.e(value, "getValue(...)");
                return value;
            }

            public final void setName(String str) {
                x.f(str, "value");
                this._builder.setName(str);
            }

            public final void setValue(String str) {
                x.f(str, "value");
                this._builder.setValue(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(FirebaseEvent.Param.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(FirebaseEvent.Param.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FirebaseEvent.Builder _builder;

        /* compiled from: WazeSource */
        public final class ParamsProxy extends c {
            private ParamsProxy() {
            }
        }

        private Dsl(FirebaseEvent.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ FirebaseEvent _build() {
            FirebaseEvent firebaseEventBuild = this._builder.build();
            x.e(firebaseEventBuild, "build(...)");
            return firebaseEventBuild;
        }

        public final /* synthetic */ void addAllParams(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllParams(iterable);
        }

        public final /* synthetic */ void addParams(a aVar, FirebaseEvent.Param param) {
            x.f(aVar, "<this>");
            x.f(param, "value");
            this._builder.addParams(param);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearParams(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearParams();
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final /* synthetic */ a getParams() {
            List<FirebaseEvent.Param> paramsList = this._builder.getParamsList();
            x.e(paramsList, "getParamsList(...)");
            return new a(paramsList);
        }

        public final /* synthetic */ void plusAssignAllParams(a<FirebaseEvent.Param, ParamsProxy> aVar, Iterable<FirebaseEvent.Param> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllParams(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignParams(a<FirebaseEvent.Param, ParamsProxy> aVar, FirebaseEvent.Param param) {
            x.f(aVar, "<this>");
            x.f(param, "value");
            addParams(aVar, param);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final /* synthetic */ void setParams(a aVar, int i2, FirebaseEvent.Param param) {
            x.f(aVar, "<this>");
            x.f(param, "value");
            this._builder.setParams(i2, param);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(FirebaseEvent.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(FirebaseEvent.Builder builder, o oVar) {
            this(builder);
        }
    }
}
