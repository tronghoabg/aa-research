package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class nvm implements nge {
    public final int b;
    public final int c;
    public final GhIcon d;
    public final CarIcon e;
    public final yzz f;
    public final ComponentName g;
    public final nvo h;
    private final String j;
    private static final yph i = yph.c("GH.QFbkEduDisplay");
    public static final Long a = 759347436L;

    @Deprecated
    public nvm(Context context, int i2, int i3, String str, GhIcon ghIcon, yzz yzzVar, ComponentName componentName, nvo nvoVar) {
        CarIcon carIconI;
        this.j = str;
        this.b = i2;
        this.c = i3;
        this.d = ghIcon;
        try {
            carIconI = ghIcon.i(context, -1);
        } catch (Exception e) {
            ((ype) ((ype) ((ype) i.h()).p(e)).ai((char) 5466)).u("Failed to convert GhIcon to CarIcon");
            carIconI = null;
        }
        this.e = carIconI;
        this.f = yzzVar;
        this.g = componentName;
        this.h = nvoVar;
    }

    @Override // defpackage.nge
    @ResultIgnorabilityUnspecified
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.nge
    public final String c() {
        return "quick_feedback_category";
    }

    @Override // defpackage.nge
    public final String d() {
        return this.j;
    }

    public nvm(int i2, int i3, CarIcon carIcon, yzz yzzVar, ComponentName componentName, nvo nvoVar) {
        this.j = "Assistant Quick Feedback Notification";
        this.b = i2;
        this.c = i3;
        this.d = null;
        this.e = carIcon;
        this.f = yzzVar;
        this.g = componentName;
        this.h = nvoVar;
    }
}
