package com.waze.car_lib.r;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.jni.protos.navigate.DriveTo;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class fl implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21645a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21646b;

    public /* synthetic */ fl(Object obj, int i2) {
        this.f21646b = i2;
        this.f21645a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        Intent data;
        int intExtra;
        Object objD;
        int i2 = 0;
        switch (this.f21646b) {
            case 0:
                return fp.g((fp) this.f21645a);
            case 1:
                return d.o((d) this.f21645a, (com.waze.av.d.f) obj);
            case 2:
                List list = (List) obj;
                h.g.b.x.f(list, "result");
                this.f21645a.a(list);
                return h.ab.f48028a;
            case 3:
                this.f21645a.setIntValue((int) (((IntSize) obj).m11343unboximpl() >> 32));
                return h.ab.f48028a;
            case 4:
                ActivityResult activityResult = (ActivityResult) obj;
                h.g.b.x.f(activityResult, "it");
                if (activityResult.getResultCode() == -1) {
                    ((com.waze.search.h.bx) this.f21645a).D();
                }
                return h.ab.f48028a;
            case 5:
                this.f21645a.a(Boolean.valueOf(h.g.b.x.n((Boolean) obj, true)));
                return h.ab.f48028a;
            case 6:
                ActivityResult activityResult2 = (ActivityResult) obj;
                h.g.b.x.f(activityResult2, "result");
                SpeechRecognizerActivity.s(activityResult2.getResultCode(), activityResult2.getData(), new com.waze.search.f.c(this.f21645a, i2));
                return h.ab.f48028a;
            case 7:
                ActivityResult activityResult3 = (ActivityResult) obj;
                h.g.b.x.f(activityResult3, "it");
                if (activityResult3.getResultCode() == -1 && (data = activityResult3.getData()) != null && (intExtra = data.getIntExtra("SearchMode", -1)) != -1) {
                    ((com.waze.search.h.bx) this.f21645a).v(intExtra == 3);
                }
                return h.ab.f48028a;
            case 8:
                String str = (String) obj;
                h.g.b.x.f(str, "it");
                this.f21645a.invoke(str);
                return h.ab.f48028a;
            case 9:
                int i3 = com.waze.search.v2.cu.f36302a;
                this.f21645a.setIntValue((int) (((IntSize) obj).m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                return h.ab.f48028a;
            case 10:
                com.waze.speech.k kVar = (com.waze.speech.k) obj;
                int i4 = com.waze.search.v2.cu.f36302a;
                h.g.b.x.f(kVar, "it");
                this.f21645a.invoke(kVar);
                return h.ab.f48028a;
            case 11:
                h.g.b.x.f((Context) obj, "it");
                return ((com.waze.search.v2.g) this.f21645a).a();
            case 12:
                h.g.b.x.f((String) obj, "it");
                this.f21645a.invoke("DESTINATION_PIN_ID");
                return h.ab.f48028a;
            case 13:
                com.waze.av.d.i iVar = (com.waze.av.d.i) obj;
                h.g.b.x.f(iVar, "it");
                return Boolean.valueOf(h.g.b.x.n(iVar.c(), this.f21645a));
            case 14:
                com.waze.av.d.i iVar2 = (com.waze.av.d.i) obj;
                h.g.b.x.f(iVar2, "it");
                return Boolean.valueOf(h.g.b.x.n(iVar2.c(), this.f21645a));
            case 15:
                int i5 = com.waze.search.v2.df.f36355a;
                h.g.b.x.f((Context) obj, "it");
                return ((com.waze.search.v2.g) this.f21645a).a();
            case 16:
                List list2 = (List) obj;
                kotlinx.coroutines.b.bn bnVar = ((com.waze.search.v2.fi) this.f21645a).A;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, com.waze.search.v2.dd.s((com.waze.search.v2.dd) objD, null, null, null, null, null, null, null, false, null, null, null, null, null, 0, 0L, false, false, null, null, false, list2, 2097151)));
                return h.ab.f48028a;
            case 17:
                com.waze.av.b.n nVar = (com.waze.av.b.n) obj;
                h.g.b.x.f(nVar, "it");
                return Boolean.valueOf(h.g.b.x.n(nVar.e().c().c(), this.f21645a) && (nVar instanceof com.waze.av.b.k));
            case 18:
                return com.waze.navigate.location_preview.ay.U((com.waze.navigate.location_preview.ay) obj, 0, null, null, (DriveTo.DangerZoneType) this.f21645a, null, -33554433);
            case 19:
                return com.waze.navigate.location_preview.ay.U((com.waze.navigate.location_preview.ay) obj, 0, null, null, null, (com.waze.realtime_report_feedback.c) this.f21645a, -536870913);
            default:
                return com.waze.navigate.location_preview.ay.U((com.waze.navigate.location_preview.ay) obj, 0, (h.o.a) this.f21645a, null, null, null, -524289);
        }
    }
}
