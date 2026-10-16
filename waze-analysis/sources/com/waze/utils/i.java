package com.waze.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44883a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f44884b = {100, 300, DisplayStrings.DS_STREETSROAD_WITHOUT_A_NAME, 1600};

    /* renamed from: c, reason: collision with root package name */
    private static i f44885c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.ac f44886d;

    public static synchronized i a() {
        i iVar;
        iVar = f44885c;
        if (iVar == null) {
            iVar = new i();
            f44885c = iVar;
        }
        return iVar;
    }

    public final void b(Context context) {
        if (this.f44886d != null || context == null) {
            return;
        }
        this.f44886d = com.bumptech.glide.c.e(context);
    }

    public final void c(String str, h hVar) {
        d(str, hVar, null);
    }

    public final void d(String str, h hVar, Object obj) {
        e(str, hVar, obj, 0, 0, false);
    }

    public final void e(String str, h hVar, Object obj, int i2, int i3, boolean z) {
        String string;
        int iMax;
        System.currentTimeMillis();
        Uri uri = TextUtils.isEmpty(str) ? null : Uri.parse(str);
        if (uri == null || uri.getHost() == null) {
            com.waze.shared_infra.i.h.c(String.format("ImageManager: loadImageFromUrl: invalid image_url %s", str == null ? "null" : str));
            System.currentTimeMillis();
            hVar.b();
            return;
        }
        if (!z || (iMax = Math.max(i3, i2)) <= 0) {
            string = str;
        } else {
            int[] iArr = f44884b;
            for (int i4 = 0; i4 < 4; i4++) {
                int i5 = iArr[i4];
                if (iMax < i5) {
                    string = uri.buildUpon().appendQueryParameter(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, String.valueOf(i5)).build().toString();
                    break;
                }
            }
            string = str;
        }
        this.f44886d.b().g(string).m(new g(this, hVar, obj, string, i2, i3));
    }
}
