package a;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.bi;
import android.support.v4.app.da;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.muxer.MuxerUtil;
import androidx.navigation.PopUpToBuilder;
import com.airbnb.lottie.b.w;
import com.airbnb.lottie.h;
import com.google.android.gms.common.api.internal.av;
import com.waze.R;
import com.waze.a.af;
import com.waze.ads.a.f;
import com.waze.authentication.aj;
import com.waze.authentication.al;
import com.waze.av.a.o;
import com.waze.av.a.p;
import com.waze.av.b.aa;
import com.waze.av.b.c;
import com.waze.bw.b.a.n;
import com.waze.main_screen.u.a.d;
import com.waze.main_screen.u.ae;
import com.waze.map.b.ch;
import com.waze.map.b.cj;
import com.waze.map.b.ed;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.ds;
import com.waze.shared_infra.i.e;
import com.waze.strings.DisplayStrings;
import com.waze.t.a.v;
import com.waze.u.a.q;
import com.waze.u.a.r;
import com.waze.u.a.s;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class a {
    public static /* synthetic */ com.waze.shared_infra.p.a B(b bVar, org.a.d.h.a aVar) {
        x.f(bVar, "$this$single");
        x.f(aVar, "it");
        e eVarD = com.waze.shared_infra.i.a.d("MapHelperThread");
        x.e(eVarD, "create(...)");
        int i2 = ar.f48106a;
        return new com.waze.shared_infra.p.a("MapHelperThread", 10, eVarD, (com.waze.shared_infra.i.b) bVar.a(new m(com.waze.shared_infra.i.b.class), null, null));
    }

    public static /* synthetic */ ab C(PopUpToBuilder popUpToBuilder) {
        x.f(popUpToBuilder, "$this$popUpTo");
        popUpToBuilder.setInclusive(true);
        return ab.f48028a;
    }

    public static /* synthetic */ ab D(com.waze.app_nav.hub.b.e eVar) {
        eVar.b(false);
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.waze.av.b.m F(f fVar) {
        String str = null;
        String str2 = null;
        String str3 = null;
        o oVar = new o(fVar.k(), fVar.l(), str, str2, str3, null, 60);
        String str4 = null;
        return new com.waze.av.b.m(new p(new com.waze.av.a.a(null, str, str2, str3, 0 == true ? 1 : 0, str4, null, 127), fVar.b(), oVar));
    }

    public static /* synthetic */ h G(w wVar) {
        return (h) wVar.getValue();
    }

    public static final StackTraceElement H() {
        Exception exc = new Exception();
        x.e(CmcdData.OBJECT_TYPE_AUDIO_ONLY, "getSimpleName(...)");
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(CmcdData.OBJECT_TYPE_AUDIO_ONLY), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static /* synthetic */ List I(aa aaVar) {
        List listB = aaVar.b();
        ArrayList arrayList = new ArrayList(i.q(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(aaVar.a(), (c) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ boolean J(com.waze.ca.c cVar) {
        if (!cVar.hasCurrencyCode()) {
            return false;
        }
        try {
            Currency.getInstance(cVar.getCurrencyCode());
            return cVar.hasUnits() && cVar.hasNanos() && cVar.getUnits() + ((long) cVar.getNanos()) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ ae K(d dVar) {
        if (x.n(dVar, com.waze.main_screen.u.a.a.f27651a)) {
            return ae.f27676a;
        }
        if (dVar instanceof com.waze.main_screen.u.a.b) {
            return ae.f27678c;
        }
        if (dVar instanceof com.waze.main_screen.u.a.c) {
            return ae.f27677b;
        }
        throw new h.i();
    }

    public static /* synthetic */ void L(int i2) {
        if (i2 == 0) {
            throw null;
        }
    }

    public static final da M(ViewGroup viewGroup, bi biVar) {
        x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        x.f(biVar, "factory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof da) {
            return (da) tag;
        }
        x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        da daVar = new da(viewGroup);
        x.e(daVar, "createController(...)");
        viewGroup.setTag(R.id.special_effects_controller_view_tag, daVar);
        return daVar;
    }

    public static /* synthetic */ void N(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            f((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else {
            if (!(obj instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) obj).release();
        }
    }

    public static String O(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] P(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static boolean Q(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static com.google.android.gms.common.internal.a.c R(byte[] bArr, Parcelable.Creator creator) {
        av.m(creator);
        int length = bArr.length;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, length);
        parcelObtain.setDataPosition(0);
        com.google.android.gms.common.internal.a.c cVar = (com.google.android.gms.common.internal.a.c) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return cVar;
    }

    public static com.google.android.gms.common.internal.a.c S(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return R(byteArrayExtra, creator);
    }

    public static /* synthetic */ s T(com.waze.calendar.b bVar) {
        com.waze.u.a.n nVarNewBuilder = s.newBuilder();
        x.f(nVarNewBuilder, "builder");
        if (bVar instanceof com.waze.t.a.w) {
            throw null;
        }
        if (!(bVar instanceof v)) {
            throw new h.i();
        }
        com.waze.u.a.p pVarNewBuilder = r.newBuilder();
        x.f(pVarNewBuilder, "builder");
        com.waze.u.a.a aVarNewBuilder = com.waze.u.a.b.newBuilder();
        x.f(aVarNewBuilder, "builder");
        com.google.v.v vVarQ = com.google.v.v.q(((v) bVar).a().a());
        x.e(vVarQ, "copyFrom(...)");
        x.f(vVarQ, "value");
        aVarNewBuilder.a(vVarQ);
        com.waze.u.a.b bVarBuild = aVarNewBuilder.build();
        x.e(bVarBuild, "build(...)");
        com.waze.u.a.b bVar2 = bVarBuild;
        x.f(bVar2, "value");
        pVarNewBuilder.a(bVar2);
        q qVar = q.GOOGLE_CLOUD_SPEECH_TO_TEXT;
        x.f(qVar, "value");
        pVarNewBuilder.b(qVar);
        r rVarBuild = pVarNewBuilder.build();
        x.e(rVarBuild, "build(...)");
        r rVar = rVarBuild;
        x.f(rVar, "value");
        nVarNewBuilder.a(rVar);
        s sVarBuild = nVarNewBuilder.build();
        x.e(sVarBuild, "build(...)");
        return sVarBuild;
    }

    public static /* synthetic */ int a(boolean z) {
        return z ? DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS : DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
    }

    public static /* synthetic */ int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ boolean c(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int e(double d2) {
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public static /* synthetic */ void f(ExecutorService executorService) throws InterruptedException {
        if (executorService == ForkJoinPool.commonPool() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean g(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean h(com.waze.uid.e.e eVar) {
        return eVar == com.waze.uid.e.e.f44481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String i(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    public static /* synthetic */ ab k(h.g.a.a aVar) {
        aVar.invoke();
        return ab.f48028a;
    }

    public static /* synthetic */ ab o(h.g.a.a aVar, h.g.a.a aVar2, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar) {
        x.f(cVar, "dialogActions");
        x.f(dVar, "dialogCta");
        if (x.n(((com.waze.z.a.c.a) cVar).a(), dVar)) {
            aVar.invoke();
        } else {
            aVar2.invoke();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ l q(State state) {
        return (l) state.getValue();
    }

    public static /* synthetic */ ab r(long j2, float f2, DrawScope drawScope) {
        x.f(drawScope, "$this$drawBehind");
        long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2 / 2.0f);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)));
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), (jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(r0) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f2, 0, null, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL, null);
        return ab.f48028a;
    }

    public static /* synthetic */ ab s(String str) {
        x.f(str, "it");
        return ab.f48028a;
    }

    public static /* synthetic */ h.g.a.a t(State state) {
        return (h.g.a.a) state.getValue();
    }

    public static /* synthetic */ com.waze.settings.d.f v(b bVar, org.a.d.h.a aVar) {
        x.f(bVar, "$this$factory");
        x.f(aVar, "it");
        int i2 = ar.f48106a;
        return new com.waze.settings.d.f((com.waze.shared_infra.o.a) bVar.a(new m(com.waze.shared_infra.o.a.class), null, null), (ds) bVar.a(new m(ds.class), null, null), (SettingsNativeManager) bVar.a(new m(SettingsNativeManager.class), null, null));
    }

    public static /* synthetic */ ed w(b bVar, org.a.d.h.a aVar) {
        x.f(bVar, "$this$scoped");
        x.f(aVar, "it");
        int i2 = ar.f48106a;
        return ((cj) bVar.a(new m(cj.class), null, null)).a((e) bVar.a(new m(e.class), null, null), ch.f28144a);
    }

    public static /* synthetic */ ab x(com.waze.z.a.c.d dVar, h.g.a.a aVar, h.g.a.a aVar2, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar2) {
        x.f(cVar, "<unused var>");
        x.f(dVar2, "cta");
        if (x.n(dVar2, dVar)) {
            aVar.invoke();
        } else {
            aVar2.invoke();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ boolean y(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static /* synthetic */ aj z(b bVar) {
        int i2 = ar.f48106a;
        return af.n((al) bVar.a(new m(al.class), null, null));
    }
}
