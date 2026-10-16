package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wfu implements wev {
    public zhe[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wfv] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.wev
    public final /* bridge */ /* synthetic */ Object a(rdx rdxVar) throws IOException {
        OutputStream outputStreamL = rdxVar.d.l((Uri) rdxVar.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamL);
        ?? r2 = rdxVar.c;
        if (!r2.isEmpty()) {
            int i = wet.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                wfy wfyVarB = ((wfz) it.next()).b();
                if (wfyVarB != null) {
                    arrayList2.add(wfyVarB);
                }
            }
            wet wetVar = !arrayList2.isEmpty() ? new wet(outputStreamL, arrayList2) : null;
            if (wetVar != null) {
                arrayList.add(wetVar);
            }
        }
        for (wga wgaVar : rdxVar.e) {
            arrayList.add(wgaVar.d());
        }
        Collections.reverse(arrayList);
        zhe[] zheVarArr = this.a;
        if (zheVarArr != null) {
            zhe zheVar = zheVarArr[0];
            OutputStream outputStream = (OutputStream) yrm.an(arrayList);
            if (outputStream instanceof wfl) {
                zheVar.b = (wfl) outputStream;
                zheVar.a = (OutputStream) arrayList.get(0);
            }
        }
        return (OutputStream) arrayList.get(0);
    }
}
