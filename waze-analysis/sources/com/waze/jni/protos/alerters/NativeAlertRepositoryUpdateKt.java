package com.waze.jni.protos.alerters;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.alerters.NativeAlertRepositoryUpdate;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeAlertRepositoryUpdateKt {
    public static final NativeAlertRepositoryUpdateKt INSTANCE = new NativeAlertRepositoryUpdateKt();

    private NativeAlertRepositoryUpdateKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeAlertRepositoryUpdate.Builder _builder;

        /* compiled from: WazeSource */
        public final class DescriptorsProxy extends c {
            private DescriptorsProxy() {
            }
        }

        private Dsl(NativeAlertRepositoryUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeAlertRepositoryUpdate _build() {
            NativeAlertRepositoryUpdate nativeAlertRepositoryUpdateBuild = this._builder.build();
            x.e(nativeAlertRepositoryUpdateBuild, "build(...)");
            return nativeAlertRepositoryUpdateBuild;
        }

        public final /* synthetic */ void addAllDescriptors(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllDescriptors(iterable);
        }

        public final /* synthetic */ void addDescriptors(a aVar, NativeAlertDescriptor nativeAlertDescriptor) {
            x.f(aVar, "<this>");
            x.f(nativeAlertDescriptor, "value");
            this._builder.addDescriptors(nativeAlertDescriptor);
        }

        public final /* synthetic */ void clearDescriptors(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearDescriptors();
        }

        public final /* synthetic */ a getDescriptors() {
            List<NativeAlertDescriptor> descriptorsList = this._builder.getDescriptorsList();
            x.e(descriptorsList, "getDescriptorsList(...)");
            return new a(descriptorsList);
        }

        public final /* synthetic */ void plusAssignAllDescriptors(a<NativeAlertDescriptor, DescriptorsProxy> aVar, Iterable<NativeAlertDescriptor> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllDescriptors(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignDescriptors(a<NativeAlertDescriptor, DescriptorsProxy> aVar, NativeAlertDescriptor nativeAlertDescriptor) {
            x.f(aVar, "<this>");
            x.f(nativeAlertDescriptor, "value");
            addDescriptors(aVar, nativeAlertDescriptor);
        }

        public final /* synthetic */ void setDescriptors(a aVar, int i2, NativeAlertDescriptor nativeAlertDescriptor) {
            x.f(aVar, "<this>");
            x.f(nativeAlertDescriptor, "value");
            this._builder.setDescriptors(i2, nativeAlertDescriptor);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeAlertRepositoryUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NativeAlertRepositoryUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
