package com.waze.uid;

import android.content.Context;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.uid.state_impl.email.EmailParameters;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class r {
    public static List c(Context context, com.waze.shared_infra.o.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "onTermsOfServiceClicked");
        h.g.b.x.f(aVar3, "onPrivacyPolicyClicked");
        ArrayList arrayList = new ArrayList(2);
        String strA = ConfigValues.CONFIG_VALUE_SIGNUP_UID_TERMS_URL.b();
        String strC = aVar.c(R.string.WELCOME_SCREEN_TERMS_OF_SERVICE_LINK_TEXT, new Object[0]);
        h.g.b.x.c(strA);
        arrayList.add(new com.waze.sharedui.profile.b(strA, new q(aVar2, context, strC, strA, 0)));
        String strA2 = ConfigValues.CONFIG_VALUE_SIGNUP_UID_PRIVACY_URL.b();
        String strC2 = aVar.c(R.string.WELCOME_SCREEN_PRIVACY_POLICY_LINK_TEXT, new Object[0]);
        h.g.b.x.c(strA2);
        arrayList.add(new com.waze.sharedui.profile.b(strA2, new q(aVar3, context, strC2, strA2, 1)));
        return arrayList;
    }

    public static UidModel d(FlowType flowType, FlowContext flowContext) {
        h.g.b.x.f(flowType, "flowType");
        h.g.b.x.f(flowContext, "context");
        UidModel uidModel = new UidModel();
        uidModel.setFlowType(flowType);
        uidModel.setFlowContext(flowContext);
        uidModel.setStartFlowNanoTime(System.nanoTime());
        uidModel.getInstallParameters().showTermsAndService = !com.waze.uid.d.q.f44463a.a().f44468f.j();
        EmailParameters emailParameters = uidModel.getEmailParameters();
        String strE = com.waze.sharedui.profile.b.a().e();
        if (strE == null) {
            strE = "";
        }
        emailParameters.setEmailAddress(strE);
        return uidModel;
    }

    public boolean f() {
        throw null;
    }
}
