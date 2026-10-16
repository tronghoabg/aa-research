package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes.dex */
public final class cvi {
    public static final cvj a;
    public static final cvj b;
    public static final cvj c;
    public static final cvj d;
    public static final cvj e;
    public static final cvj f;
    public static final cvj g;
    public static final cvj h;
    public static final cvj i;

    static {
        cvk cvkVar = new cvk("caption bar");
        a = cvkVar;
        cvk cvkVar2 = new cvk("display cutout");
        b = cvkVar2;
        cvk cvkVar3 = new cvk(CloudRecognizerProtocolStrings.IME);
        c = cvkVar3;
        cvk cvkVar4 = new cvk("mandatory system gestures");
        d = cvkVar4;
        cvk cvkVar5 = new cvk("navigation bars");
        e = cvkVar5;
        cvk cvkVar6 = new cvk("status bars");
        f = cvkVar6;
        new csn("system bars", new cvj[]{cvkVar6, cvkVar5, cvkVar});
        cvk cvkVar7 = new cvk("system gestures");
        g = cvkVar7;
        cvk cvkVar8 = new cvk("tappable element");
        h = cvkVar8;
        cvk cvkVar9 = new cvk("waterfall");
        i = cvkVar9;
        new csn("safe drawing", new cvj[]{cvkVar6, cvkVar5, cvkVar, cvkVar2, cvkVar3, cvkVar8});
        new csn("safe gestures", new cvj[]{cvkVar4, cvkVar7, cvkVar8, cvkVar9});
        new csn("safe content", new cvj[]{cvkVar6, cvkVar5, cvkVar, cvkVar3, cvkVar7, cvkVar4, cvkVar8, cvkVar2, cvkVar9});
    }
}
