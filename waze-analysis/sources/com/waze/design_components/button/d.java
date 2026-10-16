package com.waze.design_components.button;

import com.waze.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23337a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f23338b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f23339c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f23340d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f23341e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f23342f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f23343g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f23344h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f23345i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f23346j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ d[] f23347k;

    /* renamed from: l, reason: collision with root package name */
    private final int f23348l;

    static {
        d dVar = new d("INVALID", 0, 0);
        f23337a = dVar;
        d dVar2 = new d("LARGE_TEXT_AND_IMAGE", 1, R.layout.large_text_image_button_layout);
        f23338b = dVar2;
        d dVar3 = new d("LARGE_TEXT_ONLY", 2, R.layout.large_text_only_button_layout);
        f23339c = dVar3;
        d dVar4 = new d("LARGE_IMAGE_ONLY", 3, R.layout.large_image_only_button_layout);
        f23340d = dVar4;
        d dVar5 = new d("NORMAL_TEXT_AND_IMAGE", 4, R.layout.normal_text_image_button_layout);
        f23341e = dVar5;
        d dVar6 = new d("NORMAL_TEXT_ONLY", 5, R.layout.normal_text_only_button_layout);
        f23342f = dVar6;
        d dVar7 = new d("NORMAL_IMAGE_ONLY", 6, R.layout.normal_image_only_button_layout);
        f23343g = dVar7;
        d dVar8 = new d("SMALL_TEXT_AND_IMAGE", 7, R.layout.small_text_image_button_layout);
        f23344h = dVar8;
        d dVar9 = new d("SMALL_TEXT_ONLY", 8, R.layout.small_text_only_button_layout);
        f23345i = dVar9;
        d dVar10 = new d("SMALL_IMAGE_ONLY", 9, R.layout.small_image_only_button_layout);
        f23346j = dVar10;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
        f23347k = dVarArr;
        h.d.b.a(dVarArr);
    }

    private d(String str, int i2, int i3) {
        this.f23348l = i3;
    }

    public static d[] values() {
        return (d[]) f23347k.clone();
    }

    public final int a() {
        return this.f23348l;
    }
}
