package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.auto.components.metadataview.MetadataView;

/* loaded from: classes2.dex */
public final class lyx implements iej {
    final /* synthetic */ MetadataView a;

    public lyx(MetadataView metadataView) {
        this.a = metadataView;
    }

    @Override // defpackage.iej
    public final boolean fh(hwt hwtVar, Object obj, iev ievVar) {
        ype ypeVar = (ype) ((ype) ((ype) MetadataView.a.h()).p(hwtVar)).ai(4461);
        MetadataView metadataView = this.a;
        ypeVar.y("onLoadFailed currentModel=%s", metadataView.j);
        if (hwtVar != null) {
            hwtVar.b("GH.MetadataView");
        }
        metadataView.h.removeCallbacks(metadataView.i);
        metadataView.a(false);
        metadataView.g(metadataView.j);
        lyy lyyVar = metadataView.f;
        if (lyyVar != null) {
            lyyVar.f();
        }
        return false;
    }

    @Override // defpackage.iej
    public final /* bridge */ /* synthetic */ boolean fi(Object obj, Object obj2, iev ievVar, int i) {
        Bitmap bitmap = (Bitmap) obj;
        ype ypeVar = (ype) MetadataView.a.l().ai(4462);
        MetadataView metadataView = this.a;
        ypeVar.y("onResourceReady currentModel=%s", metadataView.j);
        metadataView.h.removeCallbacks(metadataView.i);
        metadataView.c.setVisibility(0);
        metadataView.g(metadataView.j);
        lyy lyyVar = metadataView.f;
        if (lyyVar != null) {
            lyyVar.h(bitmap);
        }
        return false;
    }
}
