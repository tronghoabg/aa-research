package Ge;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.properties.QUserProperties;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes5.dex */
public final class m implements QonversionExperimentAttachCallback, QonversionUserPropertiesCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4757a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4758b;

    public m(u uVar) {
        this.f4758b = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback, com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
    public final void onError(QonversionError error) {
        switch (this.f4757a) {
            case 0:
                AbstractC3340k.e(error, "error");
                this.f4758b.onError(c.l(error));
                break;
            default:
                AbstractC3340k.e(error, "error");
                this.f4758b.onError(c.l(error));
                break;
        }
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback
    public void onSuccess() {
        this.f4758b.onSuccess(t.a(true));
    }

    public m(u uVar, t tVar) {
        this.f4758b = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback
    public void onSuccess(QUserProperties userProperties) {
        AbstractC3340k.e(userProperties, "userProperties");
        List<QUserProperty> properties = userProperties.getProperties();
        ArrayList arrayList = new ArrayList(ff.p.a0(properties, 10));
        for (QUserProperty qUserProperty : properties) {
            AbstractC3340k.e(qUserProperty, "<this>");
            arrayList.add(AbstractC2640A.R(new C2527k(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, qUserProperty.getKey()), new C2527k(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, qUserProperty.getValue())));
        }
        this.f4758b.onSuccess(AbstractC2641B.E(new C2527k("properties", arrayList)));
    }
}
