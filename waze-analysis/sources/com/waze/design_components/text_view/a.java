package com.waze.design_components.text_view;

import com.waze.R;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23480a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f23481b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f23482c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f23483d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f23484e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f23485f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f23486g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f23487h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f23488i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f23489j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f23490k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f23491l;
    public static final a m;
    public static final a n;
    public static final a o;
    private static final /* synthetic */ a[] p;
    private final int q;
    private final int r;

    static {
        a aVar = new a("NONE", 0, 0, 0);
        f23480a = aVar;
        a aVar2 = new a("HEADLINE1", 1, 1, R.style.Headline1);
        f23481b = aVar2;
        a aVar3 = new a("HEADLINE2", 2, 2, R.style.Headline2);
        f23482c = aVar3;
        a aVar4 = new a("HEADLINE3", 3, 3, R.style.Headline3);
        f23483d = aVar4;
        a aVar5 = new a("HEADLINE4", 4, 4, R.style.Headline4);
        f23484e = aVar5;
        a aVar6 = new a("HEADLINE5", 5, 5, R.style.Headline5);
        f23485f = aVar6;
        a aVar7 = new a("HEADLINE6", 6, 6, R.style.Headline6);
        f23486g = aVar7;
        a aVar8 = new a("HEADLINE7", 7, 7, R.style.Headline7);
        f23487h = aVar8;
        a aVar9 = new a("SUBHEAD1", 8, 11, R.style.Subhead1);
        f23488i = aVar9;
        a aVar10 = new a("SUBHEAD2", 9, 12, R.style.Subhead2);
        f23489j = aVar10;
        a aVar11 = new a("SUBHEAD3", 10, 13, R.style.Subhead3);
        f23490k = aVar11;
        a aVar12 = new a("SUBHEAD4", 11, 14, R.style.Subhead4);
        f23491l = aVar12;
        a aVar13 = new a("BODY1", 12, 21, R.style.Body1);
        m = aVar13;
        a aVar14 = new a("BODY2", 13, 22, R.style.Body2);
        n = aVar14;
        a aVar15 = new a("CAPTION", 14, 31, R.style.Caption);
        o = aVar15;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15};
        p = aVarArr;
        b.a(aVarArr);
    }

    private a(String str, int i2, int i3, int i4) {
        this.q = i3;
        this.r = i4;
    }

    public static a[] values() {
        return (a[]) p.clone();
    }

    public final int a() {
        return this.q;
    }

    public final int b() {
        return this.r;
    }
}
