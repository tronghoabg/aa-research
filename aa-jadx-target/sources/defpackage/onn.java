package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class onn {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.MediaPlaybackHelper");
    private static final defpackage.yhx b = defpackage.yhx.t(0, 1, 2, 6, 7, 8, 9, 10, 11);

    public onn() {
        defpackage.lem.a();
    }

    public static int a(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - aaPlaybackState.T();
        float fO = aaPlaybackState.O();
        if (true == b.contains(java.lang.Integer.valueOf(aaPlaybackState.Q()))) {
            fO = 0.0f;
        }
        if (aaPlaybackState.U() == -1) {
            return 0;
        }
        return java.lang.Math.max(0, (int) (((long) (jElapsedRealtime * fO)) + aaPlaybackState.U()));
    }

    public static android.graphics.Bitmap b(android.graphics.Bitmap bitmap) {
        return (bitmap.getWidth() <= 128 || bitmap.getHeight() <= 128) ? bitmap : android.graphics.Bitmap.createScaledBitmap(bitmap, 128, 128, false);
    }

    public static onp c(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, defpackage.lmk lmkVar) {
        int iQ = aaPlaybackState == null ? 0 : aaPlaybackState.Q();
        if (iQ == 7) {
            return onp.c;
        }
        if (iQ != 0) {
            defpackage.lol lolVar = defpackage.lom.a;
            if (!defpackage.lol.b(lmkVar)) {
                return onp.b;
            }
        }
        return onp.a;
    }

    public static java.lang.String d(long j) {
        defpackage.ysr.aY(j >= 0, "Cannot pass in a negative number");
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j3 / 60;
        java.lang.String string = java.lang.Long.toString(j4);
        java.lang.String string2 = java.lang.Long.toString(j3 % 60);
        java.lang.String string3 = java.lang.Long.toString(j2 % 60);
        if (j4 > 0 && string2.length() == 1) {
            string2 = "0".concat(java.lang.String.valueOf(string2));
        }
        if (string3.length() == 1) {
            string3 = "0".concat(java.lang.String.valueOf(string3));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (j4 > 0) {
            sb.append(string);
            sb.append(":");
        }
        sb.append(string2);
        sb.append(":");
        sb.append(string3);
        return sb.toString();
    }

    public static boolean i(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, defpackage.lmk lmkVar) {
        if (aaPlaybackState == null || lmkVar == null) {
            return true;
        }
        return lmkVar.O("android.media.metadata.DURATION") >= 0 && aaPlaybackState.U() != -1;
    }

    public static boolean k(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, defpackage.lmk lmkVar) {
        return c(aaPlaybackState, lmkVar) == onp.b;
    }

    public static boolean l(lkc lkcVar, java.lang.String str, java.lang.String str2) {
        boolean zI = lkcVar.i(str);
        boolean zI2 = lkcVar.i(str2);
        if (zI2) {
            lkcVar.a();
        }
        return zI || zI2;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    static final void n(android.widget.ImageButton imageButton, java.lang.String str, int i, android.content.res.Resources resources, com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction aaCustomAction) {
        if (resources == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 6045)).u("Resources is null. Icons will not show up.");
            imageButton.setImageDrawable(null);
            return;
        }
        ona onaVar = (ona) imageButton.getTag();
        imageButton.setTag(new ona(str, i, aaCustomAction));
        if (onaVar != null && j$.util.Objects.equals(onaVar.b, str) && onaVar.a == i) {
            return;
        }
        android.content.res.Resources resources2 = imageButton.getResources();
        resources.updateConfiguration(resources2.getConfiguration(), resources2.getDisplayMetrics());
        try {
            imageButton.setImageDrawable(new android.graphics.drawable.InsetDrawable(resources.getDrawable(i, null), resources2.getDimensionPixelSize(2131167991)));
        } catch (android.content.res.Resources.NotFoundException unused) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 6044)).w("Resource not found: %d", i);
            imageButton.setImageDrawable(null);
        }
    }

    public final void e(lkc lkcVar, defpackage.zbe zbeVar, com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction aaCustomAction) {
        if (j(lkcVar)) {
            lkcVar.j().h(zbeVar).f(aaCustomAction, aaCustomAction.n());
        }
    }

    public final void f(lkc lkcVar, defpackage.zbe zbeVar) {
        if (j(lkcVar)) {
            lkcVar.j().h(zbeVar).g();
        }
    }

    public final void g(lkc lkcVar, defpackage.zbe zbeVar) {
        if (j(lkcVar)) {
            lkcVar.j().h(zbeVar).h();
        }
    }

    public final void h(lkc lkcVar, defpackage.zbe zbeVar) {
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackStateC = lkcVar.c();
        if (j(lkcVar)) {
            lkj lkjVarH = lkcVar.j().h(zbeVar);
            long jR = aaPlaybackStateC.R();
            if (aaPlaybackStateC.Q() != 3 && aaPlaybackStateC.Q() != 6) {
                lkjVarH.c();
                return;
            }
            if ((2 & jR) != 0 || (512 & jR) != 0) {
                lkjVarH.b();
            } else if ((jR & 1) != 0) {
                lkjVarH.i();
            }
        }
    }

    public final boolean j(lkc lkcVar) {
        return (lkcVar == null || !lkcVar.h() || lkcVar.j() == null || lkcVar.c() == null) ? false : true;
    }

    public final void m(android.widget.ImageButton imageButton, int i, boolean z, boolean z2, java.util.List list, lkc lkcVar, android.view.View.OnClickListener onClickListener) {
        if (z2 || z) {
            n(imageButton, "com.google.android.projection.gearhead", i, imageButton.getResources(), null);
            imageButton.setVisibility(true == z2 ? 0 : 4);
        } else {
            if (list.isEmpty()) {
                imageButton.setVisibility(4);
                return;
            }
            com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction aaCustomAction = (com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction) list.remove(0);
            imageButton.setOnClickListener(onClickListener);
            n(imageButton, lkcVar.a().b, aaCustomAction.O(), lkcVar.a().g, aaCustomAction);
            imageButton.setVisibility(0);
        }
    }
}
