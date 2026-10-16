package com.waze.car_lib.screens;

import android.net.Uri;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.Template;
import androidx.car.app.model.signin.QRCodeSignInMethod;
import androidx.car.app.model.signin.SignInTemplate;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.h f22015a;

    /* renamed from: b, reason: collision with root package name */
    private final SignInTemplate f22016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CarContext carContext, com.waze.car_lib.r.h hVar) {
        super(carContext, "ConsentBumpContentScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(hVar, "viewModel");
        this.f22015a = hVar;
        Uri uri = Uri.parse(hVar.a().a());
        h.g.b.x.e(uri, "parse(...)");
        SignInTemplate.Builder builder = new SignInTemplate.Builder(new QRCodeSignInMethod(uri));
        builder.setTitle(hVar.a().b());
        builder.setHeaderAction(Action.BACK);
        SignInTemplate signInTemplateBuild = builder.build();
        h.g.b.x.e(signInTemplateBuild, "build(...)");
        this.f22016b = signInTemplateBuild;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22016b;
    }
}
