package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.ArraySet;
import com.google.d.m.a.a.b;
import com.google.e.a.a;
import com.google.e.a.c.h;
import com.google.e.a.d;
import com.google.e.a.g;
import com.google.e.a.j.q;
import com.google.e.a.n;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final String mFileName;
    final d mKeyDeterministicAead;
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new CopyOnWriteArrayList<>();
    final String mMasterKeyAlias;
    final SharedPreferences mSharedPreferences;
    final a mValueAead;

    /* compiled from: WazeSource */
    final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void notifyListeners() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.mEncryptedSharedPreferences.mListeners.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.mKeysChanged.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, it2.next());
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(String.valueOf(str).concat(" is a reserved key for the encryption keyset."));
            }
            this.mKeysChanged.add(str);
            if (str == null) {
                str = EncryptedSharedPreferences.NULL_VALUE;
            }
            try {
                Pair<String, String> pairEncryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
                this.mEditor.putString((String) pairEncryptKeyValuePair.first, (String) pairEncryptKeyValuePair.second);
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not encrypt data: ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(EncryptedType.BOOLEAN.getId());
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.FLOAT.getId());
            byteBufferAllocate.putFloat(f2);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.INT.getId());
            byteBufferAllocate.putInt(i2);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(EncryptedType.LONG.getId());
            byteBufferAllocate.putLong(j2);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(EncryptedType.STRING.getId());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add(EncryptedSharedPreferences.NULL_VALUE);
            }
            ArrayList arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(EncryptedType.STRING_SET.getId());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                byte[] bArr = (byte[]) arrayList.get(i2);
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(String.valueOf(str).concat(" is a reserved key for the encryption keyset."));
            }
            this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
            this.mKeysChanged.add(str);
            return this;
        }
    }

    /* compiled from: WazeSource */
    enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        EncryptedType(int i2) {
            this.mId = i2;
        }

        public static EncryptedType fromId(int i2) {
            if (i2 == 0) {
                return STRING;
            }
            if (i2 == 1) {
                return STRING_SET;
            }
            if (i2 == 2) {
                return INT;
            }
            if (i2 == 3) {
                return LONG;
            }
            if (i2 == 4) {
                return FLOAT;
            }
            if (i2 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* compiled from: WazeSource */
    @Deprecated
    public enum PrefKeyEncryptionScheme {
        AES256_SIV("AES256_SIV");

        private final String mDeterministicAeadKeyTemplateName;

        PrefKeyEncryptionScheme(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        g getKeyTemplate() {
            return b.d(this.mDeterministicAeadKeyTemplateName);
        }
    }

    /* compiled from: WazeSource */
    @Deprecated
    public enum PrefValueEncryptionScheme {
        AES256_GCM("AES256_GCM");

        private final String mAeadKeyTemplateName;

        PrefValueEncryptionScheme(String str) {
            this.mAeadKeyTemplateName = str;
        }

        g getKeyTemplate() {
            return b.d(this.mAeadKeyTemplateName);
        }
    }

    EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, a aVar, d dVar) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = str2;
        this.mValueAead = aVar;
        this.mKeyDeterministicAead = dVar;
    }

    @Deprecated
    public static SharedPreferences create(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) {
        h.a();
        com.google.e.a.a.a.a();
        Context applicationContext = context.getApplicationContext();
        com.google.e.a.d.a.a aVar = new com.google.e.a.d.a.a();
        aVar.e(prefKeyEncryptionScheme.getKeyTemplate());
        aVar.g(applicationContext, KEY_KEYSET_ALIAS, str);
        aVar.f("android-keystore://".concat(String.valueOf(str2)));
        n nVarA = aVar.b().a();
        com.google.e.a.d.a.a aVar2 = new com.google.e.a.d.a.a();
        aVar2.e(prefValueEncryptionScheme.getKeyTemplate());
        aVar2.g(applicationContext, VALUE_KEYSET_ALIAS, str);
        aVar2.f("android-keystore://".concat(String.valueOf(str2)));
        n nVarA2 = aVar2.b().a();
        d dVar = (d) nVarA.i(d.class);
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (a) nVarA2.i(a.class), dVar);
    }

    private Object getDecryptedObject(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(String.valueOf(str).concat(" is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            String strEncryptKey = encryptKey(str);
            String string = this.mSharedPreferences.getString(strEncryptKey, null);
            if (string == null) {
                return null;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.mValueAead.a(q.b(string), strEncryptKey.getBytes(StandardCharsets.UTF_8)));
            byteBufferWrap.position(0);
            int i2 = byteBufferWrap.getInt();
            EncryptedType encryptedTypeFromId = EncryptedType.fromId(i2);
            if (encryptedTypeFromId == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i2);
            }
            int iOrdinal = encryptedTypeFromId.ordinal();
            if (iOrdinal == 0) {
                int i3 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i3);
                String string2 = StandardCharsets.UTF_8.decode(byteBufferSlice).toString();
                if (string2.equals(NULL_VALUE)) {
                    return null;
                }
                return string2;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return Integer.valueOf(byteBufferWrap.getInt());
                }
                if (iOrdinal == 3) {
                    return Long.valueOf(byteBufferWrap.getLong());
                }
                if (iOrdinal == 4) {
                    return Float.valueOf(byteBufferWrap.getFloat());
                }
                if (iOrdinal == 5) {
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                }
                throw new SecurityException("Unhandled type for encrypted pref value: " + encryptedTypeFromId);
            }
            ArraySet arraySet = new ArraySet();
            while (byteBufferWrap.hasRemaining()) {
                int i4 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                byteBufferSlice2.limit(i4);
                byteBufferWrap.position(byteBufferWrap.position() + i4);
                arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
            }
            if (arraySet.size() == 1 && NULL_VALUE.equals(arraySet.valueAt(0))) {
                return null;
            }
            return arraySet;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt value. ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(String.valueOf(str).concat(" is a reserved key for the encryption keyset."));
        }
        return this.mSharedPreferences.contains(encryptKey(str));
    }

    String decryptKey(String str) {
        try {
            String str2 = new String(this.mKeyDeterministicAead.a(q.b(str), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals(NULL_VALUE)) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt key. ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    String encryptKey(String str) {
        try {
            d dVar = this.mKeyDeterministicAead;
            Charset charset = StandardCharsets.UTF_8;
            if (str == null) {
                str = NULL_VALUE;
            }
            return q.a(dVar.b(str.getBytes(charset), this.mFileName.getBytes()));
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) {
        String strEncryptKey = encryptKey(str);
        return new Pair<>(strEncryptKey, q.a(this.mValueAead.b(bArr, strEncryptKey.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String strDecryptKey = decryptKey(entry.getKey());
                map.put(strDecryptKey, getDecryptedObject(strDecryptKey));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Boolean ? ((Boolean) decryptedObject).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Float ? ((Float) decryptedObject).floatValue() : f2;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Integer ? ((Integer) decryptedObject).intValue() : i2;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Long ? ((Long) decryptedObject).longValue() : j2;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof String ? (String) decryptedObject : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object decryptedObject = getDecryptedObject(str);
        Set<String> arraySet = decryptedObject instanceof Set ? (Set) decryptedObject : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    boolean isReservedKey(String str) {
        return KEY_KEYSET_ALIAS.equals(str) || VALUE_KEYSET_ALIAS.equals(str);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }

    public static SharedPreferences create(Context context, String str, MasterKey masterKey, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) {
        return create(str, masterKey.getKeyAlias(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }
}
