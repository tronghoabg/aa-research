package com.waze.jni.protos.rtalerts;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.rtalerts.RtAlertItemList;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertItemListKt {
    public static final RtAlertItemListKt INSTANCE = new RtAlertItemListKt();

    private RtAlertItemListKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RtAlertItemList.Builder _builder;

        /* compiled from: WazeSource */
        public final class RtAlertItemProxy extends c {
            private RtAlertItemProxy() {
            }
        }

        private Dsl(RtAlertItemList.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RtAlertItemList _build() {
            RtAlertItemList rtAlertItemListBuild = this._builder.build();
            x.e(rtAlertItemListBuild, "build(...)");
            return rtAlertItemListBuild;
        }

        public final /* synthetic */ void addAllRtAlertItem(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllRtAlertItem(iterable);
        }

        public final /* synthetic */ void addRtAlertItem(a aVar, RtAlertItem rtAlertItem) {
            x.f(aVar, "<this>");
            x.f(rtAlertItem, "value");
            this._builder.addRtAlertItem(rtAlertItem);
        }

        public final /* synthetic */ void clearRtAlertItem(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearRtAlertItem();
        }

        public final /* synthetic */ a getRtAlertItem() {
            List<RtAlertItem> rtAlertItemList = this._builder.getRtAlertItemList();
            x.e(rtAlertItemList, "getRtAlertItemList(...)");
            return new a(rtAlertItemList);
        }

        public final /* synthetic */ void plusAssignAllRtAlertItem(a<RtAlertItem, RtAlertItemProxy> aVar, Iterable<RtAlertItem> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllRtAlertItem(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignRtAlertItem(a<RtAlertItem, RtAlertItemProxy> aVar, RtAlertItem rtAlertItem) {
            x.f(aVar, "<this>");
            x.f(rtAlertItem, "value");
            addRtAlertItem(aVar, rtAlertItem);
        }

        public final /* synthetic */ void setRtAlertItem(a aVar, int i2, RtAlertItem rtAlertItem) {
            x.f(aVar, "<this>");
            x.f(rtAlertItem, "value");
            this._builder.setRtAlertItem(i2, rtAlertItem);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RtAlertItemList.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RtAlertItemList.Builder builder, o oVar) {
            this(builder);
        }
    }
}
