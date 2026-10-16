package a1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: a1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f17127a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f17128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17129c;

    public C1319i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f17127a = colorStateList;
        this.f17128b = configuration;
        this.f17129c = theme == null ? 0 : theme.hashCode();
    }
}
