package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
final class lnz extends llu {
    final /* synthetic */ loa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnz(loa loaVar) {
        super((int[]) null);
        this.a = loaVar;
    }

    @Override // defpackage.llu
    public final void d(AaPlaybackState aaPlaybackState) {
        ype ypeVar = (ype) lod.a.l().ai(4094);
        loa loaVar = this.a;
        String strFlattenToShortString = loaVar.a.flattenToShortString();
        zjc zjcVar = zjc.a;
        ypeVar.R("onPlaybackStateChanged componentName=%s state=%s (%s)", new zjd(zjcVar, strFlattenToShortString), new zjd(zjcVar, lkb.a(aaPlaybackState)), aaPlaybackState);
        loaVar.m(aaPlaybackState);
    }

    @Override // defpackage.llu
    public final void w() {
        yop yopVarH = lod.a.h();
        loa loaVar = this.a;
        ((ype) ((ype) yopVarH).ai((char) 4095)).y("PlaybackStateCallback#onSessionDestroyed componentName=%s", new zjd(zjc.a, loaVar.a.flattenToShortString()));
        loaVar.m(null);
    }
}
