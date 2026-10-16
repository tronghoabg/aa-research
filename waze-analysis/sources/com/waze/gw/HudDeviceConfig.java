package com.waze.gw;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class HudDeviceConfig {
    static final String INTEGER = "integer";
    static final int MAX_ITEMS = 32;
    static final int MAX_OPTIONS = 32;
    static final int MAX_TEXT_LENGTH = 128;
    static final String SELECTION = "selection";
    static final String SLIDER = "slider";
    static final String TEXT = "text";
    static final String TOGGLE = "toggle";
    private static long activeSession;
    private static long generation;
    private static final CopyOnWriteArrayList<Listener> LISTENERS = new CopyOnWriteArrayList<>();
    private static Snapshot snapshot = new Snapshot(null, "idle", "", 0);

    interface Listener {
        void onHudDeviceConfigChanged();
    }

    static final class Option {
        final String label;
        final String value;

        Option(String str, String str2) {
            this.value = str;
            this.label = str2;
        }
    }

    static final class Item {
        final String description;
        final String id;
        final String kind;
        final String label;
        final int max;
        final int maxLength;
        final int min;
        final List<Option> options;
        final int step;
        final Object value;

        Item(String str, String str2, String str3, String str4, Object obj, int i2, int i3, int i4, int i5, List<Option> list) {
            this.id = str;
            this.kind = str2;
            this.label = str3;
            this.description = str4;
            this.value = obj;
            this.min = i2;
            this.max = i3;
            this.step = i4;
            this.maxLength = i5;
            this.options = list == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
        }

        Item withValue(Object obj) {
            return new Item(this.id, this.kind, this.label, this.description, obj, this.min, this.max, this.step, this.maxLength, this.options);
        }
    }

    static final class Schema {
        final List<Item> items;
        final long revision;
        final String title;

        Schema(long j2, String str, List<Item> list) {
            this.revision = j2;
            this.title = str;
            this.items = Collections.unmodifiableList(new ArrayList(list));
        }
    }

    static final class Snapshot {
        static final String APPLIED = "applied";
        static final String APPLYING = "applying";
        static final String ERROR = "error";
        static final String IDLE = "idle";
        final String applyState;
        final long generation;
        final String message;
        final Schema schema;

        Snapshot(Schema schema, String str, String str2, long j2) {
            this.schema = schema;
            this.applyState = str;
            this.message = str2 == null ? "" : str2;
            this.generation = j2;
        }
    }

    static final class Assembler {
        private final long session;
        private long revision = -1;
        private int expected = -1;
        private String title = "Cấu hình thiết bị HUD";
        private final LinkedHashMap<String, Item> items = new LinkedHashMap<>();

        Assembler(long j2) {
            this.session = j2;
        }

        void begin(JSONObject jSONObject) throws JSONException {
            long jRequiredLong = HudDeviceConfig.requiredLong(jSONObject, "rev");
            int i2 = jSONObject.getInt("count");
            if (i2 < 0 || i2 > 32) {
                throw new JSONException("cfg count out of range");
            }
            this.revision = jRequiredLong;
            this.expected = i2;
            this.title = HudDeviceConfig.trim(jSONObject.optString(GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE, "Cấu hình thiết bị HUD"), 64);
            if (this.title.length() == 0) {
                this.title = "Cấu hình thiết bị HUD";
            }
            this.items.clear();
        }

        void item(JSONObject jSONObject) throws JSONException {
            ensureOpen(jSONObject);
            Item item = HudDeviceConfig.parseItem(jSONObject);
            if (this.items.containsKey(item.id)) {
                throw new JSONException("duplicate cfg id");
            }
            if (this.items.size() >= this.expected) {
                throw new JSONException("too many cfg items");
            }
            this.items.put(item.id, item);
        }

        void end(JSONObject jSONObject) throws JSONException {
            ensureOpen(jSONObject);
            if (this.items.size() != this.expected) {
                throw new JSONException("incomplete cfg schema");
            }
            HudDeviceConfig.publishSchema(this.session, new Schema(this.revision, this.title, new ArrayList(this.items.values())));
            this.revision = -1L;
            this.expected = -1;
            this.items.clear();
        }

        private void ensureOpen(JSONObject jSONObject) throws JSONException {
            if (this.expected < 0 || this.revision < 0) {
                throw new JSONException("cfg schema not started");
            }
            if (HudDeviceConfig.requiredLong(jSONObject, "rev") != this.revision) {
                throw new JSONException("cfg rev mismatch");
            }
        }
    }

    private HudDeviceConfig() {
    }

    static synchronized void beginSession(long j2) {
        activeSession = j2;
        long j3 = 1 + generation;
        generation = j3;
        snapshot = new Snapshot(null, "idle", "", j3);
        notifyListeners();
    }

    static synchronized void endSession(long j2) {
        if (activeSession != j2) {
            return;
        }
        activeSession = 0L;
        long j3 = 1 + generation;
        generation = j3;
        snapshot = new Snapshot(null, "idle", "", j3);
        notifyListeners();
    }

    static synchronized Snapshot snapshot() {
        return snapshot;
    }

    static void addListener(Listener listener) {
        if (listener != null) {
            LISTENERS.addIfAbsent(listener);
        }
    }

    static void removeListener(Listener listener) {
        LISTENERS.remove(listener);
    }

    static synchronized void applying(long j2) {
        if (activeSession == j2 && snapshot.schema != null) {
            Schema schema = snapshot.schema;
            long j3 = 1 + generation;
            generation = j3;
            snapshot = new Snapshot(schema, "applying", "Đang gửi cấu hình…", j3);
            notifyListeners();
        }
    }

    static synchronized void applyFailed(long j2, String str) {
        if (activeSession == j2 && snapshot.schema != null) {
            Schema schema = snapshot.schema;
            if (str == null) {
                str = "Thiết bị từ chối cấu hình";
            }
            long j3 = 1 + generation;
            generation = j3;
            snapshot = new Snapshot(schema, "error", str, j3);
            notifyListeners();
        }
    }

    static synchronized void applyFailedCurrent(String str) {
        if (activeSession != 0 && snapshot.schema != null) {
            Schema schema = snapshot.schema;
            if (str == null) {
                str = "Không thể gửi cấu hình";
            }
            long j2 = generation + 1;
            generation = j2;
            snapshot = new Snapshot(schema, "error", str, j2);
            notifyListeners();
        }
    }

    static synchronized void applied(long j2, long j3, Map<String, Object> map) {
        if (activeSession == j2 && snapshot.schema != null) {
            ArrayList arrayList = new ArrayList();
            for (Item item : snapshot.schema.items) {
                arrayList.add(item.withValue((map == null || !map.containsKey(item.id)) ? item.value : map.get(item.id)));
            }
            if (j3 < 0) {
                j3 = snapshot.schema.revision;
            }
            Schema schema = new Schema(j3, snapshot.schema.title, arrayList);
            long j4 = generation + 1;
            generation = j4;
            snapshot = new Snapshot(schema, "applied", "Đã lưu trên thiết bị", j4);
            notifyListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void publishSchema(long j2, Schema schema) {
        if (activeSession != j2) {
            return;
        }
        long j3 = 1 + generation;
        generation = j3;
        snapshot = new Snapshot(schema, "idle", "", j3);
        notifyListeners();
    }

    static LinkedHashMap<String, Object> validatedValues(Schema schema, Map<String, Object> map) {
        if (schema == null || map == null) {
            throw new IllegalArgumentException("no schema");
        }
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        for (Item item : schema.items) {
            linkedHashMap.put(item.id, validateValue(item, map.containsKey(item.id) ? map.get(item.id) : item.value));
        }
        return linkedHashMap;
    }

    private static Object validateValue(Item item, Object obj) {
        int iIntValue;
        if (TOGGLE.equals(item.kind)) {
            if (obj instanceof Boolean) {
                return obj;
            }
            if (obj instanceof String) {
                return Boolean.valueOf((String) obj);
            }
            throw new IllegalArgumentException(item.id + ": boolean required");
        }
        if (SLIDER.equals(item.kind) || "integer".equals(item.kind)) {
            if (obj instanceof Number) {
                iIntValue = ((Number) obj).intValue();
            } else {
                try {
                    iIntValue = Integer.parseInt(String.valueOf(obj));
                } catch (Throwable th) {
                    throw new IllegalArgumentException(item.id + ": integer required");
                }
            }
            if (iIntValue < item.min || iIntValue > item.max) {
                throw new IllegalArgumentException(item.id + ": value out of range");
            }
            if (SLIDER.equals(item.kind) && (iIntValue - item.min) % item.step != 0) {
                throw new IllegalArgumentException(item.id + ": invalid step");
            }
            return Integer.valueOf(iIntValue);
        }
        if (SELECTION.equals(item.kind)) {
            if (obj == null) {
                obj = "";
            }
            String strValueOf = String.valueOf(obj);
            Iterator<Option> it = item.options.iterator();
            while (it.hasNext()) {
                if (it.next().value.equals(strValueOf)) {
                    return strValueOf;
                }
            }
            throw new IllegalArgumentException(item.id + ": invalid option");
        }
        if (obj == null) {
            obj = "";
        }
        return trim(String.valueOf(obj), item.maxLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Item parseItem(JSONObject jSONObject) throws JSONException {
        String str;
        String string = jSONObject.getString(TtmlNode.ATTR_ID);
        if (string.matches("[A-Za-z0-9_.-]{1,40}")) {
            String lowerCase = jSONObject.getString("kind").toLowerCase(Locale.US);
            if (TOGGLE.equals(lowerCase) || SLIDER.equals(lowerCase) || SELECTION.equals(lowerCase) || "integer".equals(lowerCase) || "text".equals(lowerCase)) {
                String strTrim = trim(jSONObject.getString("label"), 64);
                if (strTrim.length() != 0) {
                    String strTrim2 = trim(jSONObject.optString("description", ""), 160);
                    int iOptInt = jSONObject.optInt("min", 0);
                    int iOptInt2 = jSONObject.optInt("max", 100);
                    int iMax = Math.max(1, jSONObject.optInt("step", 1));
                    int iMax2 = Math.max(1, Math.min(128, jSONObject.optInt("maxLength", 128)));
                    ArrayList arrayList = new ArrayList();
                    if (SELECTION.equals(lowerCase)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("options");
                        if (jSONArray.length() != 0) {
                            str = string;
                            if (jSONArray.length() <= 32) {
                                int i2 = 0;
                                while (i2 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    int i3 = i2;
                                    JSONArray jSONArray2 = jSONArray;
                                    String strTrim3 = trim(jSONObject2.getString("value"), 40);
                                    String strTrim4 = trim(jSONObject2.getString("label"), 64);
                                    if (strTrim3.length() == 0 || strTrim4.length() == 0) {
                                        throw new JSONException("empty cfg option");
                                    }
                                    arrayList.add(new Option(strTrim3, strTrim4));
                                    i2 = i3 + 1;
                                    jSONArray = jSONArray2;
                                }
                            }
                        }
                        throw new JSONException("invalid cfg options");
                    }
                    str = string;
                    if ((SLIDER.equals(lowerCase) || "integer".equals(lowerCase)) && iOptInt > iOptInt2) {
                        throw new JSONException("invalid cfg range");
                    }
                    Object objDefaultValue = jSONObject.has("value") ? jSONObject.get("value") : defaultValue(lowerCase, iOptInt, arrayList);
                    Item item = new Item(str, lowerCase, strTrim, strTrim2, objDefaultValue, iOptInt, iOptInt2, iMax, iMax2, arrayList);
                    try {
                        return item.withValue(validateValue(item, objDefaultValue));
                    } catch (IllegalArgumentException e2) {
                        throw new JSONException(e2.getMessage());
                    }
                }
                throw new JSONException("empty cfg label");
            }
            throw new JSONException("unsupported cfg kind");
        }
        throw new JSONException("invalid cfg id");
    }

    private static Object defaultValue(String str, int i2, List<Option> list) {
        if (TOGGLE.equals(str)) {
            return Boolean.FALSE;
        }
        if (SLIDER.equals(str) || "integer".equals(str)) {
            return Integer.valueOf(i2);
        }
        if (SELECTION.equals(str) && list != null && !list.isEmpty()) {
            return list.get(0).value;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long requiredLong(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str)) {
            throw new JSONException("missing " + str);
        }
        return jSONObject.getLong(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String trim(String str, int i2) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        return strTrim.codePointCount(0, strTrim.length()) <= i2 ? strTrim : strTrim.substring(0, strTrim.offsetByCodePoints(0, i2));
    }

    private static void notifyListeners() {
        Iterator<Listener> it = LISTENERS.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHudDeviceConfigChanged();
            } catch (Throwable th) {
            }
        }
    }
}
