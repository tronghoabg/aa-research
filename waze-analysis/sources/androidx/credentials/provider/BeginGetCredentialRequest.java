package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginGetCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private final List<BeginGetCredentialOption> beginGetCredentialOptions;
    private final CallingAppInfo callingAppInfo;

    /* compiled from: WazeSource */
    final class Api21Impl {
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_";
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialRequest beginGetCredentialRequest) {
            x.f(bundle, "bundle");
            x.f(beginGetCredentialRequest, "request");
            int size = beginGetCredentialRequest.getBeginGetCredentialOptions().size();
            bundle.putInt(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE, size);
            for (int i2 = 0; i2 < size; i2++) {
                bundle.putString(a.a(i2, EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX), beginGetCredentialRequest.getBeginGetCredentialOptions().get(i2).getId());
                bundle.putString(a.a(i2, EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX), beginGetCredentialRequest.getBeginGetCredentialOptions().get(i2).getType());
                bundle.putBundle(a.a(i2, EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX), beginGetCredentialRequest.getBeginGetCredentialOptions().get(i2).getCandidateQueryData());
                CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
                if (callingAppInfo != null) {
                    CallingAppInfo.Companion.setCallingAppInfo$credentials(bundle, callingAppInfo);
                }
            }
        }

        public static final BeginGetCredentialRequest fromBundle(Bundle bundle) {
            String string;
            x.f(bundle, "bundle");
            CallingAppInfo callingAppInfoExtractCallingAppInfo = CallingAppInfo.Companion.extractCallingAppInfo(bundle);
            int i2 = bundle.getInt(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE, -1);
            if (i2 < 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                String string2 = bundle.getString(a.a(i3, EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX));
                if (string2 == null || (string = bundle.getString(a.a(i3, EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX))) == null) {
                    return null;
                }
                Bundle bundle2 = bundle.getBundle(a.a(i3, EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX));
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                arrayList.add(BeginGetCredentialOption.Companion.createFrom$credentials(string2, string, bundle2));
            }
            return new BeginGetCredentialRequest(arrayList, callingAppInfoExtractCallingAppInfo);
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialRequest";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialRequest beginGetCredentialRequest) {
            x.f(bundle, "bundle");
            x.f(beginGetCredentialRequest, "request");
            bundle.putParcelable(REQUEST_KEY, BeginGetCredentialUtil.Companion.convertToFrameworkRequest(beginGetCredentialRequest));
        }

        public static final BeginGetCredentialRequest fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return BeginGetCredentialUtil.Companion.convertToJetpackRequest$credentials(beginGetCredentialRequest);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialRequest(List<? extends BeginGetCredentialOption> list, CallingAppInfo callingAppInfo) {
        x.f(list, "beginGetCredentialOptions");
        this.beginGetCredentialOptions = list;
        this.callingAppInfo = callingAppInfo;
    }

    public static final Bundle asBundle(BeginGetCredentialRequest beginGetCredentialRequest) {
        return Companion.asBundle(beginGetCredentialRequest);
    }

    public static final BeginGetCredentialOption createFrom(String str, String str2, Bundle bundle) {
        return Companion.createFrom(str, str2, bundle);
    }

    public static final BeginGetCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final List<BeginGetCredentialOption> getBeginGetCredentialOptions() {
        return this.beginGetCredentialOptions;
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(BeginGetCredentialRequest beginGetCredentialRequest) {
            x.f(beginGetCredentialRequest, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginGetCredentialRequest);
                return bundle;
            }
            Api21Impl.asBundle(bundle, beginGetCredentialRequest);
            return bundle;
        }

        public final BeginGetCredentialOption createFrom(String str, String str2, Bundle bundle) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(bundle, "candidateQueryData");
            return BeginGetCredentialOption.Companion.createFrom$credentials(str, str2, bundle);
        }

        public final BeginGetCredentialRequest fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api21Impl.fromBundle(bundle);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialRequest(List<? extends BeginGetCredentialOption> list) {
        this(list, null, 2, 0 == true ? 1 : 0);
        x.f(list, "beginGetCredentialOptions");
    }

    public /* synthetic */ BeginGetCredentialRequest(List list, CallingAppInfo callingAppInfo, int i2, o oVar) {
        this(list, (i2 & 2) != 0 ? null : callingAppInfo);
    }
}
