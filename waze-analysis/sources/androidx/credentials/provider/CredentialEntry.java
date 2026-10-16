package androidx.credentials.provider;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class CredentialEntry {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_";
    public static final String EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_";
    public static final String EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_TYPE_";
    public static final String EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX = "androidx.credentials.provider.extra.HAS_DEFAULT_ICON_";
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_";
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_";
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_";
    public static final String EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX = "androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_";
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_";
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_";
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";
    public static final String EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.PENDING_INTENT_";
    public static final String EXTRA_CREDENTIAL_ENTRY_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_SIZE";
    public static final String EXTRA_CREDENTIAL_SUBTITLE_PREFIX = "androidx.credentials.provider.extra.SUBTITLE_";
    public static final String EXTRA_CREDENTIAL_TITLE_PREFIX = "androidx.credentials.provider.extra.TITLE_";
    public static final String EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX = "androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_";
    public static final String EXTRA_CREDENTIAL_TYPE_ICON_PREFIX = "androidx.credentials.provider.extra.ICON_";
    public static final String FALSE_STRING = "false";
    public static final int REVISION_ID = 1;
    public static final String SLICE_HINT_AFFILIATED_DOMAIN = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN";
    public static final String SLICE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS";
    public static final String SLICE_HINT_AUTO_ALLOWED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";
    public static final String SLICE_HINT_AUTO_SELECT_FROM_OPTION = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";
    public static final String SLICE_HINT_BIOMETRIC_PROMPT_DATA = "androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA";
    public static final String SLICE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CRYPTO_OP_ID";
    public static final String SLICE_HINT_DEDUPLICATION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID";
    public static final String SLICE_HINT_DEFAULT_ICON_RES_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";
    public static final String SLICE_HINT_ICON = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";
    public static final String SLICE_HINT_IS_DEFAULT_ICON_PREFERRED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED";
    public static final String SLICE_HINT_LAST_USED_TIME_MILLIS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";
    public static final String SLICE_HINT_OPTION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";
    public static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";
    public static final String SLICE_HINT_SUBTITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";
    public static final String SLICE_HINT_TITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";
    public static final String SLICE_HINT_TYPE_DISPLAY_NAME = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";
    public static final String TRUE_STRING = "true";
    private final CharSequence affiliatedDomain;
    private final BeginGetCredentialOption beginGetCredentialOption;
    private final BiometricPromptData biometricPromptData;
    private final CharSequence entryGroupId;
    private final boolean isDefaultIconPreferredAsSingleProvider;
    private final String type;

    /* compiled from: WazeSource */
    public final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        public static final CredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            try {
                SliceSpec spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                if (x.n(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    PasswordCredentialEntry passwordCredentialEntryFromSlice = PasswordCredentialEntry.Companion.fromSlice(slice);
                    x.c(passwordCredentialEntryFromSlice);
                    return passwordCredentialEntryFromSlice;
                }
                if (x.n(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    PublicKeyCredentialEntry publicKeyCredentialEntryFromSlice = PublicKeyCredentialEntry.Companion.fromSlice(slice);
                    x.c(publicKeyCredentialEntryFromSlice);
                    return publicKeyCredentialEntryFromSlice;
                }
                CustomCredentialEntry customCredentialEntryFromSlice = CustomCredentialEntry.Companion.fromSlice(slice);
                x.c(customCredentialEntryFromSlice);
                return customCredentialEntryFromSlice;
            } catch (Exception unused) {
                return CustomCredentialEntry.Companion.fromSlice(slice);
            }
        }

        public static final Slice toSlice(CredentialEntry credentialEntry) {
            x.f(credentialEntry, "entry");
            if (credentialEntry instanceof PasswordCredentialEntry) {
                return PasswordCredentialEntry.Companion.toSlice((PasswordCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof PublicKeyCredentialEntry) {
                return PublicKeyCredentialEntry.Companion.toSlice((PublicKeyCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof CustomCredentialEntry) {
                return CustomCredentialEntry.Companion.toSlice((CustomCredentialEntry) credentialEntry);
            }
            return null;
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            x.f(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            x.e(slice, "getSlice(...)");
            return CredentialEntry.Companion.fromSlice$credentials(slice);
        }
    }

    /* compiled from: WazeSource */
    public final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        public static final CredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            try {
                SliceSpec spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                if (x.n(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    PasswordCredentialEntry passwordCredentialEntryFromSlice = PasswordCredentialEntry.Companion.fromSlice(slice);
                    x.c(passwordCredentialEntryFromSlice);
                    return passwordCredentialEntryFromSlice;
                }
                if (x.n(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    PublicKeyCredentialEntry publicKeyCredentialEntryFromSlice = PublicKeyCredentialEntry.Companion.fromSlice(slice);
                    x.c(publicKeyCredentialEntryFromSlice);
                    return publicKeyCredentialEntryFromSlice;
                }
                CustomCredentialEntry customCredentialEntryFromSlice = CustomCredentialEntry.Companion.fromSlice(slice);
                x.c(customCredentialEntryFromSlice);
                return customCredentialEntryFromSlice;
            } catch (Exception unused) {
                return CustomCredentialEntry.Companion.fromSlice(slice);
            }
        }

        public static final Slice toSlice(CredentialEntry credentialEntry) {
            x.f(credentialEntry, "entry");
            if (credentialEntry instanceof PasswordCredentialEntry) {
                return PasswordCredentialEntry.Companion.toSlice((PasswordCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof PublicKeyCredentialEntry) {
                return PublicKeyCredentialEntry.Companion.toSlice((PublicKeyCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof CustomCredentialEntry) {
                return CustomCredentialEntry.Companion.toSlice((CustomCredentialEntry) credentialEntry);
            }
            return null;
        }
    }

    public CredentialEntry(String str, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence, boolean z, CharSequence charSequence2, BiometricPromptData biometricPromptData) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(beginGetCredentialOption, "beginGetCredentialOption");
        x.f(charSequence, "entryGroupId");
        this.type = str;
        this.beginGetCredentialOption = beginGetCredentialOption;
        this.entryGroupId = charSequence;
        this.isDefaultIconPreferredAsSingleProvider = z;
        this.affiliatedDomain = charSequence2;
        this.biometricPromptData = biometricPromptData;
    }

    public static final CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return Companion.fromCredentialEntry(credentialEntry);
    }

    public final CharSequence getAffiliatedDomain() {
        return this.affiliatedDomain;
    }

    public final BeginGetCredentialOption getBeginGetCredentialOption() {
        return this.beginGetCredentialOption;
    }

    public final BiometricPromptData getBiometricPromptData() {
        return this.biometricPromptData;
    }

    public final CharSequence getEntryGroupId() {
        return this.entryGroupId;
    }

    public String getType() {
        return this.type;
    }

    public final boolean isDefaultIconPreferredAsSingleProvider() {
        return this.isDefaultIconPreferredAsSingleProvider;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            x.f(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final CredentialEntry fromSlice$credentials(Slice slice) {
            x.f(slice, "slice");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall(List<? extends CredentialEntry> list, Bundle bundle) {
            x.f(list, "<this>");
            x.f(bundle, "bundle");
            bundle.putInt(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                CredentialEntry credentialEntry = list.get(i2);
                if (credentialEntry instanceof PasswordCredentialEntry) {
                    PasswordCredentialEntry.Companion.marshall$credentials((PasswordCredentialEntry) credentialEntry, bundle, i2);
                } else if (credentialEntry instanceof PublicKeyCredentialEntry) {
                    PublicKeyCredentialEntry.Companion.marshall$credentials((PublicKeyCredentialEntry) credentialEntry, bundle, i2);
                } else if (credentialEntry instanceof CustomCredentialEntry) {
                    CustomCredentialEntry.Companion.marshall$credentials((CustomCredentialEntry) credentialEntry, bundle, i2);
                }
            }
        }

        public final void marshallCommonProperties$credentials(CredentialEntry credentialEntry, Bundle bundle, int i2) {
            x.f(credentialEntry, "<this>");
            x.f(bundle, "bundle");
            bundle.putString(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX), credentialEntry.getType());
            bundle.putString(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX), credentialEntry.getBeginGetCredentialOption().getId());
            bundle.putString(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX), credentialEntry.getBeginGetCredentialOption().getType());
            bundle.putBundle(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX), credentialEntry.getBeginGetCredentialOption().getCandidateQueryData());
            bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX), credentialEntry.getEntryGroupId());
            bundle.putBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX), credentialEntry.isDefaultIconPreferredAsSingleProvider());
            CharSequence affiliatedDomain = credentialEntry.getAffiliatedDomain();
            if (affiliatedDomain != null) {
                bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX), affiliatedDomain);
            }
        }

        public final Slice toSlice$credentials(CredentialEntry credentialEntry) {
            x.f(credentialEntry, "entry");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(credentialEntry) : Api28Impl.toSlice(credentialEntry);
        }

        public final List<CredentialEntry> unmarshallCredentialEntries(Bundle bundle) {
            x.f(bundle, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = bundle.getInt(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, 0);
            for (int i3 = 0; i3 < i2; i3++) {
                String string = bundle.getString(a.a(i3, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX));
                if (string == null) {
                    return i.h();
                }
                Object objUnmarshall$credentials = x.n(string, PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? PasswordCredentialEntry.Companion.unmarshall$credentials(bundle, i3) : x.n(string, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? PublicKeyCredentialEntry.Companion.unmarshall$credentials(bundle, i3) : CustomCredentialEntry.Companion.unmarshall$credentials(bundle, i3, string);
                if (objUnmarshall$credentials == null) {
                    return i.h();
                }
                arrayList.add(objUnmarshall$credentials);
            }
            return arrayList;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ CredentialEntry(String str, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence, boolean z, CharSequence charSequence2, BiometricPromptData biometricPromptData, int i2, o oVar) {
        this(str, beginGetCredentialOption, charSequence, z, (i2 & 16) != 0 ? null : charSequence2, (i2 & 32) != 0 ? null : biometricPromptData);
    }
}
