package defpackage;

import com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class naw {
    public static final naw a;
    public static final naw b;
    public static final naw c;
    public static final naw d;
    private static final /* synthetic */ naw[] f;
    public final Class e;

    static {
        naw nawVar = new naw("PLAYER", 0, MediaPlayerFragment.class);
        a = nawVar;
        naw nawVar2 = new naw("LOADING", 1, mzu.class);
        b = nawVar2;
        naw nawVar3 = new naw("INVALID", 2, mzs.class);
        c = nawVar3;
        naw nawVar4 = new naw("SUGGESTION", 3, mzs.class);
        d = nawVar4;
        naw[] nawVarArr = {nawVar, nawVar2, nawVar3, nawVar4};
        f = nawVarArr;
        affa.p(nawVarArr);
    }

    private naw(String str, int i, Class cls) {
        this.e = cls;
    }

    public static naw valueOf(String str) {
        return (naw) Enum.valueOf(naw.class, str);
    }

    public static naw[] values() {
        return (naw[]) f.clone();
    }
}
