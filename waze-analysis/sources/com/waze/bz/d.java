package com.waze.bz;

import android.content.Context;
import android.content.Intent;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.navigate.fv;
import com.waze.navigate.fy;
import com.waze.settings.SettingsHOVActivity;
import com.waze.web.SimpleWebActivity;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final fy f18209a;

    /* renamed from: b, reason: collision with root package name */
    private final ConfigManager f18210b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f18211c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f18212d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f18213e;

    public d(fy fyVar, ConfigManager configManager, Context context) {
        x.f(fyVar, "tollInfoStatSender");
        x.f(configManager, "configManager");
        x.f(context, "appContext");
        this.f18209a = fyVar;
        this.f18210b = configManager;
        this.f18211c = context;
        bn bnVarB = ck.b(null);
        this.f18212d = bnVarB;
        this.f18213e = ai.U(bnVarB);
    }

    public static final /* synthetic */ Intent c(d dVar) {
        dVar.f18209a.a(fv.f31383c);
        Context context = dVar.f18211c;
        Intent intent = new Intent(context, (Class<?>) SimpleWebActivity.class);
        intent.putExtra("webViewURL", dVar.f18210b.getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_HELP_ABOUT_TOLLS_URL));
        intent.putExtra("webViewTitle", context.getString(R.string.TOLL_INFO_PRICES_POPUP_HELP_LINK_TITLE));
        intent.putExtra("webViewShowClose", true);
        return intent;
    }

    public static final /* synthetic */ Intent d(d dVar) {
        dVar.f18212d.e(null);
        dVar.f18209a.a(fv.f31382b);
        return new Intent(dVar.f18211c, (Class<?>) SettingsHOVActivity.class);
    }

    public static final /* synthetic */ void e(d dVar) {
        dVar.f18212d.e(null);
        dVar.f18209a.a(fv.f31381a);
    }

    public static final /* synthetic */ void f(d dVar) {
        dVar.f18212d.e(null);
        dVar.f18209a.a(fv.f31381a);
    }

    @Override // com.waze.bz.b
    public final ch a() {
        return this.f18213e;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0222  */
    @Override // com.waze.bz.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.waze.modules.c.by r24) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bz.d.b(com.waze.modules.c.by):void");
    }
}
