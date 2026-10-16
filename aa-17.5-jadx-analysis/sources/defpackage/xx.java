package defpackage;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.car.app.IOnDoneCallback;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.auto.components.feedback.hats.HatsDownloadService;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.display.CarRegionId;
import j$.time.Instant;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class xx implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public xx(ajmd ajmdVar, erb erbVar, String str, Object obj, int i) {
        this.e = i;
        this.d = ajmdVar;
        this.a = erbVar;
        this.c = str;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.Object, rml] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx.run():void");
    }

    public /* synthetic */ xx(Context context, Instant instant, qrn qrnVar, CountDownLatch countDownLatch, int i) {
        this.e = i;
        this.b = context;
        this.a = instant;
        this.d = qrnVar;
        this.c = countDownLatch;
    }

    public xx(View view, lds ldsVar, ebw ebwVar, ValueAnimator valueAnimator, int i) {
        this.e = i;
        this.d = view;
        this.c = ldsVar;
        this.a = ebwVar;
        this.b = valueAnimator;
    }

    public /* synthetic */ xx(WorkDatabase workDatabase, fny fnyVar, List list, fiy fiyVar, int i) {
        this.e = i;
        this.d = workDatabase;
        this.a = fnyVar;
        this.c = list;
        this.b = fiyVar;
    }

    public /* synthetic */ xx(HatsDownloadService hatsDownloadService, String str, PersistableBundle persistableBundle, String str2, int i) {
        this.e = i;
        this.d = hatsDownloadService;
        this.a = str;
        this.b = persistableBundle;
        this.c = str2;
    }

    public /* synthetic */ xx(ept eptVar, IOnDoneCallback iOnDoneCallback, String str, xy xyVar, int i) {
        this.e = i;
        this.a = eptVar;
        this.b = iOnDoneCallback;
        this.c = str;
        this.d = xyVar;
    }

    public xx(gz gzVar, aagd aagdVar, MenuItem menuItem, hg hgVar, int i) {
        this.e = i;
        this.b = gzVar;
        this.d = aagdVar;
        this.c = menuItem;
        this.a = hgVar;
    }

    public /* synthetic */ xx(ikp ikpVar, RadioProgramInfo radioProgramInfo, List list, List list2, int i) {
        this.e = i;
        this.b = ikpVar;
        this.d = radioProgramInfo;
        this.a = list;
        this.c = list2;
    }

    public /* synthetic */ xx(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = obj4;
    }

    public xx(Object obj, yze yzeVar, yzf yzfVar, String str, int i) {
        this.e = i;
        this.d = yzeVar;
        this.a = yzfVar;
        this.c = str;
        this.b = obj;
    }

    public /* synthetic */ xx(jde jdeVar, jdd jddVar, qtk qtkVar, ByteBuffer byteBuffer, int i) {
        this.e = i;
        this.d = jdeVar;
        this.b = jddVar;
        this.a = qtkVar;
        this.c = byteBuffer;
    }

    public /* synthetic */ xx(qau qauVar, pzw pzwVar, qaa qaaVar, qas qasVar, int i) {
        this.e = i;
        this.c = qauVar;
        this.b = pzwVar;
        this.d = qaaVar;
        this.a = qasVar;
    }

    public /* synthetic */ xx(rlz rlzVar, rml rmlVar, EditorInfo editorInfo, CarRegionId carRegionId, int i) {
        this.e = i;
        this.a = rlzVar;
        this.c = rmlVar;
        this.b = editorInfo;
        this.d = carRegionId;
    }

    public /* synthetic */ xx(yzy yzyVar, ComponentName componentName, nuo nuoVar, nnk nnkVar, int i) {
        this.e = i;
        this.c = yzyVar;
        this.b = componentName;
        this.a = nuoVar;
        this.d = nnkVar;
    }
}
