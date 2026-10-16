package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import androidx.car.app.model.Action;
import androidx.car.app.model.SearchTemplate;
import com.google.android.apps.auto.components.media.template.MediaSearchTemplateService;

/* loaded from: classes2.dex */
final class lsy extends qw {
    public final ComponentName f;
    private final vm g;

    public lsy(qn qnVar, Intent intent) {
        super(qnVar);
        this.g = new lsw(this);
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH");
        componentName.getClass();
        this.f = componentName;
        this.a.e.w(new lsx(this));
    }

    @Override // defpackage.qw
    public final wb h() {
        ((ype) MediaSearchTemplateService.c.l().ai((char) 4267)).u("#onGetTemplate");
        vl vlVar = new vl(this.g);
        vlVar.a(Action.BACK);
        vlVar.f = true;
        return new SearchTemplate(vlVar);
    }
}
