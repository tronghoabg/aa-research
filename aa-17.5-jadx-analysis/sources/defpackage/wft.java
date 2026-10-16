package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wft implements wev {
    private final /* synthetic */ int a;

    public wft(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wfv] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final InputStream b(rdx rdxVar) throws IOException {
        InputStream inputStreamD = rdxVar.d.d((Uri) rdxVar.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamD);
        ?? r2 = rdxVar.c;
        if (!r2.isEmpty()) {
            int i = wes.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                wfx wfxVarA = ((wfz) it.next()).a();
                if (wfxVarA != null) {
                    arrayList2.add(wfxVarA);
                }
            }
            wes wesVar = !arrayList2.isEmpty() ? new wes(inputStreamD, arrayList2) : null;
            if (wesVar != null) {
                arrayList.add(wesVar);
            }
        }
        for (wga wgaVar : rdxVar.e) {
            arrayList.add(wgaVar.c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.wev
    public final /* synthetic */ Object a(rdx rdxVar) throws IOException {
        if (this.a == 0) {
            return b(rdxVar);
        }
        wfs wfsVar = new wfs();
        wfsVar.b();
        File fileA = wfsVar.a(rdxVar);
        yrm.g(fileA);
        return new RandomAccessFile(fileA, "rw");
    }
}
