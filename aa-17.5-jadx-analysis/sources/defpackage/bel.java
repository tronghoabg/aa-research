package defpackage;

import android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bel {
    public static final bel a;
    public static final bel b;
    public static final bel c;
    public static final bel d;
    public static final bel e;
    private static final /* synthetic */ bel[] i;
    public final Object f;
    public final int g;
    public final int h;

    static {
        bel belVar = new bel("Cut", 0, bfw.a, R.string.cut, R.attr.actionModeCutDrawable);
        a = belVar;
        bel belVar2 = new bel("Copy", 1, bfw.b, R.string.copy, R.attr.actionModeCopyDrawable);
        b = belVar2;
        bel belVar3 = new bel("Paste", 2, bfw.c, R.string.paste, R.attr.actionModePasteDrawable);
        c = belVar3;
        bel belVar4 = new bel("SelectAll", 3, bfw.d, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        d = belVar4;
        bel belVar5 = new bel("Autofill", 4, bfw.e, R.string.autofill, 0);
        e = belVar5;
        bel[] belVarArr = {belVar, belVar2, belVar3, belVar4, belVar5};
        i = belVarArr;
        affa.p(belVarArr);
    }

    private bel(String str, int i2, Object obj, int i3, int i4) {
        this.f = obj;
        this.g = i3;
        this.h = i4;
    }

    public static bel valueOf(String str) {
        return (bel) Enum.valueOf(bel.class, str);
    }

    public static bel[] values() {
        return (bel[]) i.clone();
    }
}
