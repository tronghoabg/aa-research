package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class StrokeList extends java.util.ArrayList<com.google.android.libraries.handwriting.base.Stroke> implements android.os.Parcelable {
    private static final java.lang.String FORMAT_STR = "%.4e";
    public static final java.lang.String INK = "ink";
    public static final java.lang.String LANGUAGE = "language";
    public static final java.lang.String PRE_CONTEXT = "pre_context";
    public static final java.lang.String WRITING_GUIDE = "writing_guide";
    public static final java.lang.String WRITING_GUIDE_HEIGHT = "writing_area_height";
    public static final java.lang.String WRITING_GUIDE_WIDTH = "writing_area_width";
    private static final long serialVersionUID = 1;
    private int firstStrokeId;
    private java.lang.String inputType;
    private int lastStrokeId;
    private java.lang.String postContext;
    private java.lang.String preContext;
    private java.lang.String userId;
    private int writingGuideHeight;
    private int writingGuideWidth;
    public static final com.google.android.libraries.handwriting.base.StrokeList EMPTY = new com.google.android.libraries.handwriting.base.StrokeList();
    public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.StrokeList> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.StrokeList>() { // from class: com.google.android.libraries.handwriting.base.StrokeList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.StrokeList createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.libraries.handwriting.base.StrokeList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.StrokeList[] newArray(int i) {
            return new com.google.android.libraries.handwriting.base.StrokeList[i];
        }
    };

    public StrokeList(com.google.android.libraries.handwriting.base.StrokeList strokeList, boolean z) {
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
            add(new com.google.android.libraries.handwriting.base.Stroke(strokeList.get(i)));
        }
    }

    private static double roundToSignificantDigits(double d) {
        return java.lang.Double.parseDouble(java.lang.String.format(java.util.Locale.ENGLISH, FORMAT_STR, java.lang.Double.valueOf(d)));
    }

    public org.json.JSONArray asJsonArray() throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int size = size();
        long j = -1;
        for (int i = 0; i < size; i++) {
            com.google.android.libraries.handwriting.base.Stroke stroke = get(i);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            java.util.Iterator<com.google.android.libraries.handwriting.base.Stroke.Point> it = stroke.iterator();
            while (it.hasNext()) {
                jSONArray3.put(roundToSignificantDigits(it.next().x));
            }
            jSONArray2.put(jSONArray3);
            org.json.JSONArray jSONArray4 = new org.json.JSONArray();
            java.util.Iterator<com.google.android.libraries.handwriting.base.Stroke.Point> it2 = stroke.iterator();
            while (it2.hasNext()) {
                jSONArray4.put(roundToSignificantDigits(it2.next().y));
            }
            jSONArray2.put(jSONArray4);
            org.json.JSONArray jSONArray5 = new org.json.JSONArray();
            for (com.google.android.libraries.handwriting.base.Stroke.Point point : stroke) {
                if (j == -1) {
                    j = point.t;
                }
                jSONArray5.put(point.t - j);
            }
            jSONArray2.put(jSONArray5);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public org.json.JSONObject asJsonObject() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(INK, asJsonArray());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(WRITING_GUIDE_WIDTH, getWritingGuideWidth());
        jSONObject2.put(WRITING_GUIDE_HEIGHT, getWritingGuideHeight());
        jSONObject.put(WRITING_GUIDE, jSONObject2);
        java.lang.String str = this.preContext;
        if (str != null && str.length() > 0) {
            jSONObject.put("pre_context", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equivalent(com.google.android.libraries.handwriting.base.StrokeList strokeList) {
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

    /* JADX INFO: renamed from: getFirst, reason: merged with bridge method [inline-methods] */
    public com.google.android.libraries.handwriting.base.Stroke m256getFirst() {
        return get(0);
    }

    public int getFirstStrokeId() {
        return this.firstStrokeId;
    }

    public java.lang.String getInputType() {
        return this.inputType;
    }

    /* JADX INFO: renamed from: getLast, reason: merged with bridge method [inline-methods] */
    public com.google.android.libraries.handwriting.base.Stroke m257getLast() {
        return get(size() - 1);
    }

    public int getLastStrokeId() {
        return this.lastStrokeId;
    }

    public java.lang.String getPostContext() {
        return this.postContext;
    }

    public java.lang.String getPreContext() {
        return this.preContext;
    }

    public java.lang.String getUserId() {
        return this.userId;
    }

    public int getWritingGuideHeight() {
        return this.writingGuideHeight;
    }

    public int getWritingGuideWidth() {
        return this.writingGuideWidth;
    }

    public java.lang.String logString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ink with ");
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
            com.google.android.libraries.handwriting.base.Stroke stroke = get(i);
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

    public void parseFromJsonArray(org.json.JSONArray jSONArray) throws org.json.JSONException {
        org.json.JSONArray jSONArray2;
        org.json.JSONArray jSONArray3;
        int length = jSONArray.length();
        clear();
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            org.json.JSONArray jSONArray4 = jSONArray.getJSONArray(i2);
            com.google.android.libraries.handwriting.base.Stroke stroke = new com.google.android.libraries.handwriting.base.Stroke();
            org.json.JSONArray jSONArray5 = jSONArray4.getJSONArray(i);
            org.json.JSONArray jSONArray6 = jSONArray4.getJSONArray(1);
            if (jSONArray4.length() > 2) {
                org.json.JSONArray jSONArray7 = jSONArray4.getJSONArray(2);
                org.json.JSONArray jSONArray8 = jSONArray4.length() > 3 ? jSONArray4.getJSONArray(3) : null;
                jSONArray2 = jSONArray7;
                jSONArray3 = jSONArray8;
            } else {
                jSONArray2 = null;
                jSONArray3 = null;
            }
            int i3 = i;
            while (i3 < jSONArray5.length()) {
                if (jSONArray2 == null) {
                    stroke.addPoint((float) jSONArray5.getDouble(i3), (float) jSONArray6.getDouble(i3), 0L, 1.0f);
                } else if (jSONArray3 != null) {
                    stroke.addPoint((float) jSONArray5.getDouble(i3), (float) jSONArray6.getDouble(i3), jSONArray2.getLong(i3), (float) jSONArray3.getDouble(i3));
                } else {
                    stroke.addPoint((float) jSONArray5.getDouble(i3), (float) jSONArray6.getDouble(i3), jSONArray2.getLong(i3), 1.0f);
                }
                i3++;
                i2 = i2;
            }
            add(stroke);
            i2++;
            i = 0;
        }
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.writingGuideWidth = parcel.readInt();
        this.writingGuideHeight = parcel.readInt();
        this.inputType = parcel.readString();
        this.preContext = parcel.readString();
        this.postContext = parcel.readString();
        this.userId = parcel.readString();
        this.firstStrokeId = parcel.readInt();
        this.lastStrokeId = parcel.readInt();
        parcel.readTypedList(this, com.google.android.libraries.handwriting.base.Stroke.CREATOR);
    }

    public void setFirstStrokeId(int i) {
        this.firstStrokeId = i;
    }

    public void setInputType(int i) {
        this.inputType = java.lang.String.valueOf(i);
    }

    public void setLastStrokeId(int i) {
        this.lastStrokeId = i;
    }

    public void setPostContext(java.lang.String str) {
        this.postContext = str;
    }

    public void setPreContext(java.lang.String str) {
        this.preContext = str;
    }

    public void setUserId(java.lang.String str) {
        this.userId = str;
    }

    public void setWritingGuide(int i, int i2) {
        this.writingGuideWidth = i;
        this.writingGuideHeight = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
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

    public void setInputType(java.lang.String str) {
        this.inputType = str;
    }

    public static class Cut {
        public final float cost;
        public final int point;
        public final int stroke;
        public final com.google.android.libraries.handwriting.base.StrokeList.Cut.CutType type;

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
            this.cost = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            this.type = com.google.android.libraries.handwriting.base.StrokeList.Cut.CutType.STROKES;
        }

        public Cut(int i, int i2, float f, com.google.android.libraries.handwriting.base.StrokeList.Cut.CutType cutType) {
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

    public StrokeList(android.os.Parcel parcel) {
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

    public StrokeList(org.json.JSONObject jSONObject) throws org.json.JSONException {
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
