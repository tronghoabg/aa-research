package com.waze.ui;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.ui.af.ap;
import com.waze.ui.z.as;
import java.util.List;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f43416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43417b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f43418c;

    public /* synthetic */ u(Object obj, Object obj2, int i2) {
        this.f43418c = i2;
        this.f43416a = obj;
        this.f43417b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.compose.ui.platform.SoftwareKeyboardController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlinx.b.b] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlinx.b.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, kotlinx.b.b] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, kotlinx.b.b] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlinx.coroutines.af] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f43418c) {
            case 0:
                ((Boolean) obj).booleanValue();
                ?? r8 = this.f43416a;
                int i2 = af.f41795a;
                aj.z(r8, null, null, new ad((f) this.f43417b, null, 2, null), 3);
                return h.ab.f48028a;
            case 1:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                h.g.b.x.f(cacheDrawScope, "$this$drawWithCache");
                return cacheDrawScope.onDrawBehind(new com.waze.ui.z.k(Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)), (List) this.f43416a, Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), (State) this.f43417b, 0));
            case 2:
                return as.q(this.f43416a, this.f43417b, (IntSize) obj);
            case 3:
                this.f43417b.setValue(Dp.m11162boximpl(this.f43416a.mo2124toDpu2uoSUM(((Integer) obj).intValue())));
                return h.ab.f48028a;
            case 4:
                com.waze.ui.q.c cVar = (com.waze.ui.q.c) obj;
                h.g.b.x.f(cVar, "it");
                if (h.g.b.x.n(cVar, com.waze.ui.q.a.f43232a)) {
                    this.f43417b.invoke();
                } else {
                    if (!h.g.b.x.n(cVar, com.waze.ui.q.b.f43233a)) {
                        throw new h.i();
                    }
                    this.f43416a.invoke();
                }
                return h.ab.f48028a;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r0 = this.f43417b;
                int i3 = ap.f41852a;
                r0.setValue(Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    this.f43416a.invoke(com.waze.ui.af.i.f41889a);
                }
                return h.ab.f48028a;
            case 6:
                com.waze.ui.af.q qVar = (com.waze.ui.af.q) obj;
                int i4 = ap.f41852a;
                h.g.b.x.f(qVar, "it");
                ?? r02 = this.f43417b;
                if (r02 != 0) {
                    r02.hide();
                }
                ?? r7 = this.f43416a;
                com.waze.ui.af.x xVarA = qVar.a();
                com.waze.ui.af.x xVar = com.waze.ui.af.x.f41917a;
                com.waze.ui.af.c cVar2 = com.waze.ui.af.c.f41880a;
                int iOrdinal = xVarA.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    r7.invoke(new com.waze.ui.af.h(qVar));
                } else {
                    if (iOrdinal != 2) {
                        throw new h.i();
                    }
                    r7.invoke(new com.waze.ui.af.l((com.waze.ui.af.y) qVar));
                }
                return h.ab.f48028a;
            case 7:
                return com.waze.ui.u.g.g(this.f43417b, this.f43416a, (String) obj);
            case 8:
                Context context = (Context) obj;
                h.g.b.x.f(context, "context");
                EtaLabelDefinitions.PinAlignment pinAlignment = EtaLabelDefinitions.PinAlignment.TOP_RIGHT;
                int iOrdinal2 = ((EtaLabelDefinitions.PinAlignment) this.f43416a).ordinal();
                return new com.waze.design_components.e.c(context, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? com.waze.design_components.e.b.f23459d : com.waze.design_components.e.b.f23459d : com.waze.design_components.e.b.f23458c : com.waze.design_components.e.b.f23457b : com.waze.design_components.e.b.f23456a, (com.waze.design_components.e.a) this.f43417b);
            case 9:
                kotlinx.b.a.a aVar = (kotlinx.b.a.a) obj;
                h.g.b.x.f(aVar, "$this$buildSerialDescriptor");
                kotlinx.b.a.a.g(aVar, "key", this.f43417b.getDescriptor());
                kotlinx.b.a.a.g(aVar, "value", this.f43416a.getDescriptor());
                return h.ab.f48028a;
            default:
                kotlinx.b.a.a aVar2 = (kotlinx.b.a.a) obj;
                h.g.b.x.f(aVar2, "$this$buildClassSerialDescriptor");
                kotlinx.b.a.a.g(aVar2, "first", this.f43417b.getDescriptor());
                kotlinx.b.a.a.g(aVar2, "second", this.f43416a.getDescriptor());
                return h.ab.f48028a;
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f43418c = i2;
        this.f43417b = obj;
        this.f43416a = obj2;
    }
}
