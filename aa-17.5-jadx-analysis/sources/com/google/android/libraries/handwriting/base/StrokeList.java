package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class StrokeList extends ArrayList<Stroke> implements Parcelable {
    private static final String FORMAT_STR = "%.4e";
    public static final String INK = "ink";
    public static final String LANGUAGE = "language";
    public static final String PRE_CONTEXT = "pre_context";
    public static final String WRITING_GUIDE = "writing_guide";
    public static final String WRITING_GUIDE_HEIGHT = "writing_area_height";
    public static final String WRITING_GUIDE_WIDTH = "writing_area_width";
    private static final long serialVersionUID = 1;
    private int firstStrokeId;
    private String inputType;
    private int lastStrokeId;
    private String postContext;
    private String preContext;
    private String userId;
    private int writingGuideHeight;
    private int writingGuideWidth;
    public static final StrokeList EMPTY = new StrokeList();
    public static final Parcelable.Creator<StrokeList> CREATOR = new Parcelable.Creator<StrokeList>() { // from class: com.google.android.libraries.handwriting.base.StrokeList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrokeList createFromParcel(Parcel parcel) {
            return new StrokeList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrokeList[] newArray(int i) {
            return new StrokeList[i];
        }
    };

    public StrokeList(StrokeList strokeList, boolean z) {
        super(strokeList.size());
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.inputType = "";
        this.preContext = "";
        this.postContext = "";
        this.userId = "";
        this.writingGuideHeight = strokeList.writingGuideHeight;
        this.writingGuideWidth = strokeList.writingGuideWidth;
        this.inputType = strokeList.inputType;
        this.firstStrokeId = strokeList.firstStrokeId;
        this.lastStrokeId = strokeList.lastStrokeId;
        if (!z) {
            this.preContext = strokeList.preContext;
            this.postContext = strokeList.postContext;
            this.userId = strokeList.userId;
            addAll(strokeList);
            return;
        }
        this.preContext = strokeList.preContext;
        this.postContext = strokeList.postContext;
        this.userId = strokeList.userId;
        int size = strokeList.size();
        for (int i = 0; i < size; i++) {
            add(new Stroke(strokeList.get(i)));
        }
    }

    private static double roundToSignificantDigits(double d) {
        return Double.parseDouble(String.format(Locale.ENGLISH, FORMAT_STR, Double.valueOf(d)));
    }

    public JSONArray asJsonArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int size = size();
        long j = -1;
        for (int i = 0; i < size; i++) {
            Stroke stroke = get(i);
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            Iterator<Stroke.Point> it = stroke.iterator();
            while (it.hasNext()) {
                jSONArray3.put(roundToSignificantDigits(it.next().x));
            }
            jSONArray2.put(jSONArray3);
            JSONArray jSONArray4 = new JSONArray();
            Iterator<Stroke.Point> it2 = stroke.iterator();
            while (it2.hasNext()) {
                jSONArray4.put(roundToSignificantDigits(it2.next().y));
            }
            jSONArray2.put(jSONArray4);
            JSONArray jSONArray5 = new JSONArray();
            Iterator<Stroke.Point> it3 = stroke.iterator();
            while (it3.hasNext()) {
                Stroke.Point next = it3.next();
                if (j == -1) {
                    j = next.t;
                }
                jSONArray5.put(next.t - j);
            }
            jSONArray2.put(jSONArray5);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public JSONObject asJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(INK, asJsonArray());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(WRITING_GUIDE_WIDTH, getWritingGuideWidth());
        jSONObject2.put(WRITING_GUIDE_HEIGHT, getWritingGuideHeight());
        jSONObject.put(WRITING_GUIDE, jSONObject2);
        String str = this.preContext;
        if (str != null && str.length() > 0) {
            jSONObject.put("pre_context", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equivalent(StrokeList strokeList) {
        if (strokeList == this) {
            return true;
        }
        if (strokeList == null || size() != strokeList.size()) {
            return false;
        }
        int size = size();
        do {
            size--;
            if (size < 0) {
                return true;
            }
        } while (get(size).equivalent(strokeList.get(size)));
        return false;
    }

    /* renamed from: getFirst, reason: merged with bridge method [inline-methods] */
    public Stroke m252getFirst() {
        return get(0);
    }

    public int getFirstStrokeId() {
        return this.firstStrokeId;
    }

    public String getInputType() {
        return this.inputType;
    }

    /* renamed from: getLast, reason: merged with bridge method [inline-methods] */
    public Stroke m253getLast() {
        return get(size() - 1);
    }

    public int getLastStrokeId() {
        return this.lastStrokeId;
    }

    public String getPostContext() {
        return this.postContext;
    }

    public String getPreContext() {
        return this.preContext;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getWritingGuideHeight() {
        return this.writingGuideHeight;
    }

    public int getWritingGuideWidth() {
        return this.writingGuideWidth;
    }

    public String logString() {
        StringBuilder sb = new StringBuilder("ink with ");
        sb.append(size());
        sb.append(" strokes.\nwriting guide ");
        sb.append(this.writingGuideWidth);
        sb.append(" x ");
        sb.append(this.writingGuideHeight);
        sb.append(" inputType: ");
        sb.append(this.inputType);
        sb.append(" precontext: ");
        sb.append(this.preContext);
        sb.append(" postcontext: ");
        sb.append(this.postContext);
        sb.append(" userId: ");
        sb.append(this.userId);
        for (int i = 0; i < size(); i++) {
            Stroke stroke = get(i);
            sb.append("   stroke ");
            sb.append(i);
            sb.append(":");
            for (int i2 = 0; i2 < stroke.size(); i2++) {
                sb.append("[");
                sb.append(stroke.get(i2).x);
                sb.append(",");
                sb.append(stroke.get(i2).y);
                sb.append(",");
                sb.append(stroke.get(i2).t);
                sb.append(",");
                sb.append(stroke.get(i2).p);
                sb.append("],");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void parseFromJsonArray(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        int i;
        int length = jSONArray.length();
        clear();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            JSONArray jSONArray4 = jSONArray.getJSONArray(i3);
            Stroke stroke = new Stroke();
            JSONArray jSONArray5 = jSONArray4.getJSONArray(i2);
            JSONArray jSONArray6 = jSONArray4.getJSONArray(1);
            if (jSONArray4.length() > 2) {
                JSONArray jSONArray7 = jSONArray4.getJSONArray(2);
                JSONArray jSONArray8 = jSONArray4.length() > 3 ? jSONArray4.getJSONArray(3) : null;
                jSONArray2 = jSONArray7;
                jSONArray3 = jSONArray8;
            } else {
                jSONArray2 = null;
                jSONArray3 = null;
            }
            int i4 = i2;
            while (i4 < jSONArray5.length()) {
                if (jSONArray2 == null) {
                    i = i3;
                    stroke.addPoint((float) jSONArray5.getDouble(i4), (float) jSONArray6.getDouble(i4), 0L, 1.0f);
                } else if (jSONArray3 != null) {
                    i = i3;
                    stroke.addPoint((float) jSONArray5.getDouble(i4), (float) jSONArray6.getDouble(i4), jSONArray2.getLong(i4), (float) jSONArray3.getDouble(i4));
                } else {
                    i = i3;
                    stroke.addPoint((float) jSONArray5.getDouble(i4), (float) jSONArray6.getDouble(i4), jSONArray2.getLong(i4), 1.0f);
                }
                i4++;
                i3 = i;
            }
            add(stroke);
            i3++;
            i2 = 0;
        }
    }

    public void readFromParcel(Parcel parcel) {
        this.writingGuideWidth = parcel.readInt();
        this.writingGuideHeight = parcel.readInt();
        this.inputType = parcel.readString();
        this.preContext = parcel.readString();
        this.postContext = parcel.readString();
        this.userId = parcel.readString();
        this.firstStrokeId = parcel.readInt();
        this.lastStrokeId = parcel.readInt();
        parcel.readTypedList(this, Stroke.CREATOR);
    }

    public void setFirstStrokeId(int i) {
        this.firstStrokeId = i;
    }

    public void setInputType(int i) {
        this.inputType = String.valueOf(i);
    }

    public void setLastStrokeId(int i) {
        this.lastStrokeId = i;
    }

    public void setPostContext(String str) {
        this.postContext = str;
    }

    public void setPreContext(String str) {
        this.preContext = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setWritingGuide(int i, int i2) {
        this.writingGuideWidth = i;
        this.writingGuideHeight = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.writingGuideWidth);
        parcel.writeInt(this.writingGuideHeight);
        parcel.writeString(this.inputType);
        parcel.writeString(this.preContext);
        parcel.writeString(this.postContext);
        parcel.writeString(this.userId);
        parcel.writeInt(this.firstStrokeId);
        parcel.writeInt(this.lastStrokeId);
        parcel.writeTypedList(this);
    }

    public void setInputType(String str) {
        this.inputType = str;
    }

    public static class Cut {
        public final float cost;
        public final int point;
        public final int stroke;
        public final CutType type;

        public enum CutType {
            STROKES,
            MINIMUM,
            MAXIMUM,
            BETWEEN,
            VELOCITY,
            DEPRECATED_RENDERED,
            MONOTONIC,
            OVERWRITE,
            CLASSIFIER,
            EVERY_POINT
        }

        public Cut(int i, int i2) {
            this.stroke = i;
            this.point = i2;
            this.cost = BitmapDescriptorFactory.HUE_RED;
            this.type = CutType.STROKES;
        }

        public Cut(int i, int i2, float f, CutType cutType) {
            this.stroke = i;
            this.point = i2;
            this.cost = f;
            this.type = cutType;
        }
    }

    public StrokeList(int i) {
        super(i);
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.inputType = "";
        this.preContext = "";
        this.postContext = "";
        this.userId = "";
    }

    public StrokeList(Parcel parcel) {
        this();
        readFromParcel(parcel);
    }

    public StrokeList() {
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.inputType = "";
        this.preContext = "";
        this.postContext = "";
        this.userId = "";
    }

    public StrokeList(JSONObject jSONObject) throws JSONException {
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.inputType = "";
        this.preContext = "";
        this.postContext = "";
        this.userId = "";
        parseFromJsonArray(jSONObject.getJSONArray(INK));
        this.writingGuideWidth = jSONObject.getJSONObject(WRITING_GUIDE).getInt(WRITING_GUIDE_WIDTH);
        this.writingGuideHeight = jSONObject.getJSONObject(WRITING_GUIDE).getInt(WRITING_GUIDE_HEIGHT);
        this.preContext = jSONObject.optString("pre_context", "");
    }
}
