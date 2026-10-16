package com.waze.share;

import android.support.v7.widget.fe;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends fe {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37730d = 0;

    /* renamed from: a, reason: collision with root package name */
    final ImageView f37731a;

    /* renamed from: b, reason: collision with root package name */
    final TextView f37732b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f37733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, View view) {
        super(view);
        Objects.requireNonNull(uVar);
        this.f37733c = uVar;
        this.f37731a = (ImageView) view.findViewById(R.id.shareSelectorItemAppIcon);
        this.f37732b = (TextView) view.findViewById(R.id.shareSelectorItemAppName);
    }
}
