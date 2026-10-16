package defpackage;

import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class lsu implements lju {
    final /* synthetic */ lsv a;

    public lsu(lsv lsvVar) {
        this.a = lsvVar;
    }

    @Override // defpackage.lju
    public final void a(ComponentName componentName, ComponentName componentName2) {
        this.a.c(false);
    }

    @Override // defpackage.lju
    public final void b() {
        lsv lsvVar = this.a;
        lsvVar.c(false);
        ljv ljvVar = lsvVar.b;
        AaPlaybackState aaPlaybackStateC = ljvVar.c();
        if (aaPlaybackStateC != null) {
            h(aaPlaybackStateC);
        }
        if (ljvVar.b() != null) {
            g(ljvVar.b());
        }
    }

    @Override // defpackage.lju
    public final void g(lmd lmdVar) {
        Bitmap bitmap;
        if (lmdVar == null) {
            return;
        }
        lmc lmcVarH = lmdVar.h();
        yph yphVar = lsv.a;
        ((ype) yphVar.l().ai((char) 4261)).y("received %s", lmcVarH);
        if (TextUtils.isEmpty(lmcVarH.S()) && TextUtils.isEmpty(lmcVarH.R())) {
            ((ype) yphVar.l().ai((char) 4263)).u("Invalid metadata, no title or subtitle, canceling stream item");
            this.a.a();
            return;
        }
        lsv lsvVar = this.a;
        ljv ljvVar = lsvVar.b;
        ljx ljxVarA = ljvVar.a();
        CharSequence charSequenceS = lmcVarH.S();
        String string = charSequenceS == null ? null : charSequenceS.toString();
        CharSequence charSequenceR = lmcVarH.R();
        String string2 = charSequenceR == null ? null : charSequenceR.toString();
        Bitmap bitmapO = lmcVarH.O();
        Bitmap bitmapCreateScaledBitmap = bitmapO != null ? Bitmap.createScaledBitmap(bitmapO, 256, 256, false) : null;
        String str = ljxVarA.c;
        String strB = lnm.y().b();
        int i = ljxVarA.e;
        String str2 = ljxVarA.b;
        boolean z = lmdVar.O("android.media.metadata.ADVERTISEMENT") != 0;
        Uri uriP = lmdVar.h().P();
        lsp lspVar = lsvVar.f;
        boolean z2 = lspVar == null;
        if (lspVar != null) {
            z2 = (bitmapCreateScaledBitmap == null || (bitmap = lspVar.d) == null) ? bitmapCreateScaledBitmap != lspVar.d : !bitmapCreateScaledBitmap.sameAs(bitmap);
        }
        if (ljt.c(lmcVarH, lsvVar.g)) {
            if (!z2) {
                return;
            } else {
                z2 = true;
            }
        }
        ((ype) yphVar.l().ai(4262)).N("creating new media data. previous description = %s, artIsDifferent=%b", lsvVar.g, z2);
        lsvVar.h = false;
        int i2 = ljvVar.a().i;
        if (true == str.equals(strB)) {
            str = "";
        }
        lsvVar.f = new lsp(str, string, string2, bitmapCreateScaledBitmap, uriP, i2, i, str2, lsvVar.e(), z);
        lsvVar.g = lmcVarH;
        lsvVar.b(lsvVar.f);
    }

    @Override // defpackage.lju
    public final void h(AaPlaybackState aaPlaybackState) {
        boolean z;
        if (aaPlaybackState == null) {
            return;
        }
        lsv lsvVar = this.a;
        int iQ = aaPlaybackState.Q();
        lsvVar.d(iQ);
        long jR = aaPlaybackState.R() & 567;
        ArrayList arrayList = new ArrayList(aaPlaybackState.V());
        long j = lsvVar.d;
        List list = lsvVar.e;
        lsvVar.d = jR;
        lsvVar.e = arrayList;
        if (iQ != lsvVar.c || jR != j || list.size() != arrayList.size()) {
            z = true;
            break;
        }
        z = false;
        for (int i = 0; i < list.size(); i++) {
            AaPlaybackState.AaCustomAction aaCustomAction = (AaPlaybackState.AaCustomAction) list.get(i);
            AaPlaybackState.AaCustomAction aaCustomAction2 = (AaPlaybackState.AaCustomAction) arrayList.get(i);
            if (!Objects.equals((String) spu.aT(aaCustomAction.P(), new lst(0)), (String) spu.aT(aaCustomAction2.P(), new lst(0))) || aaCustomAction.O() != aaCustomAction2.O()) {
                z = true;
                break;
            }
        }
        lsvVar.c = iQ;
        ((ype) lsv.a.l().ai(4266)).M("playbackStateChange streamItemNeedsUpdate=%s, hasNotifiedForThisTrack=%s", true == z ? "true" : "false", true != lsvVar.h ? "false" : "true");
        lsp lspVar = lsvVar.f;
        if (!z || lspVar == null) {
            return;
        }
        lspVar.i = lsvVar.e();
        lsvVar.b(lspVar);
    }

    @Override // defpackage.lju
    public final void f() {
    }

    @Override // defpackage.lju
    public final void e(CharSequence charSequence) {
    }

    @Override // defpackage.lju
    public final void i(boolean z) {
    }

    @Override // defpackage.lju
    public final void j(CharSequence charSequence) {
    }
}
