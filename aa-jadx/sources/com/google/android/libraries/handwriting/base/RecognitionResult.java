package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class RecognitionResult implements java.lang.Iterable<com.google.android.libraries.handwriting.base.ScoredCandidate>, android.os.Parcelable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int STROKES_IN_PARCEL = 1;
    private java.lang.String debugInfo;
    private com.google.android.libraries.handwriting.base.RecognitionResult.ExtraInfo extraInfo;
    private int firstStrokeId;
    private final java.lang.String inkHash;
    private int lastStrokeId;
    private long recognitionEndedTime;
    private long recognitionStartedTime;
    private com.google.android.libraries.handwriting.base.StrokeList recognizedStrokes;
    private int requestId;
    private final java.util.List<com.google.android.libraries.handwriting.base.ScoredCandidate> scoredResults;
    private final java.util.List<com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo> segmentationInfo;
    public static final com.google.android.libraries.handwriting.base.RecognitionResult EMPTY = new com.google.android.libraries.handwriting.base.RecognitionResult("");
    public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.RecognitionResult createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.libraries.handwriting.base.RecognitionResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.RecognitionResult[] newArray(int i) {
            return new com.google.android.libraries.handwriting.base.RecognitionResult[i];
        }
    };

    public interface ExtraInfo extends android.os.Parcelable {
    }

    public RecognitionResult(java.lang.String[] strArr, float[] fArr, java.lang.String[][] strArr2, int[][][][] iArr) {
        this.debugInfo = null;
        this.extraInfo = null;
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.recognizedStrokes = com.google.android.libraries.handwriting.base.StrokeList.EMPTY;
        this.inkHash = "";
        this.scoredResults = new java.util.ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            this.scoredResults.add(new com.google.android.libraries.handwriting.base.ScoredCandidate(strArr[i], fArr[i]));
        }
        this.segmentationInfo = new java.util.ArrayList();
        if (strArr2 == null || iArr == null) {
            return;
        }
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            this.segmentationInfo.add(new com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo(strArr2[i2], iArr[i2]));
        }
    }

    public void add(com.google.android.libraries.handwriting.base.ScoredCandidate scoredCandidate) {
        this.scoredResults.add(scoredCandidate);
    }

    public com.google.android.libraries.handwriting.base.RecognitionResult createResultWithoutLastSegment() {
        byte b;
        com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult = EMPTY;
        if (this != recognitionResult && numResult() != 0) {
            int i = 0;
            if (this.segmentationInfo.get(0).segment != null && this.segmentationInfo.get(0).segment.length > 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                com.google.android.libraries.handwriting.base.StrokeList strokeList = new com.google.android.libraries.handwriting.base.StrokeList();
                for (int i2 = 0; i2 < this.segmentationInfo.size(); i2++) {
                    com.google.android.libraries.handwriting.base.RecognitionResult.Segment[] segmentArr = this.segmentationInfo.get(i2).segment;
                    int length = segmentArr.length;
                    if (length > 1) {
                        int i3 = length - 1;
                        arrayList2.add(new com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo((com.google.android.libraries.handwriting.base.RecognitionResult.Segment[]) java.util.Arrays.copyOf(segmentArr, i3)));
                        com.google.android.libraries.handwriting.base.RecognitionResult.Segment segment = segmentArr[i3];
                        java.lang.String str = this.scoredResults.get(i2).word;
                        arrayList.add(new com.google.android.libraries.handwriting.base.ScoredCandidate(str.substring(0, str.length() - segment.subString.length()), this.scoredResults.get(i2).score));
                    }
                }
                int[] iArr = new int[this.recognizedStrokes.size()];
                int[][] iArr2 = new int[this.recognizedStrokes.size()][];
                com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo segmentationInfo = (com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo) arrayList2.get(0);
                int i4 = 0;
                while (true) {
                    b = -1;
                    if (i4 >= this.recognizedStrokes.size()) {
                        break;
                    }
                    com.google.android.libraries.handwriting.base.Stroke stroke = this.recognizedStrokes.get(i4);
                    com.google.android.libraries.handwriting.base.Stroke stroke2 = new com.google.android.libraries.handwriting.base.Stroke();
                    iArr2[i4] = new int[stroke.size()];
                    for (int i5 = 0; i5 < stroke.size(); i5++) {
                        if (segmentationInfo.containsPoint(i4, i5)) {
                            stroke2.addPoint(stroke.get(i5));
                            iArr2[i4][i5] = stroke2.size() - 1;
                        } else {
                            iArr2[i4][i5] = -1;
                        }
                    }
                    if (stroke2.isEmpty()) {
                        iArr[i4] = -1;
                    } else {
                        strokeList.add(stroke2);
                        iArr[i4] = strokeList.size() - 1;
                    }
                    i4++;
                }
                com.google.android.libraries.handwriting.base.RecognitionResult.Segment[] segmentArr2 = ((com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo) arrayList2.get(0)).segment;
                int length2 = segmentArr2.length;
                int i6 = 0;
                while (i6 < length2) {
                    com.google.android.libraries.handwriting.base.RecognitionResult.Segment segment2 = segmentArr2[i6];
                    int i7 = i;
                    while (true) {
                        com.google.android.libraries.handwriting.base.RecognitionResult.InkRange[] inkRangeArr = segment2.inkRange;
                        if (i7 < inkRangeArr.length) {
                            com.google.android.libraries.handwriting.base.RecognitionResult.InkRange inkRange = inkRangeArr[i7];
                            int i8 = inkRange.startStroke;
                            int i9 = iArr[i8];
                            int i10 = iArr2[i8][inkRange.startPoint];
                            int i11 = inkRange.endStroke;
                            int[] iArr3 = {i9, i10, iArr[i11], iArr2[i11][inkRange.endPoint]};
                            for (int i12 = 0; i12 < 4; i12++) {
                                if (iArr3[i12] == -1) {
                                    throw new java.lang.RuntimeException("invalid index in segmentation info detected");
                                }
                            }
                            segment2.inkRange[i7] = new com.google.android.libraries.handwriting.base.RecognitionResult.InkRange(iArr3);
                            i7++;
                            b = -1;
                        }
                    }
                    i6++;
                    i = 0;
                }
                com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult2 = new com.google.android.libraries.handwriting.base.RecognitionResult(this.inkHash, arrayList, arrayList2);
                recognitionResult2.requestId = this.requestId;
                recognitionResult2.recognitionStartedTime = this.recognitionStartedTime;
                recognitionResult2.recognitionEndedTime = this.recognitionEndedTime;
                recognitionResult2.debugInfo = this.debugInfo;
                recognitionResult2.extraInfo = this.extraInfo;
                recognitionResult2.firstStrokeId = this.firstStrokeId;
                recognitionResult2.lastStrokeId = this.lastStrokeId;
                recognitionResult2.setStrokes(strokeList);
                return recognitionResult2;
            }
        }
        return recognitionResult;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.google.android.libraries.handwriting.base.ScoredCandidate get(int i) {
        return this.scoredResults.get(i);
    }

    public java.util.List<com.google.android.libraries.handwriting.base.ScoredCandidate> getCandidateList() {
        return this.scoredResults;
    }

    public java.lang.String getDebugInfo() {
        return this.debugInfo;
    }

    public com.google.android.libraries.handwriting.base.RecognitionResult.ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public int getFirstStrokeId() {
        return this.firstStrokeId;
    }

    public java.lang.String getId() {
        return this.inkHash;
    }

    public java.lang.String getInkHash() {
        java.lang.String str = this.inkHash;
        return str == null ? "" : str;
    }

    public int getLastStrokeId() {
        return this.lastStrokeId;
    }

    public long getRecognitionEndedTime() {
        return this.recognitionEndedTime;
    }

    public long getRecognitionStartedTime() {
        return this.recognitionStartedTime;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public java.util.List<com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo> getSegmentationInfo() {
        return this.segmentationInfo;
    }

    public com.google.android.libraries.handwriting.base.StrokeList getStrokes() {
        return this.recognizedStrokes;
    }

    public boolean hasExtraInfo() {
        return this.extraInfo != null;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.google.android.libraries.handwriting.base.ScoredCandidate> iterator() {
        return this.scoredResults.iterator();
    }

    public int numResult() {
        return this.scoredResults.size();
    }

    public void set(int i, com.google.android.libraries.handwriting.base.ScoredCandidate scoredCandidate) {
        if (i < 0 || i >= this.scoredResults.size()) {
            return;
        }
        this.scoredResults.set(i, scoredCandidate);
    }

    public void setDebugInfo(java.lang.String str) {
        this.debugInfo = str;
    }

    public void setExtraInfo(com.google.android.libraries.handwriting.base.RecognitionResult.ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public void setFirstStrokeId(int i) {
        this.firstStrokeId = i;
    }

    public void setLastStrokeId(int i) {
        this.lastStrokeId = i;
    }

    public void setRecognitionEndedTime(long j) {
        this.recognitionEndedTime = j;
    }

    public void setRecognitionStartedTime(long j) {
        this.recognitionStartedTime = j;
    }

    public void setRequestId(int i) {
        this.requestId = i;
    }

    public void setStrokes(com.google.android.libraries.handwriting.base.StrokeList strokeList) {
        this.recognizedStrokes = strokeList;
    }

    public void sort() {
        java.util.Collections.sort(this.scoredResults, new java.util.Comparator<com.google.android.libraries.handwriting.base.ScoredCandidate>(this) { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.2
            {
                this.getClass();
            }

            @Override // java.util.Comparator
            public int compare(com.google.android.libraries.handwriting.base.ScoredCandidate scoredCandidate, com.google.android.libraries.handwriting.base.ScoredCandidate scoredCandidate2) {
                return (int) java.lang.Math.signum(scoredCandidate.score - scoredCandidate2.score);
            }
        });
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestId: ");
        sb.append(this.requestId);
        sb.append(" First result: ");
        sb.append(!this.scoredResults.isEmpty() ? this.scoredResults.get(0).word : "EMPTY RESULT");
        sb.append(" inkhash: ");
        sb.append(this.inkHash);
        sb.append(" numStrokes: ");
        sb.append(this.recognizedStrokes.size());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.inkHash);
        java.lang.String str = this.debugInfo;
        if (str == null) {
            parcel.writeString("");
        } else {
            parcel.writeString(str);
        }
        parcel.writeTypedList(this.scoredResults);
        parcel.writeTypedList(this.segmentationInfo);
        com.google.android.libraries.handwriting.base.StrokeList strokeList = this.recognizedStrokes;
        if (strokeList == null || strokeList == com.google.android.libraries.handwriting.base.StrokeList.EMPTY) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.recognizedStrokes.writeToParcel(parcel, i);
        }
    }

    public static class InkRange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult.InkRange> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult.InkRange>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.InkRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.RecognitionResult.InkRange createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.libraries.handwriting.base.RecognitionResult.InkRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.RecognitionResult.InkRange[] newArray(int i) {
                return new com.google.android.libraries.handwriting.base.RecognitionResult.InkRange[i];
            }
        };
        public final int endPoint;
        public final int endStroke;
        public final int startPoint;
        public final int startStroke;

        public InkRange(android.os.Parcel parcel) {
            this.startStroke = parcel.readInt();
            this.startPoint = parcel.readInt();
            this.endStroke = parcel.readInt();
            this.endPoint = parcel.readInt();
        }

        public int[] asIntArray() {
            return new int[]{this.startStroke, this.startPoint, this.endStroke, this.endPoint};
        }

        public boolean containsPoint(int i, int i2) {
            int i3 = this.startStroke;
            if (i <= i3 && (i != i3 || i2 < this.startPoint)) {
                return false;
            }
            int i4 = this.endStroke;
            if (i >= i4) {
                return i == i4 && i2 <= this.endPoint;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.startStroke);
            parcel.writeInt(this.startPoint);
            parcel.writeInt(this.endStroke);
            parcel.writeInt(this.endPoint);
        }

        public InkRange(int[] iArr) {
            this.startStroke = iArr[0];
            this.startPoint = iArr[1];
            this.endStroke = iArr[2];
            this.endPoint = iArr[3];
        }
    }

    public static class Segment implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult.Segment> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult.Segment>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.Segment.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.RecognitionResult.Segment createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.libraries.handwriting.base.RecognitionResult.Segment(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.RecognitionResult.Segment[] newArray(int i) {
                return new com.google.android.libraries.handwriting.base.RecognitionResult.Segment[i];
            }
        };
        final com.google.android.libraries.handwriting.base.RecognitionResult.InkRange[] inkRange;
        final java.lang.String subString;

        public Segment(java.lang.String str, int[][] iArr) {
            this.subString = str;
            int length = iArr.length;
            this.inkRange = new com.google.android.libraries.handwriting.base.RecognitionResult.InkRange[length];
            for (int i = 0; i < length; i++) {
                this.inkRange[i] = new com.google.android.libraries.handwriting.base.RecognitionResult.InkRange(iArr[i]);
            }
        }

        public boolean containsPoint(int i, int i2) {
            for (com.google.android.libraries.handwriting.base.RecognitionResult.InkRange inkRange : this.inkRange) {
                if (inkRange.containsPoint(i, i2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public com.google.android.libraries.handwriting.base.RecognitionResult.InkRange getInkRange(int i) {
            return this.inkRange[i];
        }

        public int getNumInkRanges() {
            return this.inkRange.length;
        }

        public java.lang.String getSubString() {
            return this.subString;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.subString);
            parcel.writeInt(this.inkRange.length);
            parcel.writeTypedArray(this.inkRange, 0);
        }

        public Segment(android.os.Parcel parcel) {
            this.subString = parcel.readString();
            com.google.android.libraries.handwriting.base.RecognitionResult.InkRange[] inkRangeArr = new com.google.android.libraries.handwriting.base.RecognitionResult.InkRange[parcel.readInt()];
            this.inkRange = inkRangeArr;
            parcel.readTypedArray(inkRangeArr, com.google.android.libraries.handwriting.base.RecognitionResult.InkRange.CREATOR);
        }
    }

    public static class SegmentationInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo[] newArray(int i) {
                return new com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo[i];
            }
        };
        final com.google.android.libraries.handwriting.base.RecognitionResult.Segment[] segment;

        public SegmentationInfo(java.lang.String[] strArr, int[][][] iArr) {
            int length = strArr.length;
            this.segment = new com.google.android.libraries.handwriting.base.RecognitionResult.Segment[length];
            for (int i = 0; i < length; i++) {
                this.segment[i] = new com.google.android.libraries.handwriting.base.RecognitionResult.Segment(strArr[i], iArr[i]);
            }
        }

        public boolean containsPoint(int i, int i2) {
            for (com.google.android.libraries.handwriting.base.RecognitionResult.Segment segment : this.segment) {
                if (segment.containsPoint(i, i2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getNumSegments() {
            return this.segment.length;
        }

        public com.google.android.libraries.handwriting.base.RecognitionResult.Segment getSegment(int i) {
            return this.segment[i];
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.segment.length);
            parcel.writeTypedArray(this.segment, 0);
        }

        public SegmentationInfo(android.os.Parcel parcel) {
            com.google.android.libraries.handwriting.base.RecognitionResult.Segment[] segmentArr = new com.google.android.libraries.handwriting.base.RecognitionResult.Segment[parcel.readInt()];
            this.segment = segmentArr;
            parcel.readTypedArray(segmentArr, com.google.android.libraries.handwriting.base.RecognitionResult.Segment.CREATOR);
        }

        public SegmentationInfo(com.google.android.libraries.handwriting.base.RecognitionResult.Segment[] segmentArr) {
            this.segment = segmentArr;
        }
    }

    public RecognitionResult(android.os.Parcel parcel) {
        this.debugInfo = null;
        this.extraInfo = null;
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.recognizedStrokes = com.google.android.libraries.handwriting.base.StrokeList.EMPTY;
        this.inkHash = parcel.readString();
        this.debugInfo = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.scoredResults = arrayList;
        parcel.readTypedList(arrayList, com.google.android.libraries.handwriting.base.ScoredCandidate.CREATOR);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.segmentationInfo = arrayList2;
        parcel.readTypedList(arrayList2, com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo.CREATOR);
        if (parcel.readInt() == 1) {
            this.recognizedStrokes = new com.google.android.libraries.handwriting.base.StrokeList(parcel);
        }
    }

    public RecognitionResult(java.lang.String str) {
        this(str, new java.util.ArrayList());
    }

    public RecognitionResult(java.lang.String str, java.util.List<com.google.android.libraries.handwriting.base.ScoredCandidate> list) {
        this(str, list, new java.util.ArrayList());
    }

    public RecognitionResult(java.lang.String str, java.util.List<com.google.android.libraries.handwriting.base.ScoredCandidate> list, java.util.List<com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo> list2) {
        this.debugInfo = null;
        this.extraInfo = null;
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.recognizedStrokes = com.google.android.libraries.handwriting.base.StrokeList.EMPTY;
        this.inkHash = str;
        this.scoredResults = list;
        this.segmentationInfo = list2;
    }

    public RecognitionResult(java.lang.String[] strArr, float[] fArr) {
        this(strArr, fArr, null, null);
    }

    public RecognitionResult() {
        this("");
    }
}
