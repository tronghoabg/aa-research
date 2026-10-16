package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lmd implements tfj {
    private final /* synthetic */ int a;

    public /* synthetic */ lmd(int i) {
        this.a = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.lmk((android.support.v4.media.MediaMetadataCompat) obj);
            case 1:
                return new com.google.android.apps.auto.components.media.compat.AaPlaybackState((android.support.v4.media.session.PlaybackStateCompat) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.lma((dn) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.lmk((android.support.v4.media.MediaMetadataCompat) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.lma((dn) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new com.google.android.apps.auto.components.media.compat.AaPlaybackState((android.support.v4.media.session.PlaybackStateCompat) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.lke) obj).a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar = defpackage.lnb.a;
                return ((los) obj).d();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Integer.valueOf(((defpackage.lma) obj).x());
            case 9:
                return lka.a((defpackage.lmk) obj);
            case 10:
                return lka.b((defpackage.lmk) obj);
            case 11:
                return lka.a((defpackage.lmk) obj);
            case 12:
                return lka.b((defpackage.lmk) obj);
            case 13:
                return lka.b((defpackage.lmk) obj);
            case 14:
                return lka.a((defpackage.lmk) obj);
            case 15:
                return java.lang.Integer.valueOf(((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj).Q());
            case 16:
                return ((defpackage.lmk) obj).h();
            case 17:
                return ((lmj) obj).S();
            case 18:
                return ((lmj) obj).R();
            case 19:
                return ((lmj) obj).Q();
            default:
                return lka.a((defpackage.lmk) obj);
        }
    }
}
