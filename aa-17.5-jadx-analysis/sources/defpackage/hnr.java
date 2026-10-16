package defpackage;

import android.os.Bundle;
import android.service.personalcontext.insight.ContextInsight;
import java.util.List;

/* loaded from: classes2.dex */
public final class hnr extends hnk {
    @Override // defpackage.hnk
    public final /* bridge */ /* synthetic */ hnl a(Bundle bundle, List list) {
        ContextInsight contextInsight = (ContextInsight) woy.bI(list, 5);
        ContextInsight contextInsight2 = (ContextInsight) woy.bI(list, 0);
        ContextInsight contextInsight3 = (ContextInsight) woy.bI(list, 1);
        Object objBI = woy.bI(list, 2);
        if (objBI != null) {
            return new hns(contextInsight, contextInsight2, contextInsight3, (ContextInsight) objBI, (ContextInsight) woy.bI(list, 3), (ContextInsight) woy.bI(list, 4), (ContextInsight) woy.bI(list, 6), bundle.getString("cardType"));
        }
        throw new IllegalArgumentException("Body is required");
    }
}
