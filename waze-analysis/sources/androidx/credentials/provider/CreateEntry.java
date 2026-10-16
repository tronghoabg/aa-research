package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import h.a.i;
import h.a.r;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;
import h.k;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateEntry {
    private static final String AUTO_SELECT_FALSE_STRING = "false";
    private static final String AUTO_SELECT_TRUE_STRING = "true";
    public static final Companion Companion = new Companion(null);
    private static final int DESCRIPTION_MAX_CHAR_LIMIT = 300;
    private static final String EXTRA_CREATE_ACCOUNT_NAME_PREFIX = "androidx.credentials.provider.extra.ACCOUNT_NAME_";
    private static final String EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_COUNT_INFO_";
    private static final String EXTRA_CREATE_DESCRIPTION_PREFIX = "androidx.credentials.provider.extra.DESCRIPTION_";
    private static final String EXTRA_CREATE_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_";
    private static final String EXTRA_CREATE_ENTRY_LAST_USED_TIME_MILLIS_PREFIX = "androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_";
    private static final String EXTRA_CREATE_ENTRY_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.PENDING_INTENT_";
    private static final String EXTRA_CREATE_ENTRY_SIZE = "androidx.credentials.provider.extra.CREATE_ENTRY_SIZE";
    private static final String EXTRA_CREATE_TYPE_ICON_PREFIX = "androidx.credentials.provider.extra.ICON_";
    private static final int REVISION_ID = 1;
    private static final String SLICE_HINT_ACCOUNT_NAME = "androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME";
    private static final String SLICE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.createEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS";
    private static final String SLICE_HINT_AUTO_SELECT_ALLOWED = "androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED";
    private static final String SLICE_HINT_BIOMETRIC_PROMPT_DATA = "androidx.credentials.provider.createEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA";
    private static final String SLICE_HINT_CREDENTIAL_COUNT_INFORMATION = "androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION";
    private static final String SLICE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.createEntry.SLICE_HINT_CRYPTO_OP_ID";
    private static final String SLICE_HINT_ICON = "androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON";
    private static final String SLICE_HINT_LAST_USED_TIME_MILLIS = "androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";
    private static final String SLICE_HINT_NOTE = "androidx.credentials.provider.createEntry.SLICE_HINT_NOTE";
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_SPEC_TYPE = "CreateEntry";
    private static final String TAG = "CreateEntry";
    public static final String TYPE_TOTAL_CREDENTIAL = "TOTAL_CREDENTIAL_COUNT_TYPE";
    private final CharSequence accountName;
    private final BiometricPromptData biometricPromptData;
    private final Map<String, Integer> credentialCountInformationMap;
    private final CharSequence description;
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final Instant lastUsedTime;
    private final PendingIntent pendingIntent;

    /* compiled from: WazeSource */
    final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        public static final CreateEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<SliceItem> items = slice.getItems();
            x.e(items, "getItems(...)");
            Map mapC = linkedHashMap;
            boolean z = false;
            CharSequence text = null;
            PendingIntent action = null;
            Icon icon = null;
            CharSequence text2 = null;
            Instant instantOfEpochMilli = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CreateEntry.SLICE_HINT_ACCOUNT_NAME)) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_ICON)) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION)) {
                    mapC = au.c(CreateEntry.Companion.convertBundleToCredentialCountInfo$credentials(sliceItem.getBundle()));
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_NOTE)) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_AUTO_SELECT_ALLOWED) && x.n(sliceItem.getText(), "true")) {
                    z = true;
                }
            }
            try {
                x.c(text);
                x.c(action);
                return new CreateEntry(text, action, icon, text2, instantOfEpochMilli, mapC, z, (BiometricPromptData) null, 128, (o) null);
            } catch (Exception e2) {
                Log.i("CreateEntry", "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public static final Slice toSlice(CreateEntry createEntry) {
            x.f(createEntry, "createEntry");
            Slice sliceBuild = INSTANCE.addToSlice(createEntry).build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final Slice.Builder addToSlice(CreateEntry createEntry) {
            x.f(createEntry, "createEntry");
            CharSequence accountName = createEntry.getAccountName();
            Icon icon = createEntry.getIcon();
            CharSequence description = createEntry.getDescription();
            Instant lastUsedTime = createEntry.getLastUsedTime();
            Map<String, Integer> map = createEntry.credentialCountInformationMap;
            PendingIntent pendingIntent = createEntry.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = true != createEntry.isAutoSelectAllowed() ? "false" : "true";
            builder.addText(accountName, null, i.d(CreateEntry.SLICE_HINT_ACCOUNT_NAME));
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, i.d(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            if (description != null) {
                builder.addText(description, null, i.d(CreateEntry.SLICE_HINT_NOTE));
            }
            if (icon != null) {
                builder.addIcon(icon, null, i.d(CreateEntry.SLICE_HINT_ICON));
            }
            if (CreateEntry.Companion.convertCredentialCountInfoToBundle$credentials(map) != null) {
                builder.addBundle(CreateEntry.Companion.convertCredentialCountInfoToBundle$credentials(map), null, i.d(CreateEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(CreateEntry.SLICE_HINT_PENDING_INTENT)).build(), null).addText(str, null, i.d(CreateEntry.SLICE_HINT_AUTO_SELECT_ALLOWED));
            return builder;
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final CreateEntry fromCreateEntry(android.service.credentials.CreateEntry createEntry) {
            x.f(createEntry, "createEntry");
            Slice slice = createEntry.getSlice();
            x.e(slice, "getSlice(...)");
            return CreateEntry.Companion.fromSlice(slice);
        }
    }

    /* compiled from: WazeSource */
    final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        private final void addToSlice(CreateEntry createEntry, Slice.Builder builder) {
            BiometricPromptData biometricPromptData = createEntry.getBiometricPromptData();
            if (biometricPromptData != null) {
                builder.addInt(biometricPromptData.getAllowedAuthenticators(), null, i.d(CreateEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    builder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, i.d(CreateEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                builder.addBundle(BiometricPromptData.Companion.toBundle(biometricPromptData), null, i.d(CreateEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }

        public static final CreateEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            CreateEntry createEntryFromSlice = Api28Impl.fromSlice(slice);
            if (createEntryFromSlice == null) {
                return null;
            }
            List<SliceItem> items = slice.getItems();
            x.e(items, "getItems(...)");
            Bundle bundle = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA)) {
                    bundle = sliceItem.getBundle();
                }
            }
            try {
                return new CreateEntry(createEntryFromSlice.getAccountName(), createEntryFromSlice.getPendingIntent(), createEntryFromSlice.getIcon(), createEntryFromSlice.getDescription(), createEntryFromSlice.getLastUsedTime(), createEntryFromSlice.credentialCountInformationMap, createEntryFromSlice.isAutoSelectAllowed(), bundle != null ? BiometricPromptData.Companion.fromBundle(bundle) : null);
            } catch (Exception e2) {
                Log.i("CreateEntry", "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public static final Slice toSlice(CreateEntry createEntry) {
            x.f(createEntry, "createEntry");
            Slice.Builder builderAddToSlice = Api28Impl.INSTANCE.addToSlice(createEntry);
            INSTANCE.addToSlice(createEntry, builderAddToSlice);
            Slice sliceBuild = builderAddToSlice.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final CharSequence accountName;
        private boolean autoSelectAllowed;
        private BiometricPromptData biometricPromptData;
        private Map<String, Integer> credentialCountInformationMap;
        private CharSequence description;
        private Icon icon;
        private Instant lastUsedTime;
        private Integer passwordCredentialCount;
        private final PendingIntent pendingIntent;
        private Integer publicKeyCredentialCount;
        private Integer totalCredentialCount;

        public Builder(CharSequence charSequence, PendingIntent pendingIntent) {
            x.f(charSequence, "accountName");
            x.f(pendingIntent, "pendingIntent");
            this.accountName = charSequence;
            this.pendingIntent = pendingIntent;
            this.credentialCountInformationMap = new LinkedHashMap();
        }

        public final CreateEntry build() {
            return new CreateEntry(this.accountName, this.pendingIntent, this.icon, this.description, this.lastUsedTime, this.credentialCountInformationMap, this.autoSelectAllowed, this.biometricPromptData);
        }

        public final Builder setAutoSelectAllowed(boolean z) {
            this.autoSelectAllowed = z;
            return this;
        }

        public final Builder setBiometricPromptData(BiometricPromptData biometricPromptData) {
            this.biometricPromptData = biometricPromptData;
            return this;
        }

        public final Builder setDescription(CharSequence charSequence) {
            if ((charSequence != null ? Integer.valueOf(charSequence.length()) : null) != null && charSequence.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            this.description = charSequence;
            return this;
        }

        public final Builder setIcon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder setLastUsedTime(Instant instant) {
            this.lastUsedTime = instant;
            return this;
        }

        public final Builder setPasswordCredentialCount(int i2) {
            Integer numValueOf = Integer.valueOf(i2);
            this.passwordCredentialCount = numValueOf;
            this.credentialCountInformationMap.put(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, numValueOf);
            return this;
        }

        public final Builder setPublicKeyCredentialCount(int i2) {
            Integer numValueOf = Integer.valueOf(i2);
            this.publicKeyCredentialCount = numValueOf;
            this.credentialCountInformationMap.put(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, numValueOf);
            return this;
        }

        public final Builder setTotalCredentialCount(int i2) {
            Integer numValueOf = Integer.valueOf(i2);
            this.totalCredentialCount = numValueOf;
            this.credentialCountInformationMap.put(CreateEntry.TYPE_TOTAL_CREDENTIAL, numValueOf);
            return this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, r.m(new k(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, num), new k(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, num2), new k(TYPE_TOTAL_CREDENTIAL, num3)), z, (BiometricPromptData) null, 128, (o) null);
        x.f(charSequence, "accountName");
        x.f(pendingIntent, "pendingIntent");
    }

    public static final CreateEntry fromCreateEntry(android.service.credentials.CreateEntry createEntry) {
        return Companion.fromCreateEntry(createEntry);
    }

    public static final CreateEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(CreateEntry createEntry) {
        return Companion.toSlice(createEntry);
    }

    public final CharSequence getAccountName() {
        return this.accountName;
    }

    public final BiometricPromptData getBiometricPromptData() {
        return this.biometricPromptData;
    }

    public final CharSequence getDescription() {
        return this.description;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    public final Integer getPasswordCredentialCount() {
        return this.credentialCountInformationMap.get(PasswordCredential.TYPE_PASSWORD_CREDENTIAL);
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final Integer getPublicKeyCredentialCount() {
        return this.credentialCountInformationMap.get(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL);
    }

    public final Integer getTotalCredentialCount() {
        return this.credentialCountInformationMap.get(TYPE_TOTAL_CREDENTIAL);
    }

    public final boolean isAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Map<String, Integer> convertBundleToCredentialCountInfo$credentials(Bundle bundle) {
            HashMap map = new HashMap();
            if (bundle == null) {
                return map;
            }
            Set<String> setKeySet = bundle.keySet();
            x.e(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                try {
                    map.put(str, Integer.valueOf(bundle.getInt(str)));
                } catch (Exception e2) {
                    Log.i("CreateEntry", "Issue unpacking credential count info bundle: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            return map;
        }

        public final Bundle convertCredentialCountInfoToBundle$credentials(Map<String, Integer> map) {
            x.f(map, "credentialCountInformationMap");
            Bundle bundle = new Bundle();
            boolean z = false;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    x.c(value);
                    bundle.putInt(key, value.intValue());
                    z = true;
                }
            }
            if (z) {
                return bundle;
            }
            return null;
        }

        public final CreateEntry fromCreateEntry(android.service.credentials.CreateEntry createEntry) {
            x.f(createEntry, "createEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCreateEntry(createEntry);
            }
            return null;
        }

        public final CreateEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall(List<CreateEntry> list, Bundle bundle) {
            x.f(list, "<this>");
            x.f(bundle, "bundle");
            bundle.putInt(CreateEntry.EXTRA_CREATE_ENTRY_SIZE, list.size());
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i.p();
                }
                CreateEntry createEntry = (CreateEntry) obj;
                bundle.putCharSequence(a.a(i2, CreateEntry.EXTRA_CREATE_ACCOUNT_NAME_PREFIX), createEntry.getAccountName());
                bundle.putParcelable(a.a(i2, "androidx.credentials.provider.extra.PENDING_INTENT_"), createEntry.getPendingIntent());
                Icon icon = createEntry.getIcon();
                if (icon != null) {
                    bundle.putParcelable(a.a(i2, "androidx.credentials.provider.extra.ICON_"), icon);
                }
                CharSequence description = createEntry.getDescription();
                if (description != null) {
                    bundle.putCharSequence(a.a(i2, CreateEntry.EXTRA_CREATE_DESCRIPTION_PREFIX), description);
                }
                Instant lastUsedTime = createEntry.getLastUsedTime();
                if (lastUsedTime != null) {
                    bundle.putLong(a.a(i2, "androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_"), lastUsedTime.toEpochMilli());
                }
                Bundle bundleConvertCredentialCountInfoToBundle$credentials = CreateEntry.Companion.convertCredentialCountInfoToBundle$credentials(createEntry.credentialCountInformationMap);
                if (bundleConvertCredentialCountInfoToBundle$credentials != null) {
                    bundle.putBundle(a.a(i2, CreateEntry.EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX), bundleConvertCredentialCountInfoToBundle$credentials);
                }
                bundle.putBoolean(a.a(i2, "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_"), createEntry.isAutoSelectAllowed());
                i2 = i3;
            }
        }

        public final Slice toSlice(CreateEntry createEntry) {
            x.f(createEntry, "createEntry");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(createEntry) : Api28Impl.toSlice(createEntry);
        }

        public final List<CreateEntry> unmarshallCreateEntries(Bundle bundle) {
            x.f(bundle, "<this>");
            try {
                ArrayList arrayList = new ArrayList();
                int i2 = bundle.getInt(CreateEntry.EXTRA_CREATE_ENTRY_SIZE, 0);
                for (int i3 = 0; i3 < i2; i3++) {
                    CharSequence charSequence = bundle.getCharSequence(a.a(i3, CreateEntry.EXTRA_CREATE_ACCOUNT_NAME_PREFIX));
                    if (charSequence == null) {
                        return i.h();
                    }
                    PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(a.a(i3, "androidx.credentials.provider.extra.PENDING_INTENT_"));
                    if (pendingIntent == null) {
                        return i.h();
                    }
                    Icon icon = (Icon) bundle.getParcelable(a.a(i3, "androidx.credentials.provider.extra.ICON_"));
                    CharSequence charSequence2 = bundle.getCharSequence(a.a(i3, CreateEntry.EXTRA_CREATE_DESCRIPTION_PREFIX));
                    Map mapT = r.t(convertBundleToCredentialCountInfo$credentials(bundle.getBundle(a.a(i3, CreateEntry.EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX))));
                    boolean z = bundle.getBoolean(a.a(i3, "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_"), false);
                    Instant instantOfEpochMilli = null;
                    if (bundle.containsKey(a.a(i3, "androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_"))) {
                        try {
                            instantOfEpochMilli = Instant.ofEpochMilli(bundle.getLong(a.a(i3, "androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_")));
                        } catch (Exception unused) {
                        }
                    }
                    arrayList.add(new CreateEntry(charSequence, pendingIntent, icon, charSequence2, instantOfEpochMilli, mapT, z, (BiometricPromptData) null, 128, (o) null));
                }
                return arrayList;
            } catch (Exception unused2) {
                return i.h();
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, Icon icon, CharSequence charSequence2, Instant instant, Map map, boolean z, BiometricPromptData biometricPromptData, int i2, o oVar) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, map, z, (i2 & 128) != 0 ? null : biometricPromptData);
    }

    public CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, Icon icon, CharSequence charSequence2, Instant instant, Map<String, Integer> map, boolean z, BiometricPromptData biometricPromptData) {
        x.f(charSequence, "accountName");
        x.f(pendingIntent, "pendingIntent");
        x.f(map, "credentialCountInformationMap");
        this.accountName = charSequence;
        this.pendingIntent = pendingIntent;
        this.icon = icon;
        this.description = charSequence2;
        this.lastUsedTime = instant;
        this.credentialCountInformationMap = map;
        this.isAutoSelectAllowed = z;
        this.biometricPromptData = biometricPromptData;
        if (charSequence.length() > 0) {
            if (charSequence2 != null && charSequence2.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            return;
        }
        throw new IllegalArgumentException("accountName must not be empty");
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z, int i2, o oVar) {
        this(charSequence, pendingIntent, (i2 & 4) != 0 ? null : charSequence2, (i2 & 8) != 0 ? null : instant, (i2 & 16) != 0 ? null : icon, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : num3, z & ((i2 & 256) == 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z, BiometricPromptData biometricPromptData) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, r.m(new k(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, num), new k(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, num2), new k(TYPE_TOTAL_CREDENTIAL, num3)), z, biometricPromptData);
        x.f(charSequence, "accountName");
        x.f(pendingIntent, "pendingIntent");
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z, BiometricPromptData biometricPromptData, int i2, o oVar) {
        this(charSequence, pendingIntent, (i2 & 4) != 0 ? null : charSequence2, (i2 & 8) != 0 ? null : instant, (i2 & 16) != 0 ? null : icon, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : num3, z & ((i2 & 256) == 0), (i2 & 512) != 0 ? null : biometricPromptData);
    }
}
