package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class Credential {
    public static final Companion Companion = new Companion(null);
    private final Bundle data;
    private final String type;

    public Credential(String str, Bundle bundle) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "data");
        this.type = str;
        this.data = bundle;
    }

    public static final Credential createFrom(android.credentials.Credential credential) {
        return Companion.createFrom(credential);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final Credential createFrom(String str, Bundle bundle) throws FrameworkClassParsingException {
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(bundle, "data");
            try {
                switch (str.hashCode()) {
                    case -1678407252:
                        if (str.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                            return DigitalCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                    case -1072734346:
                        if (str.equals(RestoreCredential.TYPE_RESTORE_CREDENTIAL)) {
                            return RestoreCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                    case -543568185:
                        if (str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                            return PasswordCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                    case -95037569:
                        if (str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return PublicKeyCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CustomCredential(str, bundle);
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Credential createFrom(android.credentials.Credential credential) {
            x.f(credential, "credential");
            String type = credential.getType();
            x.e(type, "getType(...)");
            Bundle data = credential.getData();
            x.e(data, "getData(...)");
            return createFrom(type, data);
        }
    }

    public static final Credential createFrom(String str, Bundle bundle) {
        return Companion.createFrom(str, bundle);
    }
}
