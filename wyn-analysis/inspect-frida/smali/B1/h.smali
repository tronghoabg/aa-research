.class public final LB1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:[B

.field public static final B:[B

.field public static final C:[B

.field public static final D:[B

.field public static final E:[B

.field public static final F:[B

.field public static final G:[B

.field public static final H:[B

.field public static final I:[B

.field public static final J:[B

.field public static final K:[B

.field public static final L:[B

.field public static final M:[B

.field public static final N:[B

.field public static final O:[B

.field public static final P:[B

.field public static final Q:[B

.field public static final R:[Ljava/lang/String;

.field public static final S:[I

.field public static final T:[B

.field public static final U:LB1/e;

.field public static final V:[[LB1/e;

.field public static final W:[LB1/e;

.field public static final X:[Ljava/util/HashMap;

.field public static final Y:[Ljava/util/HashMap;

.field public static final Z:Ljava/util/HashSet;

.field public static final a0:Ljava/util/HashMap;

.field public static final b0:Ljava/nio/charset/Charset;

.field public static final c0:[B

.field public static final d0:[B

.field public static final e0:Ljava/util/regex/Pattern;

.field public static final f0:Ljava/util/regex/Pattern;

.field public static final g0:Ljava/util/regex/Pattern;

.field public static final t:Z

.field public static final u:Ljava/util/List;

.field public static final v:Ljava/util/List;

.field public static final w:[I

.field public static final x:[I

.field public static final y:[B

.field public static final z:[B


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/io/FileDescriptor;

.field public final c:Landroid/content/res/AssetManager$AssetInputStream;

.field public d:I

.field public final e:[Ljava/util/HashMap;

.field public final f:Ljava/util/HashSet;

.field public g:Ljava/nio/ByteOrder;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:[B

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 125

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 2
    const-string v2, "ExifInterface"

    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    sput-boolean v2, LB1/h;->t:Z

    const/4 v2, 0x1

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x6

    .line 4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x4

    new-array v9, v8, [Ljava/lang/Integer;

    const/4 v10, 0x0

    aput-object v3, v9, v10

    aput-object v5, v9, v2

    const/4 v5, 0x2

    aput-object v1, v9, v5

    aput-object v7, v9, v0

    .line 5
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sput-object v9, LB1/h;->u:Ljava/util/List;

    .line 6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v11, 0x7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x5

    .line 7
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move/from16 v16, v10

    new-array v10, v8, [Ljava/lang/Integer;

    aput-object v9, v10, v16

    aput-object v12, v10, v2

    aput-object v13, v10, v5

    aput-object v15, v10, v0

    .line 8
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    sput-object v10, LB1/h;->v:Ljava/util/List;

    .line 9
    filled-new-array {v6, v6, v6}, [I

    move-result-object v10

    sput-object v10, LB1/h;->w:[I

    .line 10
    filled-new-array {v6}, [I

    move-result-object v10

    sput-object v10, LB1/h;->x:[I

    .line 11
    new-array v10, v0, [B

    fill-array-data v10, :array_0

    sput-object v10, LB1/h;->y:[B

    .line 12
    new-array v10, v8, [B

    fill-array-data v10, :array_1

    sput-object v10, LB1/h;->z:[B

    .line 13
    new-array v10, v8, [B

    fill-array-data v10, :array_2

    sput-object v10, LB1/h;->A:[B

    .line 14
    new-array v10, v8, [B

    fill-array-data v10, :array_3

    sput-object v10, LB1/h;->B:[B

    .line 15
    new-array v10, v4, [B

    fill-array-data v10, :array_4

    sput-object v10, LB1/h;->C:[B

    const/16 v13, 0xa

    const/16 v17, 0x49

    .line 16
    new-array v10, v13, [B

    fill-array-data v10, :array_5

    sput-object v10, LB1/h;->D:[B

    const/16 v18, 0xd

    const/16 v19, 0x1a

    .line 17
    new-array v10, v6, [B

    fill-array-data v10, :array_6

    sput-object v10, LB1/h;->E:[B

    .line 18
    new-array v10, v8, [B

    fill-array-data v10, :array_7

    sput-object v10, LB1/h;->F:[B

    .line 19
    new-array v10, v8, [B

    fill-array-data v10, :array_8

    sput-object v10, LB1/h;->G:[B

    .line 20
    new-array v10, v8, [B

    fill-array-data v10, :array_9

    sput-object v10, LB1/h;->H:[B

    .line 21
    new-array v10, v8, [B

    fill-array-data v10, :array_a

    sput-object v10, LB1/h;->I:[B

    .line 22
    new-array v10, v8, [B

    fill-array-data v10, :array_b

    sput-object v10, LB1/h;->J:[B

    .line 23
    new-array v10, v8, [B

    fill-array-data v10, :array_c

    sput-object v10, LB1/h;->K:[B

    .line 24
    new-array v10, v0, [B

    fill-array-data v10, :array_d

    sput-object v10, LB1/h;->L:[B

    .line 25
    const-string v10, "VP8X"

    move/from16 v20, v13

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, LB1/h;->M:[B

    .line 26
    const-string v10, "VP8L"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, LB1/h;->N:[B

    .line 27
    const-string v10, "VP8 "

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, LB1/h;->O:[B

    .line 28
    const-string v10, "ANIM"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, LB1/h;->P:[B

    .line 29
    const-string v10, "ANMF"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, LB1/h;->Q:[B

    .line 30
    const-string v31, "SRATIONAL"

    const-string v32, "SINGLE"

    const-string v21, ""

    const-string v22, "BYTE"

    const-string v23, "STRING"

    const-string v24, "USHORT"

    const-string v25, "ULONG"

    const-string v26, "URATIONAL"

    const-string v27, "SBYTE"

    const-string v28, "UNDEFINED"

    const-string v29, "SSHORT"

    const-string v30, "SLONG"

    const-string v33, "DOUBLE"

    const-string v34, "IFD"

    filled-new-array/range {v21 .. v34}, [Ljava/lang/String;

    move-result-object v10

    sput-object v10, LB1/h;->R:[Ljava/lang/String;

    const/16 v10, 0xe

    .line 31
    new-array v13, v10, [I

    fill-array-data v13, :array_e

    sput-object v13, LB1/h;->S:[I

    .line 32
    new-array v13, v6, [B

    fill-array-data v13, :array_f

    sput-object v13, LB1/h;->T:[B

    .line 33
    new-instance v13, LB1/e;

    move/from16 v21, v10

    const-string v10, "NewSubfileType"

    move/from16 v22, v6

    const/16 v6, 0xfe

    invoke-direct {v13, v10, v6, v8}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v2, "SubfileType"

    const/16 v11, 0xff

    invoke-direct {v6, v2, v11, v8}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v4, "ImageWidth"

    const/16 v14, 0x100

    invoke-direct {v11, v4, v14, v0, v8}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v4, LB1/e;

    const-string v14, "ImageLength"

    const/16 v5, 0x101

    invoke-direct {v4, v14, v5, v0, v8}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v14, LB1/e;

    const-string v5, "BitsPerSample"

    const/16 v8, 0x102

    invoke-direct {v14, v5, v8, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v8, LB1/e;

    move-object/from16 v34, v4

    const-string v4, "Compression"

    move-object/from16 v35, v6

    const/16 v6, 0x103

    invoke-direct {v8, v4, v6, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    move-object/from16 v37, v8

    const-string v8, "PhotometricInterpretation"

    move-object/from16 v38, v11

    const/16 v11, 0x106

    invoke-direct {v6, v8, v11, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v0, "ImageDescription"

    move-object/from16 v41, v6

    const/16 v6, 0x10e

    move-object/from16 v42, v13

    const/4 v13, 0x2

    invoke-direct {v11, v0, v6, v13}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    move-object/from16 v44, v11

    const-string v11, "Make"

    move-object/from16 v45, v14

    const/16 v14, 0x10f

    invoke-direct {v6, v11, v14, v13}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "Model"

    move-object/from16 v46, v6

    const/16 v6, 0x110

    invoke-direct {v11, v14, v6, v13}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v13, "StripOffsets"

    const/16 v14, 0x111

    move-object/from16 v48, v7

    move-object/from16 v47, v11

    const/4 v7, 0x4

    const/4 v11, 0x3

    invoke-direct {v6, v13, v14, v11, v7}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v7, LB1/e;

    const-string v14, "Orientation"

    move-object/from16 v49, v6

    const/16 v6, 0x112

    invoke-direct {v7, v14, v6, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v14, "SamplesPerPixel"

    move-object/from16 v50, v7

    const/16 v7, 0x115

    invoke-direct {v6, v14, v7, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v7, LB1/e;

    const-string v14, "RowsPerStrip"

    move-object/from16 v51, v6

    const/16 v6, 0x116

    move-object/from16 v52, v12

    const/4 v12, 0x4

    invoke-direct {v7, v14, v6, v11, v12}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v6, LB1/e;

    const-string v14, "StripByteCounts"

    move-object/from16 v53, v7

    const/16 v7, 0x117

    invoke-direct {v6, v14, v7, v11, v12}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v7, LB1/e;

    const-string v11, "XResolution"

    const/16 v12, 0x11a

    const/4 v14, 0x5

    invoke-direct {v7, v11, v12, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v12, "YResolution"

    move-object/from16 v54, v6

    const/16 v6, 0x11b

    invoke-direct {v11, v12, v6, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v12, "PlanarConfiguration"

    const/16 v14, 0x11c

    move-object/from16 v55, v7

    const/4 v7, 0x3

    invoke-direct {v6, v12, v14, v7}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v12, LB1/e;

    const-string v14, "ResolutionUnit"

    move-object/from16 v56, v6

    const/16 v6, 0x128

    invoke-direct {v12, v14, v6, v7}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v14, "TransferFunction"

    move-object/from16 v57, v11

    const/16 v11, 0x12d

    invoke-direct {v6, v14, v11, v7}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v7, LB1/e;

    const-string v11, "Software"

    const/16 v14, 0x131

    move-object/from16 v58, v6

    const/4 v6, 0x2

    invoke-direct {v7, v11, v14, v6}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "DateTime"

    move-object/from16 v59, v7

    const/16 v7, 0x132

    invoke-direct {v11, v14, v7, v6}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v7, LB1/e;

    const-string v14, "Artist"

    move-object/from16 v60, v11

    const/16 v11, 0x13b

    invoke-direct {v7, v14, v11, v6}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v11, "WhitePoint"

    const/16 v14, 0x13e

    move-object/from16 v61, v7

    const/4 v7, 0x5

    invoke-direct {v6, v11, v14, v7}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "PrimaryChromaticities"

    move-object/from16 v62, v6

    const/16 v6, 0x13f

    invoke-direct {v11, v14, v6, v7}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v7, "SubIFDPointer"

    const/16 v14, 0x14a

    move-object/from16 v63, v11

    const/4 v11, 0x4

    invoke-direct {v6, v7, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v14, LB1/e;

    move-object/from16 v64, v6

    const-string v6, "JPEGInterchangeFormat"

    move-object/from16 v65, v12

    const/16 v12, 0x201

    invoke-direct {v14, v6, v12, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v12, "JPEGInterchangeFormatLength"

    move-object/from16 v66, v14

    const/16 v14, 0x202

    invoke-direct {v6, v12, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v12, "YCbCrCoefficients"

    const/16 v14, 0x211

    move-object/from16 v67, v6

    const/4 v6, 0x5

    invoke-direct {v11, v12, v14, v6}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v12, "YCbCrSubSampling"

    const/16 v14, 0x212

    move-object/from16 v68, v11

    const/4 v11, 0x3

    invoke-direct {v6, v12, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v12, LB1/e;

    const-string v14, "YCbCrPositioning"

    move-object/from16 v69, v6

    const/16 v6, 0x213

    invoke-direct {v12, v14, v6, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v11, "ReferenceBlackWhite"

    const/16 v14, 0x214

    move-object/from16 v70, v12

    const/4 v12, 0x5

    invoke-direct {v6, v11, v14, v12}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v12, "Copyright"

    const v14, 0x8298

    move-object/from16 v71, v6

    const/4 v6, 0x2

    invoke-direct {v11, v12, v14, v6}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v6, LB1/e;

    const-string v12, "ExifIFDPointer"

    const v14, 0x8769

    move-object/from16 v72, v11

    const/4 v11, 0x4

    invoke-direct {v6, v12, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v14, LB1/e;

    move-object/from16 v73, v6

    const-string v6, "GPSInfoIFDPointer"

    move-object/from16 v74, v1

    const v1, 0x8825

    invoke-direct {v14, v6, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    move-object/from16 v75, v14

    const-string v14, "SensorTopBorder"

    invoke-direct {v1, v14, v11, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v14, LB1/e;

    move-object/from16 v76, v1

    const-string v1, "SensorLeftBorder"

    move-object/from16 v77, v9

    const/4 v9, 0x5

    invoke-direct {v14, v1, v9, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "SensorBottomBorder"

    move-object/from16 v78, v14

    const/4 v14, 0x6

    invoke-direct {v1, v9, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "SensorRightBorder"

    move-object/from16 v79, v1

    const/4 v1, 0x7

    invoke-direct {v9, v14, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "ISO"

    const/16 v1, 0x17

    move-object/from16 v80, v9

    const/4 v9, 0x3

    invoke-direct {v11, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "JpgFromRaw"

    move/from16 v81, v1

    const/16 v1, 0x2e

    move-object/from16 v82, v11

    const/4 v11, 0x7

    invoke-direct {v9, v14, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v11, "Xmp"

    const/16 v14, 0x2bc

    move-object/from16 v83, v9

    const/4 v9, 0x1

    invoke-direct {v1, v11, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    const/16 v11, 0x2a

    new-array v11, v11, [LB1/e;

    aput-object v42, v11, v16

    aput-object v35, v11, v9

    const/16 v30, 0x2

    aput-object v38, v11, v30

    const/16 v40, 0x3

    aput-object v34, v11, v40

    const/16 v32, 0x4

    aput-object v45, v11, v32

    const/16 v28, 0x5

    aput-object v37, v11, v28

    const/16 v27, 0x6

    aput-object v41, v11, v27

    const/16 v25, 0x7

    aput-object v44, v11, v25

    aput-object v46, v11, v22

    const/16 v9, 0x9

    aput-object v47, v11, v9

    aput-object v49, v11, v20

    const/16 v14, 0xb

    aput-object v50, v11, v14

    move/from16 v34, v14

    const/16 v14, 0xc

    aput-object v51, v11, v14

    aput-object v53, v11, v18

    aput-object v54, v11, v21

    move/from16 v35, v14

    const/16 v14, 0xf

    aput-object v55, v11, v14

    move/from16 v37, v14

    const/16 v14, 0x10

    aput-object v57, v11, v14

    move/from16 v38, v14

    const/16 v14, 0x11

    aput-object v56, v11, v14

    move/from16 v41, v14

    const/16 v14, 0x12

    aput-object v65, v11, v14

    const/16 v42, 0x13

    aput-object v58, v11, v42

    const/16 v42, 0x14

    aput-object v59, v11, v42

    const/16 v42, 0x15

    aput-object v60, v11, v42

    const/16 v42, 0x16

    aput-object v61, v11, v42

    aput-object v62, v11, v81

    const/16 v42, 0x18

    aput-object v63, v11, v42

    const/16 v42, 0x19

    aput-object v64, v11, v42

    aput-object v66, v11, v19

    const/16 v42, 0x1b

    aput-object v67, v11, v42

    const/16 v42, 0x1c

    aput-object v68, v11, v42

    const/16 v42, 0x1d

    aput-object v69, v11, v42

    const/16 v42, 0x1e

    aput-object v70, v11, v42

    const/16 v42, 0x1f

    aput-object v71, v11, v42

    const/16 v42, 0x20

    aput-object v72, v11, v42

    const/16 v42, 0x21

    aput-object v73, v11, v42

    const/16 v42, 0x22

    aput-object v75, v11, v42

    const/16 v42, 0x23

    aput-object v76, v11, v42

    const/16 v42, 0x24

    aput-object v78, v11, v42

    const/16 v42, 0x25

    aput-object v79, v11, v42

    const/16 v42, 0x26

    aput-object v80, v11, v42

    const/16 v42, 0x27

    aput-object v82, v11, v42

    const/16 v42, 0x28

    aput-object v83, v11, v42

    const/16 v42, 0x29

    aput-object v1, v11, v42

    .line 34
    new-instance v1, LB1/e;

    move/from16 v42, v14

    const-string v14, "ExposureTime"

    move/from16 v44, v9

    const v9, 0x829a

    move-object/from16 v45, v11

    const/4 v11, 0x5

    invoke-direct {v1, v14, v9, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "FNumber"

    move-object/from16 v46, v1

    const v1, 0x829d

    invoke-direct {v9, v14, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v11, "ExposureProgram"

    const v14, 0x8822

    move-object/from16 v47, v9

    const/4 v9, 0x3

    invoke-direct {v1, v11, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "SpectralSensitivity"

    const v9, 0x8824

    move-object/from16 v49, v1

    const/4 v1, 0x2

    invoke-direct {v11, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "PhotographicSensitivity"

    const v14, 0x8827

    move-object/from16 v50, v11

    const/4 v11, 0x3

    invoke-direct {v1, v9, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "OECF"

    const v11, 0x8828

    move-object/from16 v51, v1

    const/4 v1, 0x7

    invoke-direct {v9, v14, v11, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v11, "SensitivityType"

    const v14, 0x8830

    move-object/from16 v53, v9

    const/4 v9, 0x3

    invoke-direct {v1, v11, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v11, "StandardOutputSensitivity"

    const v14, 0x8831

    move-object/from16 v54, v1

    const/4 v1, 0x4

    invoke-direct {v9, v11, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "RecommendedExposureIndex"

    move-object/from16 v55, v9

    const v9, 0x8832

    invoke-direct {v11, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "ISOSpeed"

    move-object/from16 v56, v11

    const v11, 0x8833

    invoke-direct {v9, v14, v11, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "ISOSpeedLatitudeyyy"

    move-object/from16 v57, v9

    const v9, 0x8834

    invoke-direct {v11, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "ISOSpeedLatitudezzz"

    move-object/from16 v58, v11

    const v11, 0x8835

    invoke-direct {v9, v14, v11, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v11, "ExifVersion"

    const v14, 0x9000

    move-object/from16 v59, v9

    const/4 v9, 0x2

    invoke-direct {v1, v11, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "DateTimeOriginal"

    move-object/from16 v60, v1

    const v1, 0x9003

    invoke-direct {v11, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "DateTimeDigitized"

    move-object/from16 v61, v11

    const v11, 0x9004

    invoke-direct {v1, v14, v11, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "OffsetTime"

    move-object/from16 v62, v1

    const v1, 0x9010

    invoke-direct {v11, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "OffsetTimeOriginal"

    move-object/from16 v63, v11

    const v11, 0x9011

    invoke-direct {v1, v14, v11, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "OffsetTimeDigitized"

    move-object/from16 v64, v1

    const v1, 0x9012

    invoke-direct {v11, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "ComponentsConfiguration"

    const v14, 0x9101

    move-object/from16 v65, v11

    const/4 v11, 0x7

    invoke-direct {v1, v9, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v11, "CompressedBitsPerPixel"

    const v14, 0x9102

    move-object/from16 v66, v1

    const/4 v1, 0x5

    invoke-direct {v9, v11, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "ShutterSpeedValue"

    const v1, 0x9201

    move-object/from16 v67, v9

    move/from16 v9, v20

    invoke-direct {v11, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "ApertureValue"

    const v9, 0x9202

    move-object/from16 v68, v11

    const/4 v11, 0x5

    invoke-direct {v1, v14, v9, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v11, "BrightnessValue"

    const v14, 0x9203

    move-object/from16 v69, v1

    const/16 v1, 0xa

    invoke-direct {v9, v11, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "ExposureBiasValue"

    move-object/from16 v70, v9

    const v9, 0x9204

    invoke-direct {v11, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "MaxApertureValue"

    const v14, 0x9205

    move-object/from16 v71, v11

    const/4 v11, 0x5

    invoke-direct {v1, v9, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "SubjectDistance"

    move-object/from16 v72, v1

    const v1, 0x9206

    invoke-direct {v9, v14, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v11, "MeteringMode"

    const v14, 0x9207

    move-object/from16 v73, v9

    const/4 v9, 0x3

    invoke-direct {v1, v11, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "LightSource"

    move-object/from16 v75, v1

    const v1, 0x9208

    invoke-direct {v11, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "Flash"

    move-object/from16 v76, v11

    const v11, 0x9209

    invoke-direct {v1, v14, v11, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "FocalLength"

    const v9, 0x920a

    move-object/from16 v78, v1

    const/4 v1, 0x5

    invoke-direct {v11, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "SubjectArea"

    const v14, 0x9214

    move-object/from16 v79, v11

    const/4 v11, 0x3

    invoke-direct {v1, v9, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v11, "MakerNote"

    const v14, 0x927c

    move-object/from16 v80, v1

    const/4 v1, 0x7

    invoke-direct {v9, v11, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "UserComment"

    move-object/from16 v82, v9

    const v9, 0x9286

    invoke-direct {v11, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "SubSecTime"

    const v14, 0x9290

    move-object/from16 v83, v11

    const/4 v11, 0x2

    invoke-direct {v1, v9, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "SubSecTimeOriginal"

    move-object/from16 v84, v1

    const v1, 0x9291

    invoke-direct {v9, v14, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "SubSecTimeDigitized"

    move-object/from16 v85, v9

    const v9, 0x9292

    invoke-direct {v1, v14, v9, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v11, "FlashpixVersion"

    const v14, 0xa000

    move-object/from16 v86, v1

    const/4 v1, 0x7

    invoke-direct {v9, v11, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v11, "ColorSpace"

    const v14, 0xa001

    move-object/from16 v87, v9

    const/4 v9, 0x3

    invoke-direct {v1, v11, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "PixelXDimension"

    move-object/from16 v88, v1

    const v1, 0xa002

    move-object/from16 v89, v3

    const/4 v3, 0x4

    invoke-direct {v11, v14, v1, v9, v3}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v1, LB1/e;

    const-string v14, "PixelYDimension"

    move-object/from16 v90, v11

    const v11, 0xa003

    invoke-direct {v1, v14, v11, v9, v3}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v9, LB1/e;

    const-string v11, "RelatedSoundFile"

    const v14, 0xa004

    const/4 v3, 0x2

    invoke-direct {v9, v11, v14, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v11, "InteroperabilityIFDPointer"

    const v14, 0xa005

    move-object/from16 v91, v1

    const/4 v1, 0x4

    invoke-direct {v3, v11, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v11, "FlashEnergy"

    const v14, 0xa20b

    move-object/from16 v92, v3

    const/4 v3, 0x5

    invoke-direct {v1, v11, v14, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "SpatialFrequencyResponse"

    const v3, 0xa20c

    move-object/from16 v93, v1

    const/4 v1, 0x7

    invoke-direct {v11, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v3, "FocalPlaneXResolution"

    const v14, 0xa20e

    move-object/from16 v94, v9

    const/4 v9, 0x5

    invoke-direct {v1, v3, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "FocalPlaneYResolution"

    move-object/from16 v95, v1

    const v1, 0xa20f

    invoke-direct {v3, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "FocalPlaneResolutionUnit"

    const v14, 0xa210

    move-object/from16 v96, v3

    const/4 v3, 0x3

    invoke-direct {v1, v9, v14, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "SubjectLocation"

    move-object/from16 v97, v1

    const v1, 0xa214

    invoke-direct {v9, v14, v1, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "ExposureIndex"

    const v3, 0xa215

    move-object/from16 v98, v9

    const/4 v9, 0x5

    invoke-direct {v1, v14, v3, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v9, "SensingMethod"

    const v14, 0xa217

    move-object/from16 v99, v1

    const/4 v1, 0x3

    invoke-direct {v3, v9, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "FileSource"

    const v14, 0xa300

    move-object/from16 v100, v3

    const/4 v3, 0x7

    invoke-direct {v1, v9, v14, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "SceneType"

    move-object/from16 v101, v1

    const v1, 0xa301

    invoke-direct {v9, v14, v1, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "CFAPattern"

    move-object/from16 v102, v9

    const v9, 0xa302

    invoke-direct {v1, v14, v9, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v9, "CustomRendered"

    const v14, 0xa401

    move-object/from16 v103, v1

    const/4 v1, 0x3

    invoke-direct {v3, v9, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "ExposureMode"

    move-object/from16 v104, v3

    const v3, 0xa402

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "WhiteBalance"

    move-object/from16 v105, v9

    const v9, 0xa403

    invoke-direct {v3, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "DigitalZoomRatio"

    const v1, 0xa404

    move-object/from16 v106, v3

    const/4 v3, 0x5

    invoke-direct {v9, v14, v1, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v3, "FocalLengthIn35mmFilm"

    const v14, 0xa405

    move-object/from16 v107, v9

    const/4 v9, 0x3

    invoke-direct {v1, v3, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "SceneCaptureType"

    move-object/from16 v108, v1

    const v1, 0xa406

    invoke-direct {v3, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "GainControl"

    move-object/from16 v109, v3

    const v3, 0xa407

    invoke-direct {v1, v14, v3, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "Contrast"

    move-object/from16 v110, v1

    const v1, 0xa408

    invoke-direct {v3, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "Saturation"

    move-object/from16 v111, v3

    const v3, 0xa409

    invoke-direct {v1, v14, v3, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "Sharpness"

    move-object/from16 v112, v1

    const v1, 0xa40a

    invoke-direct {v3, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "DeviceSettingDescription"

    const v9, 0xa40b

    move-object/from16 v113, v3

    const/4 v3, 0x7

    invoke-direct {v1, v14, v9, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v9, "SubjectDistanceRange"

    const v14, 0xa40c

    move-object/from16 v114, v1

    const/4 v1, 0x3

    invoke-direct {v3, v9, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "ImageUniqueID"

    const v14, 0xa420

    move-object/from16 v115, v3

    const/4 v3, 0x2

    invoke-direct {v1, v9, v14, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "CameraOwnerName"

    move-object/from16 v116, v1

    const v1, 0xa430

    invoke-direct {v9, v14, v1, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "BodySerialNumber"

    move-object/from16 v117, v9

    const v9, 0xa431

    invoke-direct {v1, v14, v9, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "LensSpecification"

    const v3, 0xa432

    move-object/from16 v118, v1

    const/4 v1, 0x5

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v3, "LensMake"

    const v14, 0xa433

    move-object/from16 v119, v9

    const/4 v9, 0x2

    invoke-direct {v1, v3, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "LensModel"

    move-object/from16 v120, v1

    const v1, 0xa434

    invoke-direct {v3, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v9, "Gamma"

    const v14, 0xa500

    move-object/from16 v121, v3

    const/4 v3, 0x5

    invoke-direct {v1, v9, v14, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v9, "DNGVersion"

    const v14, 0xc612

    move-object/from16 v122, v1

    const/4 v1, 0x1

    invoke-direct {v3, v9, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "DefaultCropSize"

    move/from16 v24, v1

    const v1, 0xc620

    move-object/from16 v123, v3

    move-object/from16 v124, v11

    const/4 v3, 0x3

    const/4 v11, 0x4

    invoke-direct {v9, v14, v1, v3, v11}, LB1/e;-><init>(Ljava/lang/String;III)V

    const/16 v1, 0x4a

    new-array v1, v1, [LB1/e;

    aput-object v46, v1, v16

    aput-object v47, v1, v24

    const/16 v30, 0x2

    aput-object v49, v1, v30

    aput-object v50, v1, v3

    aput-object v51, v1, v11

    const/16 v28, 0x5

    aput-object v53, v1, v28

    const/16 v27, 0x6

    aput-object v54, v1, v27

    const/16 v25, 0x7

    aput-object v55, v1, v25

    aput-object v56, v1, v22

    aput-object v57, v1, v44

    const/16 v20, 0xa

    aput-object v58, v1, v20

    aput-object v59, v1, v34

    aput-object v60, v1, v35

    aput-object v61, v1, v18

    aput-object v62, v1, v21

    aput-object v63, v1, v37

    aput-object v64, v1, v38

    aput-object v65, v1, v41

    aput-object v66, v1, v42

    const/16 v3, 0x13

    aput-object v67, v1, v3

    const/16 v3, 0x14

    aput-object v68, v1, v3

    const/16 v3, 0x15

    aput-object v69, v1, v3

    const/16 v3, 0x16

    aput-object v70, v1, v3

    aput-object v71, v1, v81

    const/16 v3, 0x18

    aput-object v72, v1, v3

    const/16 v3, 0x19

    aput-object v73, v1, v3

    aput-object v75, v1, v19

    const/16 v3, 0x1b

    aput-object v76, v1, v3

    const/16 v3, 0x1c

    aput-object v78, v1, v3

    const/16 v3, 0x1d

    aput-object v79, v1, v3

    const/16 v3, 0x1e

    aput-object v80, v1, v3

    const/16 v3, 0x1f

    aput-object v82, v1, v3

    const/16 v3, 0x20

    aput-object v83, v1, v3

    const/16 v3, 0x21

    aput-object v84, v1, v3

    const/16 v3, 0x22

    aput-object v85, v1, v3

    const/16 v3, 0x23

    aput-object v86, v1, v3

    const/16 v3, 0x24

    aput-object v87, v1, v3

    const/16 v3, 0x25

    aput-object v88, v1, v3

    const/16 v3, 0x26

    aput-object v90, v1, v3

    const/16 v3, 0x27

    aput-object v91, v1, v3

    const/16 v3, 0x28

    aput-object v94, v1, v3

    const/16 v3, 0x29

    aput-object v92, v1, v3

    const/16 v3, 0x2a

    aput-object v93, v1, v3

    const/16 v3, 0x2b

    aput-object v124, v1, v3

    const/16 v3, 0x2c

    aput-object v95, v1, v3

    const/16 v3, 0x2d

    aput-object v96, v1, v3

    const/16 v3, 0x2e

    aput-object v97, v1, v3

    const/16 v3, 0x2f

    aput-object v98, v1, v3

    const/16 v3, 0x30

    aput-object v99, v1, v3

    const/16 v3, 0x31

    aput-object v100, v1, v3

    const/16 v3, 0x32

    aput-object v101, v1, v3

    const/16 v3, 0x33

    aput-object v102, v1, v3

    const/16 v3, 0x34

    aput-object v103, v1, v3

    const/16 v3, 0x35

    aput-object v104, v1, v3

    const/16 v3, 0x36

    aput-object v105, v1, v3

    const/16 v3, 0x37

    aput-object v106, v1, v3

    const/16 v3, 0x38

    aput-object v107, v1, v3

    const/16 v3, 0x39

    aput-object v108, v1, v3

    const/16 v3, 0x3a

    aput-object v109, v1, v3

    const/16 v3, 0x3b

    aput-object v110, v1, v3

    const/16 v3, 0x3c

    aput-object v111, v1, v3

    const/16 v3, 0x3d

    aput-object v112, v1, v3

    const/16 v3, 0x3e

    aput-object v113, v1, v3

    const/16 v3, 0x3f

    aput-object v114, v1, v3

    const/16 v3, 0x40

    aput-object v115, v1, v3

    const/16 v3, 0x41

    aput-object v116, v1, v3

    const/16 v3, 0x42

    aput-object v117, v1, v3

    const/16 v3, 0x43

    aput-object v118, v1, v3

    const/16 v3, 0x44

    aput-object v119, v1, v3

    const/16 v3, 0x45

    aput-object v120, v1, v3

    const/16 v3, 0x46

    aput-object v121, v1, v3

    const/16 v3, 0x47

    aput-object v122, v1, v3

    const/16 v3, 0x48

    aput-object v123, v1, v3

    aput-object v9, v1, v17

    .line 35
    new-instance v3, LB1/e;

    const-string v9, "GPSVersionID"

    move/from16 v14, v16

    const/4 v11, 0x1

    invoke-direct {v3, v9, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSLatitudeRef"

    move-object/from16 v17, v1

    const/4 v1, 0x2

    invoke-direct {v9, v14, v11, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "GPSLatitude"

    move-object/from16 v46, v3

    move-object/from16 v47, v9

    const/4 v3, 0x5

    const/16 v9, 0xa

    invoke-direct {v11, v14, v1, v3, v9}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v14, LB1/e;

    const-string v3, "GPSLongitudeRef"

    const/4 v9, 0x3

    invoke-direct {v14, v3, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v3, "GPSLongitude"

    move-object/from16 v49, v11

    move-object/from16 v50, v14

    const/4 v9, 0x5

    const/4 v11, 0x4

    const/16 v14, 0xa

    invoke-direct {v1, v3, v11, v9, v14}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v3, LB1/e;

    const-string v11, "GPSAltitudeRef"

    const/4 v14, 0x1

    invoke-direct {v3, v11, v9, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "GPSAltitude"

    move-object/from16 v51, v1

    const/4 v1, 0x6

    invoke-direct {v11, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "GPSTimeStamp"

    move-object/from16 v53, v3

    const/4 v3, 0x7

    invoke-direct {v1, v14, v3, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v9, "GPSSatellites"

    move-object/from16 v54, v1

    move/from16 v14, v22

    const/4 v1, 0x2

    invoke-direct {v3, v9, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSStatus"

    move-object/from16 v55, v3

    move/from16 v3, v44

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "GPSMeasureMode"

    move-object/from16 v56, v9

    const/16 v9, 0xa

    invoke-direct {v3, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSDOP"

    move-object/from16 v57, v3

    move/from16 v3, v34

    const/4 v1, 0x5

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "GPSSpeedRef"

    move-object/from16 v58, v9

    move/from16 v9, v35

    const/4 v1, 0x2

    invoke-direct {v3, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSSpeed"

    move-object/from16 v59, v3

    move/from16 v3, v18

    const/4 v1, 0x5

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "GPSTrackRef"

    move-object/from16 v60, v9

    move/from16 v9, v21

    const/4 v1, 0x2

    invoke-direct {v3, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSTrack"

    move-object/from16 v61, v3

    move/from16 v3, v37

    const/4 v1, 0x5

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "GPSImgDirectionRef"

    move-object/from16 v62, v9

    move/from16 v9, v38

    const/4 v1, 0x2

    invoke-direct {v3, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSImgDirection"

    move-object/from16 v63, v3

    move/from16 v3, v41

    const/4 v1, 0x5

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "GPSMapDatum"

    move-object/from16 v64, v9

    move/from16 v9, v42

    const/4 v1, 0x2

    invoke-direct {v3, v14, v9, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSDestLatitudeRef"

    move-object/from16 v65, v3

    const/16 v3, 0x13

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "GPSDestLatitude"

    const/16 v1, 0x14

    move-object/from16 v66, v9

    const/4 v9, 0x5

    invoke-direct {v3, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "GPSDestLongitudeRef"

    const/16 v9, 0x15

    move-object/from16 v67, v3

    const/4 v3, 0x2

    invoke-direct {v1, v14, v9, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSDestLongitude"

    const/16 v3, 0x16

    move-object/from16 v68, v1

    const/4 v1, 0x5

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v14, "GPSDestBearingRef"

    move-object/from16 v69, v9

    move/from16 v1, v81

    const/4 v9, 0x2

    invoke-direct {v3, v14, v1, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "GPSDestBearing"

    const/16 v9, 0x18

    move-object/from16 v70, v3

    const/4 v3, 0x5

    invoke-direct {v1, v14, v9, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSDestDistanceRef"

    const/16 v3, 0x19

    move-object/from16 v71, v1

    const/4 v1, 0x2

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v3, "GPSDestDistance"

    move-object/from16 v72, v9

    move/from16 v9, v19

    const/4 v14, 0x5

    invoke-direct {v1, v3, v9, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v9, "GPSProcessingMethod"

    const/16 v14, 0x1b

    move-object/from16 v73, v1

    const/4 v1, 0x7

    invoke-direct {v3, v9, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSAreaInformation"

    move-object/from16 v75, v3

    const/16 v3, 0x1c

    invoke-direct {v9, v14, v3, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v3, "GPSDateStamp"

    const/16 v14, 0x1d

    move-object/from16 v76, v9

    const/4 v9, 0x2

    invoke-direct {v1, v3, v14, v9}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v9, "GPSDifferential"

    const/16 v14, 0x1e

    move-object/from16 v78, v1

    const/4 v1, 0x3

    invoke-direct {v3, v9, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v9, LB1/e;

    const-string v14, "GPSHPositioningError"

    move/from16 v40, v1

    const/16 v1, 0x1f

    move-object/from16 v79, v3

    const/4 v3, 0x5

    invoke-direct {v9, v14, v1, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    const/16 v1, 0x20

    new-array v1, v1, [LB1/e;

    const/16 v16, 0x0

    aput-object v46, v1, v16

    const/16 v24, 0x1

    aput-object v47, v1, v24

    const/16 v30, 0x2

    aput-object v49, v1, v30

    aput-object v50, v1, v40

    const/16 v32, 0x4

    aput-object v51, v1, v32

    aput-object v53, v1, v3

    const/16 v27, 0x6

    aput-object v11, v1, v27

    const/16 v25, 0x7

    aput-object v54, v1, v25

    const/16 v22, 0x8

    aput-object v55, v1, v22

    const/16 v44, 0x9

    aput-object v56, v1, v44

    const/16 v20, 0xa

    aput-object v57, v1, v20

    const/16 v34, 0xb

    aput-object v58, v1, v34

    const/16 v35, 0xc

    aput-object v59, v1, v35

    const/16 v18, 0xd

    aput-object v60, v1, v18

    const/16 v21, 0xe

    aput-object v61, v1, v21

    const/16 v37, 0xf

    aput-object v62, v1, v37

    const/16 v38, 0x10

    aput-object v63, v1, v38

    const/16 v41, 0x11

    aput-object v64, v1, v41

    const/16 v42, 0x12

    aput-object v65, v1, v42

    const/16 v3, 0x13

    aput-object v66, v1, v3

    const/16 v3, 0x14

    aput-object v67, v1, v3

    const/16 v3, 0x15

    aput-object v68, v1, v3

    const/16 v3, 0x16

    aput-object v69, v1, v3

    const/16 v81, 0x17

    aput-object v70, v1, v81

    const/16 v3, 0x18

    aput-object v71, v1, v3

    const/16 v3, 0x19

    aput-object v72, v1, v3

    const/16 v19, 0x1a

    aput-object v73, v1, v19

    const/16 v3, 0x1b

    aput-object v75, v1, v3

    const/16 v3, 0x1c

    aput-object v76, v1, v3

    const/16 v3, 0x1d

    aput-object v78, v1, v3

    const/16 v3, 0x1e

    aput-object v79, v1, v3

    const/16 v3, 0x1f

    aput-object v9, v1, v3

    .line 36
    new-instance v3, LB1/e;

    const-string v9, "InteroperabilityIndex"

    const/4 v11, 0x1

    const/4 v14, 0x2

    invoke-direct {v3, v9, v11, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-array v9, v11, [LB1/e;

    const/16 v16, 0x0

    aput-object v3, v9, v16

    .line 37
    new-instance v3, LB1/e;

    const/16 v11, 0xfe

    const/4 v14, 0x4

    invoke-direct {v3, v10, v11, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v10, LB1/e;

    const/16 v11, 0xff

    invoke-direct {v10, v2, v11, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v2, LB1/e;

    const-string v11, "ThumbnailImageWidth"

    move-object/from16 v23, v1

    move-object/from16 v26, v3

    const/4 v1, 0x3

    const/16 v3, 0x100

    invoke-direct {v2, v11, v3, v1, v14}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v3, LB1/e;

    const-string v11, "ThumbnailImageLength"

    move-object/from16 v46, v2

    const/16 v2, 0x101

    invoke-direct {v3, v11, v2, v1, v14}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v2, LB1/e;

    const/16 v11, 0x102

    invoke-direct {v2, v5, v11, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v5, LB1/e;

    const/16 v11, 0x103

    invoke-direct {v5, v4, v11, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v4, LB1/e;

    const/16 v11, 0x106

    invoke-direct {v4, v8, v11, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const/16 v8, 0x10e

    const/4 v11, 0x2

    invoke-direct {v1, v0, v8, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v8, "Make"

    const/16 v14, 0x10f

    invoke-direct {v0, v8, v14, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v8, LB1/e;

    const-string v14, "Model"

    move-object/from16 v36, v0

    const/16 v0, 0x110

    invoke-direct {v8, v14, v0, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    move-object/from16 v39, v1

    const/4 v1, 0x4

    const/4 v11, 0x3

    const/16 v14, 0x111

    invoke-direct {v0, v13, v14, v11, v1}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v1, LB1/e;

    const-string v14, "ThumbnailOrientation"

    move-object/from16 v43, v0

    const/16 v0, 0x112

    invoke-direct {v1, v14, v0, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v14, "SamplesPerPixel"

    move-object/from16 v47, v1

    const/16 v1, 0x115

    invoke-direct {v0, v14, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "RowsPerStrip"

    move-object/from16 v49, v0

    const/16 v0, 0x116

    move-object/from16 v50, v2

    const/4 v2, 0x4

    invoke-direct {v1, v14, v0, v11, v2}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v0, LB1/e;

    const-string v14, "StripByteCounts"

    move-object/from16 v51, v1

    const/16 v1, 0x117

    invoke-direct {v0, v14, v1, v11, v2}, LB1/e;-><init>(Ljava/lang/String;III)V

    new-instance v1, LB1/e;

    const-string v2, "XResolution"

    const/16 v11, 0x11a

    const/4 v14, 0x5

    invoke-direct {v1, v2, v11, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v2, LB1/e;

    const-string v11, "YResolution"

    move-object/from16 v53, v0

    const/16 v0, 0x11b

    invoke-direct {v2, v11, v0, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v11, "PlanarConfiguration"

    const/16 v14, 0x11c

    move-object/from16 v54, v1

    const/4 v1, 0x3

    invoke-direct {v0, v11, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v11, LB1/e;

    const-string v14, "ResolutionUnit"

    move-object/from16 v55, v0

    const/16 v0, 0x128

    invoke-direct {v11, v14, v0, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v14, "TransferFunction"

    move-object/from16 v56, v2

    const/16 v2, 0x12d

    invoke-direct {v0, v14, v2, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v2, "Software"

    const/16 v14, 0x131

    move-object/from16 v57, v0

    const/4 v0, 0x2

    invoke-direct {v1, v2, v14, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v2, LB1/e;

    const-string v14, "DateTime"

    move-object/from16 v58, v1

    const/16 v1, 0x132

    invoke-direct {v2, v14, v1, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "Artist"

    move-object/from16 v59, v2

    const/16 v2, 0x13b

    invoke-direct {v1, v14, v2, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v2, "WhitePoint"

    const/16 v14, 0x13e

    move-object/from16 v60, v1

    const/4 v1, 0x5

    invoke-direct {v0, v2, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v2, LB1/e;

    const-string v14, "PrimaryChromaticities"

    move-object/from16 v61, v0

    const/16 v0, 0x13f

    invoke-direct {v2, v14, v0, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const/16 v1, 0x14a

    const/4 v14, 0x4

    invoke-direct {v0, v7, v1, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    move-object/from16 v62, v0

    const-string v0, "JPEGInterchangeFormat"

    move-object/from16 v63, v2

    const/16 v2, 0x201

    invoke-direct {v1, v0, v2, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v2, "JPEGInterchangeFormatLength"

    move-object/from16 v64, v1

    const/16 v1, 0x202

    invoke-direct {v0, v2, v1, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v2, "YCbCrCoefficients"

    const/16 v14, 0x211

    move-object/from16 v65, v0

    const/4 v0, 0x5

    invoke-direct {v1, v2, v14, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v2, "YCbCrSubSampling"

    const/16 v14, 0x212

    move-object/from16 v66, v1

    const/4 v1, 0x3

    invoke-direct {v0, v2, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v2, LB1/e;

    const-string v14, "YCbCrPositioning"

    move-object/from16 v67, v0

    const/16 v0, 0x213

    invoke-direct {v2, v14, v0, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v1, "ReferenceBlackWhite"

    const/16 v14, 0x214

    move-object/from16 v68, v2

    const/4 v2, 0x5

    invoke-direct {v0, v1, v14, v2}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v2, "Copyright"

    const v14, 0x8298

    move-object/from16 v69, v0

    const/4 v0, 0x2

    invoke-direct {v1, v2, v14, v0}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const v2, 0x8769

    const/4 v14, 0x4

    invoke-direct {v0, v12, v2, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v2, LB1/e;

    move-object/from16 v70, v0

    const v0, 0x8825

    invoke-direct {v2, v6, v0, v14}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v0, LB1/e;

    const-string v14, "DNGVersion"

    move-object/from16 v71, v1

    const v1, 0xc612

    move-object/from16 v72, v2

    const/4 v2, 0x1

    invoke-direct {v0, v14, v1, v2}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v14, "DefaultCropSize"

    move/from16 v24, v2

    const v2, 0xc620

    move-object/from16 v73, v0

    move-object/from16 v32, v3

    const/4 v0, 0x3

    const/4 v3, 0x4

    invoke-direct {v1, v14, v2, v0, v3}, LB1/e;-><init>(Ljava/lang/String;III)V

    const/16 v2, 0x25

    new-array v2, v2, [LB1/e;

    const/16 v16, 0x0

    aput-object v26, v2, v16

    aput-object v10, v2, v24

    const/16 v30, 0x2

    aput-object v46, v2, v30

    aput-object v32, v2, v0

    aput-object v50, v2, v3

    const/16 v28, 0x5

    aput-object v5, v2, v28

    const/16 v27, 0x6

    aput-object v4, v2, v27

    const/16 v25, 0x7

    aput-object v39, v2, v25

    const/16 v22, 0x8

    aput-object v36, v2, v22

    const/16 v44, 0x9

    aput-object v8, v2, v44

    const/16 v20, 0xa

    aput-object v43, v2, v20

    const/16 v34, 0xb

    aput-object v47, v2, v34

    const/16 v35, 0xc

    aput-object v49, v2, v35

    const/16 v18, 0xd

    aput-object v51, v2, v18

    const/16 v21, 0xe

    aput-object v53, v2, v21

    const/16 v37, 0xf

    aput-object v54, v2, v37

    const/16 v38, 0x10

    aput-object v56, v2, v38

    const/16 v41, 0x11

    aput-object v55, v2, v41

    const/16 v42, 0x12

    aput-object v11, v2, v42

    const/16 v0, 0x13

    aput-object v57, v2, v0

    const/16 v0, 0x14

    aput-object v58, v2, v0

    const/16 v0, 0x15

    aput-object v59, v2, v0

    const/16 v0, 0x16

    aput-object v60, v2, v0

    const/16 v81, 0x17

    aput-object v61, v2, v81

    const/16 v0, 0x18

    aput-object v63, v2, v0

    const/16 v0, 0x19

    aput-object v62, v2, v0

    const/16 v19, 0x1a

    aput-object v64, v2, v19

    const/16 v0, 0x1b

    aput-object v65, v2, v0

    const/16 v0, 0x1c

    aput-object v66, v2, v0

    const/16 v0, 0x1d

    aput-object v67, v2, v0

    const/16 v0, 0x1e

    aput-object v68, v2, v0

    const/16 v0, 0x1f

    aput-object v69, v2, v0

    const/16 v0, 0x20

    aput-object v71, v2, v0

    const/16 v0, 0x21

    aput-object v70, v2, v0

    const/16 v0, 0x22

    aput-object v72, v2, v0

    const/16 v0, 0x23

    aput-object v73, v2, v0

    const/16 v0, 0x24

    aput-object v1, v2, v0

    .line 38
    new-instance v0, LB1/e;

    const/4 v1, 0x3

    const/16 v14, 0x111

    invoke-direct {v0, v13, v14, v1}, LB1/e;-><init>(Ljava/lang/String;II)V

    sput-object v0, LB1/h;->U:LB1/e;

    .line 39
    new-instance v0, LB1/e;

    const-string v1, "ThumbnailImage"

    const/4 v3, 0x7

    const/16 v4, 0x100

    invoke-direct {v0, v1, v4, v3}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const-string v3, "CameraSettingsIFDPointer"

    const/16 v4, 0x2020

    const/4 v11, 0x4

    invoke-direct {v1, v3, v4, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v4, "ImageProcessingIFDPointer"

    const/16 v5, 0x2040

    invoke-direct {v3, v4, v5, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    const/4 v4, 0x3

    new-array v5, v4, [LB1/e;

    const/16 v16, 0x0

    aput-object v0, v5, v16

    const/4 v14, 0x1

    aput-object v1, v5, v14

    const/4 v1, 0x2

    aput-object v3, v5, v1

    .line 40
    new-instance v0, LB1/e;

    const-string v3, "PreviewImageStart"

    const/16 v4, 0x101

    invoke-direct {v0, v3, v4, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v4, "PreviewImageLength"

    const/16 v8, 0x102

    invoke-direct {v3, v4, v8, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-array v4, v1, [LB1/e;

    aput-object v0, v4, v16

    aput-object v3, v4, v14

    .line 41
    new-instance v0, LB1/e;

    const-string v1, "AspectFrame"

    const/16 v3, 0x1113

    const/4 v11, 0x3

    invoke-direct {v0, v1, v3, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-array v1, v14, [LB1/e;

    aput-object v0, v1, v16

    .line 42
    new-instance v0, LB1/e;

    const-string v3, "ColorSpace"

    const/16 v8, 0x37

    invoke-direct {v0, v3, v8, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-array v3, v14, [LB1/e;

    aput-object v0, v3, v16

    const/16 v0, 0xa

    .line 43
    new-array v8, v0, [[LB1/e;

    aput-object v45, v8, v16

    aput-object v17, v8, v14

    const/16 v30, 0x2

    aput-object v23, v8, v30

    aput-object v9, v8, v11

    const/4 v11, 0x4

    aput-object v2, v8, v11

    const/16 v28, 0x5

    aput-object v45, v8, v28

    const/16 v27, 0x6

    aput-object v5, v8, v27

    const/16 v25, 0x7

    aput-object v4, v8, v25

    const/16 v22, 0x8

    aput-object v1, v8, v22

    const/16 v44, 0x9

    aput-object v3, v8, v44

    sput-object v8, LB1/h;->V:[[LB1/e;

    .line 44
    new-instance v0, LB1/e;

    const/16 v1, 0x14a

    invoke-direct {v0, v7, v1, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v1, LB1/e;

    const v2, 0x8769

    invoke-direct {v1, v12, v2, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v2, LB1/e;

    const v3, 0x8825

    invoke-direct {v2, v6, v3, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v3, LB1/e;

    const-string v4, "InteroperabilityIFDPointer"

    const v5, 0xa005

    invoke-direct {v3, v4, v5, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v4, LB1/e;

    const-string v5, "CameraSettingsIFDPointer"

    const/16 v6, 0x2020

    const/4 v11, 0x1

    invoke-direct {v4, v5, v6, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    new-instance v5, LB1/e;

    const-string v6, "ImageProcessingIFDPointer"

    const/16 v7, 0x2040

    invoke-direct {v5, v6, v7, v11}, LB1/e;-><init>(Ljava/lang/String;II)V

    const/4 v14, 0x6

    new-array v6, v14, [LB1/e;

    const/16 v16, 0x0

    aput-object v0, v6, v16

    aput-object v1, v6, v11

    const/16 v30, 0x2

    aput-object v2, v6, v30

    const/16 v40, 0x3

    aput-object v3, v6, v40

    const/16 v32, 0x4

    aput-object v4, v6, v32

    const/16 v28, 0x5

    aput-object v5, v6, v28

    sput-object v6, LB1/h;->W:[LB1/e;

    const/16 v9, 0xa

    .line 45
    new-array v0, v9, [Ljava/util/HashMap;

    sput-object v0, LB1/h;->X:[Ljava/util/HashMap;

    .line 46
    new-array v0, v9, [Ljava/util/HashMap;

    sput-object v0, LB1/h;->Y:[Ljava/util/HashMap;

    .line 47
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "DigitalZoomRatio"

    const-string v2, "ExposureTime"

    const-string v3, "FNumber"

    const-string v4, "SubjectDistance"

    const-string v5, "GPSTimeStamp"

    filled-new-array {v3, v1, v2, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, LB1/h;->Z:Ljava/util/HashSet;

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LB1/h;->a0:Ljava/util/HashMap;

    .line 49
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, LB1/h;->b0:Ljava/nio/charset/Charset;

    .line 50
    const-string v1, "Exif\u0000\u0000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, LB1/h;->c0:[B

    .line 51
    const-string v1, "http://ns.adobe.com/xap/1.0/\u0000"

    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, LB1/h;->d0:[B

    .line 53
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 54
    const-string v2, "UTC"

    invoke-static {v2}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 55
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 56
    const-string v1, "UTC"

    invoke-static {v1}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v14, 0x0

    .line 57
    :goto_0
    sget-object v0, LB1/h;->V:[[LB1/e;

    array-length v1, v0

    if-ge v14, v1, :cond_1

    .line 58
    sget-object v1, LB1/h;->X:[Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    aput-object v2, v1, v14

    .line 59
    sget-object v1, LB1/h;->Y:[Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    aput-object v2, v1, v14

    .line 60
    aget-object v0, v0, v14

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 61
    sget-object v4, LB1/h;->X:[Ljava/util/HashMap;

    aget-object v4, v4, v14

    iget v5, v3, LB1/e;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v4, LB1/h;->Y:[Ljava/util/HashMap;

    aget-object v4, v4, v14

    iget-object v5, v3, LB1/e;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v24, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    const/16 v24, 0x1

    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_1
    const/16 v24, 0x1

    .line 63
    sget-object v0, LB1/h;->a0:Ljava/util/HashMap;

    sget-object v1, LB1/h;->W:[LB1/e;

    const/16 v16, 0x0

    aget-object v2, v1, v16

    iget v2, v2, LB1/e;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    aget-object v2, v1, v24

    iget v2, v2, LB1/e;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v89

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v30, 0x2

    .line 65
    aget-object v2, v1, v30

    iget v2, v2, LB1/e;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v77

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v40, 0x3

    .line 66
    aget-object v2, v1, v40

    iget v2, v2, LB1/e;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v74

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v32, 0x4

    .line 67
    aget-object v2, v1, v32

    iget v2, v2, LB1/e;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v52

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v28, 0x5

    .line 68
    aget-object v1, v1, v28

    iget v1, v1, LB1/e;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v48

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    const-string v0, ".*[1-9].*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 70
    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 71
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LB1/h;->e0:Ljava/util/regex/Pattern;

    .line 72
    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 73
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LB1/h;->f0:Ljava/util/regex/Pattern;

    .line 74
    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 75
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LB1/h;->g0:Ljava/util/regex/Pattern;

    return-void

    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    :array_1
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    :array_2
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    :array_3
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    :array_4
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_7
    .array-data 1
        0x65t
        0x58t
        0x49t
        0x66t
    .end array-data

    :array_8
    .array-data 1
        0x49t
        0x48t
        0x44t
        0x52t
    .end array-data

    :array_9
    .array-data 1
        0x49t
        0x45t
        0x4et
        0x44t
    .end array-data

    :array_a
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_b
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_c
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_d
    .array-data 1
        -0x63t
        0x1t
        0x2at
    .end array-data

    :array_e
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_f
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 6

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    sget-object v0, LB1/h;->V:[[LB1/e;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 20
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, LB1/h;->f:Ljava/util/HashSet;

    .line 21
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, LB1/h;->a:Ljava/lang/String;

    .line 23
    instance-of v1, p1, Landroid/content/res/AssetManager$AssetInputStream;

    if-eqz v1, :cond_0

    .line 24
    move-object v1, p1

    check-cast v1, Landroid/content/res/AssetManager$AssetInputStream;

    iput-object v1, p0, LB1/h;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 25
    iput-object v0, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    goto :goto_0

    .line 26
    :cond_0
    instance-of v1, p1, Ljava/io/FileInputStream;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Ljava/io/FileInputStream;

    .line 27
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v2

    .line 28
    :try_start_0
    sget v3, Landroid/system/OsConstants;->SEEK_CUR:I

    const-wide/16 v4, 0x0

    invoke-static {v2, v4, v5, v3}, LB1/i;->c(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    iput-object v0, p0, LB1/h;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 30
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    iput-object v0, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    goto :goto_0

    .line 31
    :catch_0
    sget-boolean v1, LB1/h;->t:Z

    if-eqz v1, :cond_1

    .line 32
    const-string v1, "ExifInterface"

    const-string v2, "The file descriptor for the given input is not seekable"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    :cond_1
    iput-object v0, p0, LB1/h;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 34
    iput-object v0, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 35
    :goto_0
    invoke-virtual {p0, p1}, LB1/h;->u(Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, LB1/h;->V:[[LB1/e;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 3
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, LB1/h;->f:Ljava/util/HashSet;

    .line 4
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LB1/h;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 6
    iput-object p1, p0, LB1/h;->a:Ljava/lang/String;

    .line 7
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    :try_start_1
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :try_start_2
    sget v2, Landroid/system/OsConstants;->SEEK_CUR:I

    const-wide/16 v3, 0x0

    invoke-static {p1, v3, v4, v2}, LB1/i;->c(Ljava/io/FileDescriptor;JI)J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p1, 0x1

    goto :goto_0

    .line 10
    :catch_0
    :try_start_3
    sget-boolean p1, LB1/h;->t:Z

    if-eqz p1, :cond_0

    .line 11
    const-string p1, "ExifInterface"

    const-string v2, "The file descriptor for the given input is not seekable"

    invoke-static {p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 12
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    iput-object p1, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_2

    .line 13
    :cond_1
    iput-object v0, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 14
    :goto_1
    invoke-virtual {p0, v1}, LB1/h;->u(Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 15
    invoke-static {v1}, Lgc/b;->l(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception p1

    :goto_2
    invoke-static {v0}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 16
    throw p1

    .line 17
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "filename cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(D)Ljava/lang/String;
    .locals 8

    .line 1
    double-to-long v0, p0

    .line 2
    long-to-double v2, v0

    .line 3
    sub-double/2addr p0, v2

    .line 4
    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    .line 5
    .line 6
    mul-double v4, p0, v2

    .line 7
    .line 8
    double-to-long v4, v4

    .line 9
    long-to-double v6, v4

    .line 10
    div-double/2addr v6, v2

    .line 11
    sub-double/2addr p0, v6

    .line 12
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr p0, v2

    .line 18
    const-wide v2, 0x416312d000000000L    # 1.0E7

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    mul-double/2addr p0, v2

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, "/1,"

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, "/10000000"

    .line 51
    .line 52
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)D
    .locals 11

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    :try_start_0
    const-string v1, ","

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    aget-object v3, p0, v1

    .line 12
    .line 13
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    aget-object v4, v3, v1

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const/4 v6, 0x1

    .line 28
    aget-object v3, v3, v6

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 35
    .line 36
    .line 37
    move-result-wide v7

    .line 38
    div-double/2addr v4, v7

    .line 39
    aget-object v3, p0, v6

    .line 40
    .line 41
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    aget-object v7, v3, v1

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    aget-object v3, v3, v6

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    div-double/2addr v7, v9

    .line 66
    const/4 v3, 0x2

    .line 67
    aget-object p0, p0, v3

    .line 68
    .line 69
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    aget-object v0, p0, v1

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    aget-object p0, p0, v6

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    div-double/2addr v0, v2

    .line 94
    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    .line 95
    .line 96
    div-double/2addr v7, v2

    .line 97
    add-double/2addr v7, v4

    .line 98
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    div-double/2addr v0, v2

    .line 104
    add-double/2addr v0, v7

    .line 105
    const-string p0, "S"

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    const-string p0, "W"

    .line 114
    .line 115
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_0

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_0
    const-string p0, "N"

    .line 123
    .line 124
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_2

    .line 129
    .line 130
    const-string p0, "E"

    .line 131
    .line 132
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :cond_2
    :goto_0
    return-wide v0

    .line 146
    :cond_3
    :goto_1
    neg-double p0, v0

    .line 147
    return-wide p0

    .line 148
    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw p0
.end method

.method public static r(Ljava/lang/String;)Landroid/util/Pair;
    .locals 10

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x2

    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const/4 v6, -0x1

    .line 15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    if-eqz v1, :cond_9

    .line 20
    .line 21
    invoke-virtual {p0, v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    aget-object v0, p0, v2

    .line 26
    .line 27
    invoke-static {v0}, LB1/h;->r(Ljava/lang/String;)Landroid/util/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-ne v1, v4, :cond_0

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    :goto_0
    array-length v1, p0

    .line 43
    if-ge v3, v1, :cond_8

    .line 44
    .line 45
    aget-object v1, p0, v3

    .line 46
    .line 47
    invoke-static {v1}, LB1/h;->r(Ljava/lang/String;)Landroid/util/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/lang/Integer;

    .line 54
    .line 55
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v2, v4}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Ljava/lang/Integer;

    .line 66
    .line 67
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v2, v4}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move v2, v6

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    :goto_1
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    :goto_2
    iget-object v4, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eq v4, v6, :cond_4

    .line 95
    .line 96
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Ljava/lang/Integer;

    .line 99
    .line 100
    iget-object v8, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v4, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/Integer;

    .line 111
    .line 112
    iget-object v4, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v1, v4}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    :cond_3
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    goto :goto_3

    .line 129
    :cond_4
    move v1, v6

    .line 130
    :goto_3
    if-ne v2, v6, :cond_5

    .line 131
    .line 132
    if-ne v1, v6, :cond_5

    .line 133
    .line 134
    new-instance p0, Landroid/util/Pair;

    .line 135
    .line 136
    invoke-direct {p0, v5, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_5
    if-ne v2, v6, :cond_6

    .line 141
    .line 142
    new-instance v0, Landroid/util/Pair;

    .line 143
    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_6
    if-ne v1, v6, :cond_7

    .line 153
    .line 154
    new-instance v0, Landroid/util/Pair;

    .line 155
    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_8
    return-object v0

    .line 167
    :cond_9
    const-string v0, "/"

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    const-wide/16 v8, 0x0

    .line 174
    .line 175
    if-eqz v1, :cond_f

    .line 176
    .line 177
    invoke-virtual {p0, v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    array-length v0, p0

    .line 182
    if-ne v0, v4, :cond_e

    .line 183
    .line 184
    :try_start_0
    aget-object v0, p0, v2

    .line 185
    .line 186
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 187
    .line 188
    .line 189
    move-result-wide v0

    .line 190
    double-to-long v0, v0

    .line 191
    aget-object p0, p0, v3

    .line 192
    .line 193
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 194
    .line 195
    .line 196
    move-result-wide v2

    .line 197
    double-to-long v2, v2

    .line 198
    cmp-long p0, v0, v8

    .line 199
    .line 200
    const/16 v4, 0xa

    .line 201
    .line 202
    if-ltz p0, :cond_d

    .line 203
    .line 204
    cmp-long p0, v2, v8

    .line 205
    .line 206
    if-gez p0, :cond_a

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_a
    const-wide/32 v8, 0x7fffffff

    .line 210
    .line 211
    .line 212
    cmp-long p0, v0, v8

    .line 213
    .line 214
    const/4 v0, 0x5

    .line 215
    if-gtz p0, :cond_c

    .line 216
    .line 217
    cmp-long p0, v2, v8

    .line 218
    .line 219
    if-lez p0, :cond_b

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_b
    new-instance p0, Landroid/util/Pair;

    .line 223
    .line 224
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-direct {p0, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-object p0

    .line 236
    :cond_c
    :goto_5
    new-instance p0, Landroid/util/Pair;

    .line 237
    .line 238
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-direct {p0, v0, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return-object p0

    .line 246
    :cond_d
    :goto_6
    new-instance p0, Landroid/util/Pair;

    .line 247
    .line 248
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-direct {p0, v0, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 253
    .line 254
    .line 255
    return-object p0

    .line 256
    :catch_0
    :cond_e
    new-instance p0, Landroid/util/Pair;

    .line 257
    .line 258
    invoke-direct {p0, v5, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    return-object p0

    .line 262
    :cond_f
    :try_start_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 263
    .line 264
    .line 265
    move-result-wide v0

    .line 266
    cmp-long v2, v0, v8

    .line 267
    .line 268
    const/4 v3, 0x4

    .line 269
    if-ltz v2, :cond_10

    .line 270
    .line 271
    const-wide/32 v8, 0xffff

    .line 272
    .line 273
    .line 274
    cmp-long v0, v0, v8

    .line 275
    .line 276
    if-gtz v0, :cond_10

    .line 277
    .line 278
    new-instance v0, Landroid/util/Pair;

    .line 279
    .line 280
    const/4 v1, 0x3

    .line 281
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    return-object v0

    .line 293
    :cond_10
    if-gez v2, :cond_11

    .line 294
    .line 295
    new-instance v0, Landroid/util/Pair;

    .line 296
    .line 297
    const/16 v1, 0x9

    .line 298
    .line 299
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    return-object v0

    .line 307
    :cond_11
    new-instance v0, Landroid/util/Pair;

    .line 308
    .line 309
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :catch_1
    :try_start_2
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 318
    .line 319
    .line 320
    new-instance p0, Landroid/util/Pair;

    .line 321
    .line 322
    const/16 v0, 0xc

    .line 323
    .line 324
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-direct {p0, v0, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 329
    .line 330
    .line 331
    return-object p0

    .line 332
    :catch_2
    new-instance p0, Landroid/util/Pair;

    .line 333
    .line 334
    invoke-direct {p0, v5, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    return-object p0
.end method

.method public static x(LB1/b;)Ljava/nio/ByteOrder;
    .locals 3

    .line 1
    invoke-virtual {p0}, LB1/b;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x4949

    .line 6
    .line 7
    const-string v1, "ExifInterface"

    .line 8
    .line 9
    sget-boolean v2, LB1/h;->t:Z

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x4d4d

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-string p0, "readExifSegment: Byte Align MM"

    .line 20
    .line 21
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Invalid byte order: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    if-eqz v2, :cond_3

    .line 52
    .line 53
    const-string p0, "readExifSegment: Byte Align II"

    .line 54
    .line 55
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_3
    sget-object p0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 59
    .line 60
    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    sget-object v1, LB1/h;->V:[[LB1/e;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public final B(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    aget-object v1, v0, p1

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    aget-object v1, v0, p1

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, p3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    aget-object p1, v0, p1

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final C()V
    .locals 14

    .line 1
    const-string v0, "Failed to save new file. Original file is stored in "

    .line 2
    .line 3
    iget v1, p0, LB1/h;->d:I

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/16 v3, 0xd

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 18
    .line 19
    const-string v1, "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    :goto_0
    iget-object v1, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    iget-object v1, p0, LB1/h;->a:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 35
    .line 36
    const-string v1, "ExifInterface does not support saving attributes for the current input."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_3
    :goto_1
    iget-boolean v1, p0, LB1/h;->h:Z

    .line 43
    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    iget-boolean v1, p0, LB1/h;->i:Z

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    iget-boolean v1, p0, LB1/h;->j:Z

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 56
    .line 57
    const-string v1, "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_5
    :goto_2
    iget v1, p0, LB1/h;->n:I

    .line 64
    .line 65
    const/4 v5, 0x6

    .line 66
    const/4 v6, 0x0

    .line 67
    if-eq v1, v5, :cond_7

    .line 68
    .line 69
    const/4 v5, 0x7

    .line 70
    if-ne v1, v5, :cond_6

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_6
    move-object v1, v6

    .line 74
    goto :goto_4

    .line 75
    :cond_7
    :goto_3
    invoke-virtual {p0}, LB1/h;->p()[B

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_4
    iput-object v1, p0, LB1/h;->m:[B

    .line 80
    .line 81
    :try_start_0
    const-string v1, "temp"

    .line 82
    .line 83
    const-string v5, "tmp"

    .line 84
    .line 85
    invoke-static {v1, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v5, p0, LB1/h;->a:Ljava/lang/String;

    .line 90
    .line 91
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    if-eqz v5, :cond_8

    .line 94
    .line 95
    new-instance v5, Ljava/io/FileInputStream;

    .line 96
    .line 97
    iget-object v9, p0, LB1/h;->a:Ljava/lang/String;

    .line 98
    .line 99
    invoke-direct {v5, v9}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    move-object v9, v6

    .line 105
    goto/16 :goto_14

    .line 106
    .line 107
    :catch_0
    move-exception v0

    .line 108
    move-object v9, v6

    .line 109
    goto/16 :goto_13

    .line 110
    .line 111
    :cond_8
    iget-object v5, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 112
    .line 113
    sget v9, Landroid/system/OsConstants;->SEEK_SET:I

    .line 114
    .line 115
    invoke-static {v5, v7, v8, v9}, LB1/i;->c(Ljava/io/FileDescriptor;JI)J

    .line 116
    .line 117
    .line 118
    new-instance v5, Ljava/io/FileInputStream;

    .line 119
    .line 120
    iget-object v9, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 121
    .line 122
    invoke-direct {v5, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    :goto_5
    :try_start_1
    new-instance v9, Ljava/io/FileOutputStream;

    .line 126
    .line 127
    invoke-direct {v9, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 128
    .line 129
    .line 130
    :try_start_2
    invoke-static {v5, v9}, Lgc/b;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 131
    .line 132
    .line 133
    invoke-static {v5}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v9}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 137
    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    :try_start_3
    new-instance v9, Ljava/io/FileInputStream;

    .line 141
    .line 142
    invoke-direct {v9, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 143
    .line 144
    .line 145
    :try_start_4
    iget-object v10, p0, LB1/h;->a:Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v10, :cond_9

    .line 148
    .line 149
    new-instance v10, Ljava/io/FileOutputStream;

    .line 150
    .line 151
    iget-object v11, p0, LB1/h;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-direct {v10, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    goto :goto_8

    .line 157
    :catchall_1
    move-exception v0

    .line 158
    move-object v12, v6

    .line 159
    goto/16 :goto_10

    .line 160
    .line 161
    :catch_1
    move-exception v2

    .line 162
    move-object v10, v6

    .line 163
    move-object v11, v10

    .line 164
    :goto_6
    move-object v12, v11

    .line 165
    :goto_7
    move-object v6, v9

    .line 166
    goto :goto_b

    .line 167
    :cond_9
    iget-object v10, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 168
    .line 169
    sget v11, Landroid/system/OsConstants;->SEEK_SET:I

    .line 170
    .line 171
    invoke-static {v10, v7, v8, v11}, LB1/i;->c(Ljava/io/FileDescriptor;JI)J

    .line 172
    .line 173
    .line 174
    new-instance v10, Ljava/io/FileOutputStream;

    .line 175
    .line 176
    iget-object v11, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 177
    .line 178
    invoke-direct {v10, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 179
    .line 180
    .line 181
    :goto_8
    :try_start_5
    new-instance v11, Ljava/io/BufferedInputStream;

    .line 182
    .line 183
    invoke-direct {v11, v9}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 184
    .line 185
    .line 186
    :try_start_6
    new-instance v12, Ljava/io/BufferedOutputStream;

    .line 187
    .line 188
    invoke-direct {v12, v10}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 189
    .line 190
    .line 191
    :try_start_7
    iget v13, p0, LB1/h;->d:I

    .line 192
    .line 193
    if-ne v13, v4, :cond_a

    .line 194
    .line 195
    invoke-virtual {p0, v11, v12}, LB1/h;->D(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V

    .line 196
    .line 197
    .line 198
    goto :goto_a

    .line 199
    :goto_9
    move-object v6, v11

    .line 200
    goto/16 :goto_10

    .line 201
    .line 202
    :cond_a
    if-ne v13, v3, :cond_b

    .line 203
    .line 204
    invoke-virtual {p0, v11, v12}, LB1/h;->E(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V

    .line 205
    .line 206
    .line 207
    goto :goto_a

    .line 208
    :cond_b
    if-ne v13, v2, :cond_c

    .line 209
    .line 210
    invoke-virtual {p0, v11, v12}, LB1/h;->F(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 211
    .line 212
    .line 213
    :cond_c
    :goto_a
    invoke-static {v11}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v12}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 220
    .line 221
    .line 222
    iput-object v6, p0, LB1/h;->m:[B

    .line 223
    .line 224
    return-void

    .line 225
    :catchall_2
    move-exception v0

    .line 226
    goto :goto_9

    .line 227
    :catch_2
    move-exception v2

    .line 228
    goto :goto_7

    .line 229
    :catchall_3
    move-exception v0

    .line 230
    move-object v12, v6

    .line 231
    goto :goto_9

    .line 232
    :catch_3
    move-exception v2

    .line 233
    move-object v12, v6

    .line 234
    goto :goto_7

    .line 235
    :catch_4
    move-exception v2

    .line 236
    move-object v11, v6

    .line 237
    goto :goto_6

    .line 238
    :catch_5
    move-exception v2

    .line 239
    move-object v10, v6

    .line 240
    move-object v11, v10

    .line 241
    move-object v12, v11

    .line 242
    :goto_b
    :try_start_8
    new-instance v3, Ljava/io/FileInputStream;

    .line 243
    .line 244
    invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 245
    .line 246
    .line 247
    :try_start_9
    iget-object v4, p0, LB1/h;->a:Ljava/lang/String;

    .line 248
    .line 249
    if-nez v4, :cond_d

    .line 250
    .line 251
    iget-object v4, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 252
    .line 253
    sget v6, Landroid/system/OsConstants;->SEEK_SET:I

    .line 254
    .line 255
    invoke-static {v4, v7, v8, v6}, LB1/i;->c(Ljava/io/FileDescriptor;JI)J

    .line 256
    .line 257
    .line 258
    new-instance v4, Ljava/io/FileOutputStream;

    .line 259
    .line 260
    iget-object v6, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 261
    .line 262
    invoke-direct {v4, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 263
    .line 264
    .line 265
    :goto_c
    move-object v10, v4

    .line 266
    goto :goto_d

    .line 267
    :catchall_4
    move-exception v0

    .line 268
    move-object v6, v3

    .line 269
    goto :goto_f

    .line 270
    :catch_6
    move-exception v2

    .line 271
    move-object v6, v3

    .line 272
    goto :goto_e

    .line 273
    :cond_d
    new-instance v4, Ljava/io/FileOutputStream;

    .line 274
    .line 275
    iget-object v6, p0, LB1/h;->a:Ljava/lang/String;

    .line 276
    .line 277
    invoke-direct {v4, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto :goto_c

    .line 281
    :goto_d
    invoke-static {v3, v10}, Lgc/b;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 282
    .line 283
    .line 284
    :try_start_a
    invoke-static {v3}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v10}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 288
    .line 289
    .line 290
    new-instance v0, Ljava/io/IOException;

    .line 291
    .line 292
    const-string v3, "Failed to save new file"

    .line 293
    .line 294
    invoke-direct {v0, v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 298
    :catchall_5
    move-exception v0

    .line 299
    goto :goto_f

    .line 300
    :catch_7
    move-exception v2

    .line 301
    :goto_e
    const/4 v5, 0x1

    .line 302
    :try_start_b
    new-instance v3, Ljava/io/IOException;

    .line 303
    .line 304
    new-instance v4, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-direct {v3, v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 324
    :goto_f
    :try_start_c
    invoke-static {v6}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v10}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 328
    .line 329
    .line 330
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 331
    :goto_10
    invoke-static {v6}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v12}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 335
    .line 336
    .line 337
    if-nez v5, :cond_e

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 340
    .line 341
    .line 342
    :cond_e
    throw v0

    .line 343
    :catchall_6
    move-exception v0

    .line 344
    :goto_11
    move-object v6, v5

    .line 345
    goto :goto_14

    .line 346
    :catch_8
    move-exception v0

    .line 347
    :goto_12
    move-object v6, v5

    .line 348
    goto :goto_13

    .line 349
    :catchall_7
    move-exception v0

    .line 350
    move-object v9, v6

    .line 351
    goto :goto_11

    .line 352
    :catch_9
    move-exception v0

    .line 353
    move-object v9, v6

    .line 354
    goto :goto_12

    .line 355
    :goto_13
    :try_start_d
    new-instance v1, Ljava/io/IOException;

    .line 356
    .line 357
    const-string v2, "Failed to copy original file to temp file"

    .line 358
    .line 359
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 363
    :catchall_8
    move-exception v0

    .line 364
    :goto_14
    invoke-static {v6}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v9}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 368
    .line 369
    .line 370
    throw v0
.end method

.method public final D(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
    .locals 12

    .line 1
    sget-boolean v0, LB1/h;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "saveJpegAttributes starting with (inputStream: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", outputStream: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ")"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "ExifInterface"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v0, LB1/b;

    .line 38
    .line 39
    invoke-direct {v0, p1}, LB1/b;-><init>(Ljava/io/InputStream;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, LB1/c;

    .line 43
    .line 44
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 45
    .line 46
    invoke-direct {p1, p2, v1}, LB1/c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, LB1/b;->readByte()B

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    const-string v1, "Invalid marker"

    .line 54
    .line 55
    const/4 v2, -0x1

    .line 56
    if-ne p2, v2, :cond_c

    .line 57
    .line 58
    invoke-virtual {p1, v2}, LB1/c;->a(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, LB1/b;->readByte()B

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    const/16 v3, -0x28

    .line 66
    .line 67
    if-ne p2, v3, :cond_b

    .line 68
    .line 69
    invoke-virtual {p1, v3}, LB1/c;->a(I)V

    .line 70
    .line 71
    .line 72
    const-string p2, "Xmp"

    .line 73
    .line 74
    invoke-virtual {p0, p2}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    iget-boolean v3, p0, LB1/h;->s:Z

    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    aget-object v3, v4, v5

    .line 88
    .line 89
    invoke-virtual {v3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, LB1/d;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const/4 v3, 0x0

    .line 97
    :goto_0
    invoke-virtual {p1, v2}, LB1/c;->a(I)V

    .line 98
    .line 99
    .line 100
    const/16 v6, -0x1f

    .line 101
    .line 102
    invoke-virtual {p1, v6}, LB1/c;->a(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, LB1/h;->L(LB1/c;)V

    .line 106
    .line 107
    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    aget-object v4, v4, v5

    .line 111
    .line 112
    invoke-virtual {v4, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_2
    const/16 p2, 0x1000

    .line 116
    .line 117
    new-array v3, p2, [B

    .line 118
    .line 119
    :cond_3
    :goto_1
    invoke-virtual {v0}, LB1/b;->readByte()B

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-ne v4, v2, :cond_a

    .line 124
    .line 125
    invoke-virtual {v0}, LB1/b;->readByte()B

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    const/16 v7, -0x27

    .line 130
    .line 131
    if-eq v4, v7, :cond_9

    .line 132
    .line 133
    const/16 v7, -0x26

    .line 134
    .line 135
    if-eq v4, v7, :cond_9

    .line 136
    .line 137
    const-string v7, "Invalid length"

    .line 138
    .line 139
    if-eq v4, v6, :cond_5

    .line 140
    .line 141
    invoke-virtual {p1, v2}, LB1/c;->a(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v4}, LB1/c;->a(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, LB1/b;->readUnsignedShort()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-virtual {p1, v4}, LB1/c;->i(I)V

    .line 152
    .line 153
    .line 154
    add-int/lit8 v4, v4, -0x2

    .line 155
    .line 156
    if-ltz v4, :cond_4

    .line 157
    .line 158
    :goto_2
    if-lez v4, :cond_3

    .line 159
    .line 160
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    invoke-virtual {v0, v3, v5, v7}, LB1/b;->read([BII)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-ltz v7, :cond_3

    .line 169
    .line 170
    invoke-virtual {p1, v3, v5, v7}, LB1/c;->write([BII)V

    .line 171
    .line 172
    .line 173
    sub-int/2addr v4, v7

    .line 174
    goto :goto_2

    .line 175
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 176
    .line 177
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :cond_5
    invoke-virtual {v0}, LB1/b;->readUnsignedShort()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    add-int/lit8 v9, v8, -0x2

    .line 186
    .line 187
    if-ltz v9, :cond_8

    .line 188
    .line 189
    const/4 v7, 0x6

    .line 190
    new-array v10, v7, [B

    .line 191
    .line 192
    if-lt v9, v7, :cond_6

    .line 193
    .line 194
    invoke-virtual {v0, v10}, LB1/b;->readFully([B)V

    .line 195
    .line 196
    .line 197
    sget-object v11, LB1/h;->c0:[B

    .line 198
    .line 199
    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    if-eqz v11, :cond_6

    .line 204
    .line 205
    add-int/lit8 v8, v8, -0x8

    .line 206
    .line 207
    invoke-virtual {v0, v8}, LB1/b;->a(I)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_6
    invoke-virtual {p1, v2}, LB1/c;->a(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v4}, LB1/c;->a(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v8}, LB1/c;->i(I)V

    .line 218
    .line 219
    .line 220
    if-lt v9, v7, :cond_7

    .line 221
    .line 222
    add-int/lit8 v9, v8, -0x8

    .line 223
    .line 224
    invoke-virtual {p1, v10}, LB1/c;->write([B)V

    .line 225
    .line 226
    .line 227
    :cond_7
    :goto_3
    if-lez v9, :cond_3

    .line 228
    .line 229
    invoke-static {v9, p2}, Ljava/lang/Math;->min(II)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    invoke-virtual {v0, v3, v5, v4}, LB1/b;->read([BII)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-ltz v4, :cond_3

    .line 238
    .line 239
    invoke-virtual {p1, v3, v5, v4}, LB1/c;->write([BII)V

    .line 240
    .line 241
    .line 242
    sub-int/2addr v9, v4

    .line 243
    goto :goto_3

    .line 244
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 245
    .line 246
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :cond_9
    invoke-virtual {p1, v2}, LB1/c;->a(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v4}, LB1/c;->a(I)V

    .line 254
    .line 255
    .line 256
    invoke-static {v0, p1}, Lgc/b;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_a
    new-instance p1, Ljava/io/IOException;

    .line 261
    .line 262
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p1

    .line 266
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 267
    .line 268
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw p1

    .line 272
    :cond_c
    new-instance p1, Ljava/io/IOException;

    .line 273
    .line 274
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw p1
.end method

.method public final E(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
    .locals 5

    .line 1
    sget-boolean v0, LB1/h;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "savePngAttributes starting with (inputStream: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", outputStream: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ")"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "ExifInterface"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v0, LB1/b;

    .line 38
    .line 39
    invoke-direct {v0, p1}, LB1/b;-><init>(Ljava/io/InputStream;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, LB1/c;

    .line 43
    .line 44
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 45
    .line 46
    invoke-direct {p1, p2, v1}, LB1/c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 47
    .line 48
    .line 49
    sget-object p2, LB1/h;->E:[B

    .line 50
    .line 51
    array-length v2, p2

    .line 52
    invoke-static {v0, p1, v2}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 53
    .line 54
    .line 55
    iget v2, p0, LB1/h;->o:I

    .line 56
    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0}, LB1/b;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-virtual {p1, p2}, LB1/c;->b(I)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 p2, p2, 0x8

    .line 67
    .line 68
    invoke-static {v0, p1, p2}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    array-length p2, p2

    .line 73
    sub-int/2addr v2, p2

    .line 74
    add-int/lit8 v2, v2, -0x8

    .line 75
    .line 76
    invoke-static {v0, p1, v2}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, LB1/b;->readInt()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    add-int/lit8 p2, p2, 0x8

    .line 84
    .line 85
    invoke-virtual {v0, p2}, LB1/b;->a(I)V

    .line 86
    .line 87
    .line 88
    :goto_0
    const/4 p2, 0x0

    .line 89
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 92
    .line 93
    .line 94
    :try_start_1
    new-instance p2, LB1/c;

    .line 95
    .line 96
    invoke-direct {p2, v2, v1}, LB1/c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p2}, LB1/h;->L(LB1/c;)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p2, LB1/c;->a:Ljava/io/OutputStream;

    .line 103
    .line 104
    check-cast p2, Ljava/io/ByteArrayOutputStream;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p1, p2}, LB1/c;->write([B)V

    .line 111
    .line 112
    .line 113
    new-instance v1, Ljava/util/zip/CRC32;

    .line 114
    .line 115
    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 116
    .line 117
    .line 118
    array-length v3, p2

    .line 119
    const/4 v4, 0x4

    .line 120
    sub-int/2addr v3, v4

    .line 121
    invoke-virtual {v1, p2, v4, v3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    long-to-int p2, v3

    .line 129
    invoke-virtual {p1, p2}, LB1/c;->b(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    .line 132
    invoke-static {v2}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0, p1}, Lgc/b;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :catchall_0
    move-exception p1

    .line 140
    move-object p2, v2

    .line 141
    goto :goto_1

    .line 142
    :catchall_1
    move-exception p1

    .line 143
    :goto_1
    invoke-static {p2}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 144
    .line 145
    .line 146
    throw p1
.end method

.method public final F(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-boolean v3, LB1/h;->t:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "saveWebpAttributes starting with (inputStream: "

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v4, ", outputStream: "

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v4, ")"

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, "ExifInterface"

    .line 39
    .line 40
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    new-instance v3, LB1/b;

    .line 44
    .line 45
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 46
    .line 47
    invoke-direct {v3, v0, v4}, LB1/b;-><init>(Ljava/io/InputStream;Ljava/nio/ByteOrder;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, LB1/c;

    .line 51
    .line 52
    invoke-direct {v0, v2, v4}, LB1/c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 53
    .line 54
    .line 55
    sget-object v2, LB1/h;->I:[B

    .line 56
    .line 57
    array-length v5, v2

    .line 58
    invoke-static {v3, v0, v5}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 59
    .line 60
    .line 61
    sget-object v5, LB1/h;->J:[B

    .line 62
    .line 63
    array-length v6, v5

    .line 64
    const/4 v7, 0x4

    .line 65
    add-int/2addr v6, v7

    .line 66
    invoke-virtual {v3, v6}, LB1/b;->a(I)V

    .line 67
    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    :try_start_0
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    .line 71
    .line 72
    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 73
    .line 74
    .line 75
    :try_start_1
    new-instance v6, LB1/c;

    .line 76
    .line 77
    invoke-direct {v6, v8, v4}, LB1/c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 78
    .line 79
    .line 80
    iget v4, v1, LB1/h;->o:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 81
    .line 82
    const/16 v9, 0x8

    .line 83
    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    :try_start_2
    array-length v2, v2

    .line 87
    add-int/2addr v2, v7

    .line 88
    array-length v10, v5

    .line 89
    add-int/2addr v2, v10

    .line 90
    sub-int/2addr v4, v2

    .line 91
    sub-int/2addr v4, v9

    .line 92
    invoke-static {v3, v6, v4}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v7}, LB1/b;->a(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    rem-int/lit8 v4, v2, 0x2

    .line 103
    .line 104
    if-eqz v4, :cond_1

    .line 105
    .line 106
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    :cond_1
    invoke-virtual {v3, v2}, LB1/b;->a(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v6}, LB1/h;->L(LB1/c;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    .line 114
    :cond_2
    :goto_0
    move-object/from16 v18, v0

    .line 115
    .line 116
    move-object/from16 v17, v8

    .line 117
    .line 118
    goto/16 :goto_b

    .line 119
    .line 120
    :catchall_0
    move-exception v0

    .line 121
    move-object v6, v8

    .line 122
    goto/16 :goto_f

    .line 123
    .line 124
    :catch_0
    move-exception v0

    .line 125
    move-object v6, v8

    .line 126
    goto/16 :goto_e

    .line 127
    .line 128
    :cond_3
    :try_start_3
    new-array v2, v7, [B

    .line 129
    .line 130
    invoke-virtual {v3, v2}, LB1/b;->readFully([B)V

    .line 131
    .line 132
    .line 133
    sget-object v4, LB1/h;->M:[B

    .line 134
    .line 135
    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 136
    .line 137
    .line 138
    move-result v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 139
    const/4 v11, 0x1

    .line 140
    sget-object v12, LB1/h;->O:[B

    .line 141
    .line 142
    sget-object v13, LB1/h;->N:[B

    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    if-eqz v10, :cond_d

    .line 146
    .line 147
    :try_start_4
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    rem-int/lit8 v10, v2, 0x2

    .line 152
    .line 153
    if-ne v10, v11, :cond_4

    .line 154
    .line 155
    add-int/lit8 v10, v2, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    move v10, v2

    .line 159
    :goto_1
    new-array v10, v10, [B

    .line 160
    .line 161
    invoke-virtual {v3, v10}, LB1/b;->readFully([B)V

    .line 162
    .line 163
    .line 164
    aget-byte v15, v10, v14

    .line 165
    .line 166
    or-int/2addr v9, v15

    .line 167
    int-to-byte v9, v9

    .line 168
    aput-byte v9, v10, v14

    .line 169
    .line 170
    shr-int/2addr v9, v11

    .line 171
    and-int/2addr v9, v11

    .line 172
    if-ne v9, v11, :cond_5

    .line 173
    .line 174
    move v14, v11

    .line 175
    :cond_5
    invoke-virtual {v6, v4}, LB1/c;->write([B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6, v2}, LB1/c;->b(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6, v10}, LB1/c;->write([B)V

    .line 182
    .line 183
    .line 184
    if-eqz v14, :cond_a

    .line 185
    .line 186
    sget-object v2, LB1/h;->P:[B

    .line 187
    .line 188
    :goto_2
    new-array v4, v7, [B

    .line 189
    .line 190
    invoke-virtual {v3, v4}, LB1/b;->readFully([B)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    invoke-virtual {v6, v4}, LB1/c;->write([B)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v9}, LB1/c;->b(I)V

    .line 201
    .line 202
    .line 203
    rem-int/lit8 v10, v9, 0x2

    .line 204
    .line 205
    if-ne v10, v11, :cond_6

    .line 206
    .line 207
    add-int/lit8 v9, v9, 0x1

    .line 208
    .line 209
    :cond_6
    invoke-static {v3, v6, v9}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {v4, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-nez v4, :cond_7

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_7
    :goto_3
    new-array v2, v7, [B
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 220
    .line 221
    :try_start_5
    invoke-virtual {v3, v2}, LB1/b;->readFully([B)V

    .line 222
    .line 223
    .line 224
    sget-object v4, LB1/h;->Q:[B

    .line 225
    .line 226
    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 227
    .line 228
    .line 229
    move-result v4
    :try_end_5
    .catch Ljava/io/EOFException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 230
    xor-int/2addr v4, v11

    .line 231
    goto :goto_4

    .line 232
    :catch_1
    move v4, v11

    .line 233
    :goto_4
    if-eqz v4, :cond_8

    .line 234
    .line 235
    :try_start_6
    invoke-virtual {v1, v6}, LB1/h;->L(LB1/c;)V

    .line 236
    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_8
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    invoke-virtual {v6, v2}, LB1/c;->write([B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6, v4}, LB1/c;->b(I)V

    .line 247
    .line 248
    .line 249
    rem-int/lit8 v2, v4, 0x2

    .line 250
    .line 251
    if-ne v2, v11, :cond_9

    .line 252
    .line 253
    add-int/lit8 v4, v4, 0x1

    .line 254
    .line 255
    :cond_9
    invoke-static {v3, v6, v4}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_a
    new-array v2, v7, [B

    .line 260
    .line 261
    invoke-virtual {v3, v2}, LB1/b;->readFully([B)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    invoke-virtual {v6, v2}, LB1/c;->write([B)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6, v4}, LB1/c;->b(I)V

    .line 272
    .line 273
    .line 274
    rem-int/lit8 v9, v4, 0x2

    .line 275
    .line 276
    if-ne v9, v11, :cond_b

    .line 277
    .line 278
    add-int/lit8 v4, v4, 0x1

    .line 279
    .line 280
    :cond_b
    invoke-static {v3, v6, v4}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 281
    .line 282
    .line 283
    invoke-static {v2, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    if-nez v4, :cond_c

    .line 288
    .line 289
    if-eqz v13, :cond_a

    .line 290
    .line 291
    invoke-static {v2, v13}, Ljava/util/Arrays;->equals([B[B)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_a

    .line 296
    .line 297
    :cond_c
    invoke-virtual {v1, v6}, LB1/h;->L(LB1/c;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 298
    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_d
    :try_start_7
    invoke-static {v2, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 303
    .line 304
    .line 305
    move-result v10
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 306
    if-nez v10, :cond_e

    .line 307
    .line 308
    :try_start_8
    invoke-static {v2, v13}, Ljava/util/Arrays;->equals([B[B)Z

    .line 309
    .line 310
    .line 311
    move-result v10
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 312
    if-eqz v10, :cond_2

    .line 313
    .line 314
    :cond_e
    :try_start_9
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    rem-int/lit8 v15, v10, 0x2

    .line 319
    .line 320
    if-ne v15, v11, :cond_f

    .line 321
    .line 322
    add-int/lit8 v15, v10, 0x1

    .line 323
    .line 324
    :goto_5
    move/from16 p1, v7

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_f
    move v15, v10

    .line 328
    goto :goto_5

    .line 329
    :goto_6
    const/4 v7, 0x3

    .line 330
    move/from16 p2, v9

    .line 331
    .line 332
    new-array v9, v7, [B

    .line 333
    .line 334
    invoke-static {v2, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 335
    .line 336
    .line 337
    move-result v16
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 338
    move/from16 v17, v11

    .line 339
    .line 340
    const/16 v11, 0x2f

    .line 341
    .line 342
    move/from16 v18, v14

    .line 343
    .line 344
    sget-object v14, LB1/h;->L:[B

    .line 345
    .line 346
    if-eqz v16, :cond_11

    .line 347
    .line 348
    :try_start_a
    invoke-virtual {v3, v9}, LB1/b;->readFully([B)V

    .line 349
    .line 350
    .line 351
    new-array v7, v7, [B

    .line 352
    .line 353
    invoke-virtual {v3, v7}, LB1/b;->readFully([B)V

    .line 354
    .line 355
    .line 356
    invoke-static {v14, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_10

    .line 361
    .line 362
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    shl-int/lit8 v16, v7, 0x12

    .line 367
    .line 368
    shr-int/lit8 v16, v16, 0x12

    .line 369
    .line 370
    shl-int/lit8 v17, v7, 0x2

    .line 371
    .line 372
    shr-int/lit8 v17, v17, 0x12

    .line 373
    .line 374
    add-int/lit8 v15, v15, -0xa

    .line 375
    .line 376
    move/from16 v11, v16

    .line 377
    .line 378
    move/from16 v19, v17

    .line 379
    .line 380
    move/from16 v17, v18

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_10
    new-instance v0, Ljava/io/IOException;

    .line 384
    .line 385
    const-string v2, "Error checking VP8 signature"

    .line 386
    .line 387
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 391
    :cond_11
    :try_start_b
    invoke-static {v2, v13}, Ljava/util/Arrays;->equals([B[B)Z

    .line 392
    .line 393
    .line 394
    move-result v7
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 395
    if-eqz v7, :cond_14

    .line 396
    .line 397
    :try_start_c
    invoke-virtual {v3}, LB1/b;->readByte()B

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-ne v7, v11, :cond_13

    .line 402
    .line 403
    invoke-virtual {v3}, LB1/b;->readInt()I

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    and-int/lit16 v11, v7, 0x3fff

    .line 408
    .line 409
    add-int/lit8 v11, v11, 0x1

    .line 410
    .line 411
    const v19, 0xfffc000

    .line 412
    .line 413
    .line 414
    and-int v19, v7, v19

    .line 415
    .line 416
    ushr-int/lit8 v19, v19, 0xe

    .line 417
    .line 418
    add-int/lit8 v19, v19, 0x1

    .line 419
    .line 420
    const/high16 v20, 0x10000000

    .line 421
    .line 422
    and-int v20, v7, v20

    .line 423
    .line 424
    if-eqz v20, :cond_12

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_12
    move/from16 v17, v18

    .line 428
    .line 429
    :goto_7
    add-int/lit8 v15, v15, -0x5

    .line 430
    .line 431
    goto :goto_8

    .line 432
    :cond_13
    new-instance v0, Ljava/io/IOException;

    .line 433
    .line 434
    const-string v2, "Error checking VP8L signature"

    .line 435
    .line 436
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 440
    :cond_14
    move/from16 v7, v18

    .line 441
    .line 442
    move v11, v7

    .line 443
    move/from16 v17, v11

    .line 444
    .line 445
    move/from16 v19, v17

    .line 446
    .line 447
    :goto_8
    :try_start_d
    invoke-virtual {v6, v4}, LB1/c;->write([B)V

    .line 448
    .line 449
    .line 450
    const/16 v4, 0xa

    .line 451
    .line 452
    invoke-virtual {v6, v4}, LB1/c;->b(I)V

    .line 453
    .line 454
    .line 455
    new-array v4, v4, [B
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 456
    .line 457
    if-eqz v17, :cond_15

    .line 458
    .line 459
    :try_start_e
    aget-byte v17, v4, v18

    .line 460
    .line 461
    move/from16 v20, v11

    .line 462
    .line 463
    or-int/lit8 v11, v17, 0x10

    .line 464
    .line 465
    int-to-byte v11, v11

    .line 466
    aput-byte v11, v4, v18
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_15
    move/from16 v20, v11

    .line 470
    .line 471
    :goto_9
    :try_start_f
    aget-byte v11, v4, v18

    .line 472
    .line 473
    or-int/lit8 v11, v11, 0x8

    .line 474
    .line 475
    int-to-byte v11, v11

    .line 476
    aput-byte v11, v4, v18
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 477
    .line 478
    add-int/lit8 v11, v20, -0x1

    .line 479
    .line 480
    move-object/from16 v17, v8

    .line 481
    .line 482
    add-int/lit8 v8, v19, -0x1

    .line 483
    .line 484
    move-object/from16 v18, v0

    .line 485
    .line 486
    int-to-byte v0, v11

    .line 487
    :try_start_10
    aput-byte v0, v4, p1

    .line 488
    .line 489
    shr-int/lit8 v0, v11, 0x8

    .line 490
    .line 491
    int-to-byte v0, v0

    .line 492
    const/16 v19, 0x5

    .line 493
    .line 494
    aput-byte v0, v4, v19

    .line 495
    .line 496
    shr-int/lit8 v0, v11, 0x10

    .line 497
    .line 498
    int-to-byte v0, v0

    .line 499
    const/4 v11, 0x6

    .line 500
    aput-byte v0, v4, v11

    .line 501
    .line 502
    const/4 v0, 0x7

    .line 503
    int-to-byte v11, v8

    .line 504
    aput-byte v11, v4, v0

    .line 505
    .line 506
    shr-int/lit8 v0, v8, 0x8

    .line 507
    .line 508
    int-to-byte v0, v0

    .line 509
    aput-byte v0, v4, p2

    .line 510
    .line 511
    shr-int/lit8 v0, v8, 0x10

    .line 512
    .line 513
    int-to-byte v0, v0

    .line 514
    const/16 v8, 0x9

    .line 515
    .line 516
    aput-byte v0, v4, v8

    .line 517
    .line 518
    invoke-virtual {v6, v4}, LB1/c;->write([B)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v6, v2}, LB1/c;->write([B)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v6, v10}, LB1/c;->b(I)V

    .line 525
    .line 526
    .line 527
    invoke-static {v2, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 528
    .line 529
    .line 530
    move-result v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 531
    if-eqz v0, :cond_16

    .line 532
    .line 533
    :try_start_11
    invoke-virtual {v6, v9}, LB1/c;->write([B)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v6, v14}, LB1/c;->write([B)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v6, v7}, LB1/c;->b(I)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_2
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 540
    .line 541
    .line 542
    goto :goto_a

    .line 543
    :catchall_1
    move-exception v0

    .line 544
    move-object/from16 v6, v17

    .line 545
    .line 546
    goto :goto_f

    .line 547
    :catch_2
    move-exception v0

    .line 548
    move-object/from16 v6, v17

    .line 549
    .line 550
    goto :goto_e

    .line 551
    :cond_16
    :try_start_12
    invoke-static {v2, v13}, Ljava/util/Arrays;->equals([B[B)Z

    .line 552
    .line 553
    .line 554
    move-result v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 555
    if-eqz v0, :cond_17

    .line 556
    .line 557
    const/16 v0, 0x2f

    .line 558
    .line 559
    :try_start_13
    invoke-virtual {v6, v0}, Ljava/io/OutputStream;->write(I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v6, v7}, LB1/c;->b(I)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_2
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 563
    .line 564
    .line 565
    :cond_17
    :goto_a
    :try_start_14
    invoke-static {v3, v6, v15}, Lgc/b;->o(LB1/b;LB1/c;I)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1, v6}, LB1/h;->L(LB1/c;)V

    .line 569
    .line 570
    .line 571
    :goto_b
    invoke-static {v3, v6}, Lgc/b;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v17 .. v17}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    array-length v2, v5

    .line 579
    add-int/2addr v0, v2

    .line 580
    move-object/from16 v2, v18

    .line 581
    .line 582
    invoke-virtual {v2, v0}, LB1/c;->b(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v5}, LB1/c;->write([B)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_4
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 586
    .line 587
    .line 588
    move-object/from16 v3, v17

    .line 589
    .line 590
    :try_start_15
    invoke-virtual {v3, v2}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_3
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 591
    .line 592
    .line 593
    invoke-static {v3}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 594
    .line 595
    .line 596
    return-void

    .line 597
    :catchall_2
    move-exception v0

    .line 598
    :goto_c
    move-object v6, v3

    .line 599
    goto :goto_f

    .line 600
    :catch_3
    move-exception v0

    .line 601
    :goto_d
    move-object v6, v3

    .line 602
    goto :goto_e

    .line 603
    :catchall_3
    move-exception v0

    .line 604
    move-object/from16 v3, v17

    .line 605
    .line 606
    goto :goto_c

    .line 607
    :catch_4
    move-exception v0

    .line 608
    move-object/from16 v3, v17

    .line 609
    .line 610
    goto :goto_d

    .line 611
    :catchall_4
    move-exception v0

    .line 612
    move-object v3, v8

    .line 613
    goto :goto_c

    .line 614
    :catch_5
    move-exception v0

    .line 615
    move-object v3, v8

    .line 616
    goto :goto_d

    .line 617
    :catchall_5
    move-exception v0

    .line 618
    goto :goto_f

    .line 619
    :catch_6
    move-exception v0

    .line 620
    :goto_e
    :try_start_16
    new-instance v2, Ljava/io/IOException;

    .line 621
    .line 622
    const-string v3, "Failed to save WebP file"

    .line 623
    .line 624
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 625
    .line 626
    .line 627
    throw v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    .line 628
    :goto_f
    invoke-static {v6}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 629
    .line 630
    .line 631
    throw v0
.end method

.method public final G(Ljava/lang/String;Ljava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_1e

    .line 9
    .line 10
    const-string v5, "DateTime"

    .line 11
    .line 12
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    const-string v6, " : "

    .line 17
    .line 18
    const-string v7, "Invalid value for "

    .line 19
    .line 20
    const-string v8, "ExifInterface"

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    const-string v5, "DateTimeOriginal"

    .line 25
    .line 26
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    const-string v5, "DateTimeDigitized"

    .line 33
    .line 34
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_3

    .line 39
    .line 40
    :cond_0
    if-eqz v2, :cond_3

    .line 41
    .line 42
    sget-object v5, LB1/h;->f0:Ljava/util/regex/Pattern;

    .line 43
    .line 44
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    sget-object v9, LB1/h;->g0:Ljava/util/regex/Pattern;

    .line 53
    .line 54
    invoke-virtual {v9, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    const/16 v11, 0x13

    .line 67
    .line 68
    if-ne v10, v11, :cond_2

    .line 69
    .line 70
    if-nez v5, :cond_1

    .line 71
    .line 72
    if-nez v9, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    if-eqz v9, :cond_3

    .line 76
    .line 77
    const-string v5, "-"

    .line 78
    .line 79
    const-string v9, ":"

    .line 80
    .line 81
    invoke-virtual {v2, v5, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    :goto_1
    const-string v5, "ISOSpeedRatings"

    .line 109
    .line 110
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    sget-boolean v9, LB1/h;->t:Z

    .line 115
    .line 116
    if-eqz v5, :cond_5

    .line 117
    .line 118
    if-eqz v9, :cond_4

    .line 119
    .line 120
    const-string v1, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 121
    .line 122
    invoke-static {v8, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    :cond_4
    const-string v1, "PhotographicSensitivity"

    .line 126
    .line 127
    :cond_5
    const/4 v5, 0x2

    .line 128
    const-string v10, "/"

    .line 129
    .line 130
    if-eqz v2, :cond_8

    .line 131
    .line 132
    sget-object v11, LB1/h;->Z:Ljava/util/HashSet;

    .line 133
    .line 134
    invoke-virtual {v11, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-eqz v11, :cond_8

    .line 139
    .line 140
    const-string v11, "GPSTimeStamp"

    .line 141
    .line 142
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-eqz v11, :cond_7

    .line 147
    .line 148
    sget-object v11, LB1/h;->e0:Ljava/util/regex/Pattern;

    .line 149
    .line 150
    invoke-virtual {v11, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    if-nez v12, :cond_6

    .line 159
    .line 160
    new-instance v3, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v11, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v6, "/1,"

    .line 199
    .line 200
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v11, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const/4 v6, 0x3

    .line 218
    invoke-virtual {v11, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v6, "/1"

    .line 230
    .line 231
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    goto :goto_2

    .line 239
    :cond_7
    :try_start_0
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 240
    .line 241
    .line 242
    move-result-wide v11

    .line 243
    const-wide v13, 0x40c3880000000000L    # 10000.0

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    mul-double/2addr v11, v13

    .line 249
    double-to-long v11, v11

    .line 250
    new-instance v13, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-wide/16 v11, 0x2710

    .line 262
    .line 263
    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    goto :goto_2

    .line 271
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_8
    :goto_2
    const/4 v6, 0x0

    .line 294
    :goto_3
    sget-object v7, LB1/h;->V:[[LB1/e;

    .line 295
    .line 296
    array-length v7, v7

    .line 297
    if-ge v6, v7, :cond_1d

    .line 298
    .line 299
    const/4 v7, 0x4

    .line 300
    if-ne v6, v7, :cond_a

    .line 301
    .line 302
    iget-boolean v7, v0, LB1/h;->h:Z

    .line 303
    .line 304
    if-nez v7, :cond_a

    .line 305
    .line 306
    :cond_9
    :goto_4
    move v5, v4

    .line 307
    move/from16 v17, v6

    .line 308
    .line 309
    const/4 v15, 0x0

    .line 310
    goto/16 :goto_15

    .line 311
    .line 312
    :cond_a
    sget-object v7, LB1/h;->Y:[Ljava/util/HashMap;

    .line 313
    .line 314
    aget-object v7, v7, v6

    .line 315
    .line 316
    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    check-cast v7, LB1/e;

    .line 321
    .line 322
    if-eqz v7, :cond_9

    .line 323
    .line 324
    iget-object v11, v0, LB1/h;->e:[Ljava/util/HashMap;

    .line 325
    .line 326
    if-nez v2, :cond_b

    .line 327
    .line 328
    aget-object v7, v11, v6

    .line 329
    .line 330
    invoke-virtual {v7, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_b
    invoke-static {v2}, LB1/h;->r(Ljava/lang/String;)Landroid/util/Pair;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    iget-object v13, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v13, Ljava/lang/Integer;

    .line 341
    .line 342
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    const/4 v14, -0x1

    .line 347
    iget v15, v7, LB1/e;->c:I

    .line 348
    .line 349
    if-eq v15, v13, :cond_12

    .line 350
    .line 351
    iget-object v13, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v13, Ljava/lang/Integer;

    .line 354
    .line 355
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 356
    .line 357
    .line 358
    move-result v13

    .line 359
    if-ne v15, v13, :cond_c

    .line 360
    .line 361
    goto/16 :goto_8

    .line 362
    .line 363
    :cond_c
    iget v7, v7, LB1/e;->d:I

    .line 364
    .line 365
    if-eq v7, v14, :cond_e

    .line 366
    .line 367
    iget-object v13, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v13, Ljava/lang/Integer;

    .line 370
    .line 371
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v13

    .line 375
    if-eq v7, v13, :cond_d

    .line 376
    .line 377
    iget-object v13, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v13, Ljava/lang/Integer;

    .line 380
    .line 381
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    if-ne v7, v13, :cond_e

    .line 386
    .line 387
    :cond_d
    move v15, v7

    .line 388
    goto/16 :goto_8

    .line 389
    .line 390
    :cond_e
    if-eq v15, v4, :cond_12

    .line 391
    .line 392
    const/4 v13, 0x7

    .line 393
    if-eq v15, v13, :cond_12

    .line 394
    .line 395
    if-ne v15, v5, :cond_f

    .line 396
    .line 397
    goto/16 :goto_8

    .line 398
    .line 399
    :cond_f
    if-eqz v9, :cond_9

    .line 400
    .line 401
    const-string v11, "Given tag ("

    .line 402
    .line 403
    const-string v13, ") value didn\'t match with one of expected formats: "

    .line 404
    .line 405
    invoke-static {v11, v1, v13}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    sget-object v13, LB1/h;->R:[Ljava/lang/String;

    .line 410
    .line 411
    aget-object v15, v13, v15

    .line 412
    .line 413
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    const-string v15, ", "

    .line 417
    .line 418
    const-string v16, ""

    .line 419
    .line 420
    if-ne v7, v14, :cond_10

    .line 421
    .line 422
    move-object/from16 v5, v16

    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_10
    new-instance v5, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    aget-object v7, v13, v7

    .line 431
    .line 432
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    :goto_5
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    const-string v5, " (guess: "

    .line 443
    .line 444
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    iget-object v5, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v5, Ljava/lang/Integer;

    .line 450
    .line 451
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    aget-object v5, v13, v5

    .line 456
    .line 457
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    iget-object v5, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v5, Ljava/lang/Integer;

    .line 463
    .line 464
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    if-ne v5, v14, :cond_11

    .line 469
    .line 470
    :goto_6
    move-object/from16 v5, v16

    .line 471
    .line 472
    goto :goto_7

    .line 473
    :cond_11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 474
    .line 475
    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    iget-object v7, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v7, Ljava/lang/Integer;

    .line 481
    .line 482
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 483
    .line 484
    .line 485
    move-result v7

    .line 486
    aget-object v7, v13, v7

    .line 487
    .line 488
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v16

    .line 495
    goto :goto_6

    .line 496
    :goto_7
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    const-string v5, ")"

    .line 500
    .line 501
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    invoke-static {v8, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 509
    .line 510
    .line 511
    goto/16 :goto_4

    .line 512
    .line 513
    :cond_12
    :goto_8
    sget-object v5, LB1/h;->S:[I

    .line 514
    .line 515
    const-string v7, ","

    .line 516
    .line 517
    packed-switch v15, :pswitch_data_0

    .line 518
    .line 519
    .line 520
    :pswitch_0
    if-eqz v9, :cond_9

    .line 521
    .line 522
    new-instance v5, Ljava/lang/StringBuilder;

    .line 523
    .line 524
    const-string v7, "Data format isn\'t one of expected formats: "

    .line 525
    .line 526
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v5

    .line 536
    invoke-static {v8, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 537
    .line 538
    .line 539
    goto/16 :goto_4

    .line 540
    .line 541
    :pswitch_1
    invoke-virtual {v2, v7, v14}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v7

    .line 545
    array-length v12, v7

    .line 546
    new-array v13, v12, [D

    .line 547
    .line 548
    const/4 v14, 0x0

    .line 549
    :goto_9
    array-length v15, v7

    .line 550
    if-ge v14, v15, :cond_13

    .line 551
    .line 552
    aget-object v15, v7, v14

    .line 553
    .line 554
    invoke-static {v15}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 555
    .line 556
    .line 557
    move-result-wide v15

    .line 558
    aput-wide v15, v13, v14

    .line 559
    .line 560
    add-int/2addr v14, v4

    .line 561
    goto :goto_9

    .line 562
    :cond_13
    aget-object v7, v11, v6

    .line 563
    .line 564
    iget-object v11, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 565
    .line 566
    const/16 v14, 0xc

    .line 567
    .line 568
    aget v5, v5, v14

    .line 569
    .line 570
    mul-int/2addr v5, v12

    .line 571
    new-array v5, v5, [B

    .line 572
    .line 573
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    invoke-virtual {v5, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 578
    .line 579
    .line 580
    const/4 v11, 0x0

    .line 581
    :goto_a
    if-ge v11, v12, :cond_14

    .line 582
    .line 583
    move/from16 v16, v4

    .line 584
    .line 585
    const/4 v15, 0x0

    .line 586
    aget-wide v3, v13, v11

    .line 587
    .line 588
    invoke-virtual {v5, v3, v4}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 589
    .line 590
    .line 591
    add-int/lit8 v11, v11, 0x1

    .line 592
    .line 593
    move/from16 v4, v16

    .line 594
    .line 595
    goto :goto_a

    .line 596
    :cond_14
    move/from16 v16, v4

    .line 597
    .line 598
    const/4 v15, 0x0

    .line 599
    new-instance v3, LB1/d;

    .line 600
    .line 601
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-direct {v3, v14, v12, v4}, LB1/d;-><init>(II[B)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v7, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move/from16 v17, v6

    .line 612
    .line 613
    :goto_b
    move/from16 v5, v16

    .line 614
    .line 615
    goto/16 :goto_15

    .line 616
    .line 617
    :pswitch_2
    move/from16 v16, v4

    .line 618
    .line 619
    const/4 v15, 0x0

    .line 620
    invoke-virtual {v2, v7, v14}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    array-length v4, v3

    .line 625
    new-array v7, v4, [LB1/f;

    .line 626
    .line 627
    move v12, v15

    .line 628
    :goto_c
    array-length v13, v3

    .line 629
    if-ge v12, v13, :cond_15

    .line 630
    .line 631
    aget-object v13, v3, v12

    .line 632
    .line 633
    invoke-virtual {v13, v10, v14}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v13

    .line 637
    move/from16 p2, v15

    .line 638
    .line 639
    new-instance v15, LB1/f;

    .line 640
    .line 641
    aget-object v17, v13, p2

    .line 642
    .line 643
    move-object/from16 v18, v15

    .line 644
    .line 645
    invoke-static/range {v17 .. v17}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 646
    .line 647
    .line 648
    move-result-wide v14

    .line 649
    double-to-long v14, v14

    .line 650
    aget-object v13, v13, v16

    .line 651
    .line 652
    move-object/from16 v19, v5

    .line 653
    .line 654
    move/from16 v17, v6

    .line 655
    .line 656
    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 657
    .line 658
    .line 659
    move-result-wide v5

    .line 660
    double-to-long v5, v5

    .line 661
    move-object/from16 v13, v18

    .line 662
    .line 663
    invoke-direct {v13, v14, v15, v5, v6}, LB1/f;-><init>(JJ)V

    .line 664
    .line 665
    .line 666
    aput-object v13, v7, v12

    .line 667
    .line 668
    add-int/lit8 v12, v12, 0x1

    .line 669
    .line 670
    move/from16 v15, p2

    .line 671
    .line 672
    move/from16 v6, v17

    .line 673
    .line 674
    move-object/from16 v5, v19

    .line 675
    .line 676
    const/4 v14, -0x1

    .line 677
    goto :goto_c

    .line 678
    :cond_15
    move-object/from16 v19, v5

    .line 679
    .line 680
    move/from16 v17, v6

    .line 681
    .line 682
    move/from16 p2, v15

    .line 683
    .line 684
    aget-object v3, v11, v17

    .line 685
    .line 686
    iget-object v5, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 687
    .line 688
    const/16 v6, 0xa

    .line 689
    .line 690
    aget v11, v19, v6

    .line 691
    .line 692
    mul-int/2addr v11, v4

    .line 693
    new-array v11, v11, [B

    .line 694
    .line 695
    invoke-static {v11}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 696
    .line 697
    .line 698
    move-result-object v11

    .line 699
    invoke-virtual {v11, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 700
    .line 701
    .line 702
    move/from16 v5, p2

    .line 703
    .line 704
    :goto_d
    if-ge v5, v4, :cond_16

    .line 705
    .line 706
    aget-object v12, v7, v5

    .line 707
    .line 708
    iget-wide v13, v12, LB1/f;->a:J

    .line 709
    .line 710
    long-to-int v13, v13

    .line 711
    invoke-virtual {v11, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 712
    .line 713
    .line 714
    iget-wide v12, v12, LB1/f;->b:J

    .line 715
    .line 716
    long-to-int v12, v12

    .line 717
    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 718
    .line 719
    .line 720
    add-int/lit8 v5, v5, 0x1

    .line 721
    .line 722
    goto :goto_d

    .line 723
    :cond_16
    new-instance v5, LB1/d;

    .line 724
    .line 725
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->array()[B

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    invoke-direct {v5, v6, v4, v7}, LB1/d;-><init>(II[B)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v3, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    :goto_e
    move/from16 v15, p2

    .line 736
    .line 737
    goto :goto_b

    .line 738
    :pswitch_3
    move/from16 v16, v4

    .line 739
    .line 740
    move-object/from16 v19, v5

    .line 741
    .line 742
    move/from16 v17, v6

    .line 743
    .line 744
    move v3, v14

    .line 745
    const/16 p2, 0x0

    .line 746
    .line 747
    invoke-virtual {v2, v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    array-length v4, v3

    .line 752
    new-array v5, v4, [I

    .line 753
    .line 754
    move/from16 v6, p2

    .line 755
    .line 756
    :goto_f
    array-length v7, v3

    .line 757
    if-ge v6, v7, :cond_17

    .line 758
    .line 759
    aget-object v7, v3, v6

    .line 760
    .line 761
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 762
    .line 763
    .line 764
    move-result v7

    .line 765
    aput v7, v5, v6

    .line 766
    .line 767
    add-int/lit8 v6, v6, 0x1

    .line 768
    .line 769
    goto :goto_f

    .line 770
    :cond_17
    aget-object v3, v11, v17

    .line 771
    .line 772
    iget-object v6, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 773
    .line 774
    const/16 v7, 0x9

    .line 775
    .line 776
    aget v11, v19, v7

    .line 777
    .line 778
    mul-int/2addr v11, v4

    .line 779
    new-array v11, v11, [B

    .line 780
    .line 781
    invoke-static {v11}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 782
    .line 783
    .line 784
    move-result-object v11

    .line 785
    invoke-virtual {v11, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 786
    .line 787
    .line 788
    move/from16 v6, p2

    .line 789
    .line 790
    :goto_10
    if-ge v6, v4, :cond_18

    .line 791
    .line 792
    aget v12, v5, v6

    .line 793
    .line 794
    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 795
    .line 796
    .line 797
    add-int/lit8 v6, v6, 0x1

    .line 798
    .line 799
    goto :goto_10

    .line 800
    :cond_18
    new-instance v5, LB1/d;

    .line 801
    .line 802
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->array()[B

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    invoke-direct {v5, v7, v4, v6}, LB1/d;-><init>(II[B)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v3, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    goto :goto_e

    .line 813
    :pswitch_4
    move/from16 v16, v4

    .line 814
    .line 815
    move/from16 v17, v6

    .line 816
    .line 817
    move v3, v14

    .line 818
    const/16 p2, 0x0

    .line 819
    .line 820
    invoke-virtual {v2, v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    array-length v5, v4

    .line 825
    new-array v5, v5, [LB1/f;

    .line 826
    .line 827
    move/from16 v6, p2

    .line 828
    .line 829
    :goto_11
    array-length v7, v4

    .line 830
    if-ge v6, v7, :cond_19

    .line 831
    .line 832
    aget-object v7, v4, v6

    .line 833
    .line 834
    invoke-virtual {v7, v10, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    new-instance v3, LB1/f;

    .line 839
    .line 840
    aget-object v12, v7, p2

    .line 841
    .line 842
    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 843
    .line 844
    .line 845
    move-result-wide v12

    .line 846
    double-to-long v12, v12

    .line 847
    aget-object v7, v7, v16

    .line 848
    .line 849
    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 850
    .line 851
    .line 852
    move-result-wide v14

    .line 853
    double-to-long v14, v14

    .line 854
    invoke-direct {v3, v12, v13, v14, v15}, LB1/f;-><init>(JJ)V

    .line 855
    .line 856
    .line 857
    aput-object v3, v5, v6

    .line 858
    .line 859
    add-int/lit8 v6, v6, 0x1

    .line 860
    .line 861
    const/4 v3, -0x1

    .line 862
    goto :goto_11

    .line 863
    :cond_19
    aget-object v3, v11, v17

    .line 864
    .line 865
    iget-object v4, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 866
    .line 867
    invoke-static {v5, v4}, LB1/d;->d([LB1/f;Ljava/nio/ByteOrder;)LB1/d;

    .line 868
    .line 869
    .line 870
    move-result-object v4

    .line 871
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    goto/16 :goto_e

    .line 875
    .line 876
    :pswitch_5
    move/from16 v16, v4

    .line 877
    .line 878
    move/from16 v17, v6

    .line 879
    .line 880
    move v3, v14

    .line 881
    const/16 p2, 0x0

    .line 882
    .line 883
    invoke-virtual {v2, v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v3

    .line 887
    array-length v4, v3

    .line 888
    new-array v4, v4, [J

    .line 889
    .line 890
    move/from16 v5, p2

    .line 891
    .line 892
    :goto_12
    array-length v6, v3

    .line 893
    if-ge v5, v6, :cond_1a

    .line 894
    .line 895
    aget-object v6, v3, v5

    .line 896
    .line 897
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 898
    .line 899
    .line 900
    move-result-wide v6

    .line 901
    aput-wide v6, v4, v5

    .line 902
    .line 903
    add-int/lit8 v5, v5, 0x1

    .line 904
    .line 905
    goto :goto_12

    .line 906
    :cond_1a
    aget-object v3, v11, v17

    .line 907
    .line 908
    iget-object v5, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 909
    .line 910
    invoke-static {v4, v5}, LB1/d;->c([JLjava/nio/ByteOrder;)LB1/d;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    goto/16 :goto_e

    .line 918
    .line 919
    :pswitch_6
    move/from16 v16, v4

    .line 920
    .line 921
    move/from16 v17, v6

    .line 922
    .line 923
    move v3, v14

    .line 924
    const/16 p2, 0x0

    .line 925
    .line 926
    invoke-virtual {v2, v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v3

    .line 930
    array-length v4, v3

    .line 931
    new-array v4, v4, [I

    .line 932
    .line 933
    move/from16 v5, p2

    .line 934
    .line 935
    :goto_13
    array-length v6, v3

    .line 936
    if-ge v5, v6, :cond_1b

    .line 937
    .line 938
    aget-object v6, v3, v5

    .line 939
    .line 940
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 941
    .line 942
    .line 943
    move-result v6

    .line 944
    aput v6, v4, v5

    .line 945
    .line 946
    add-int/lit8 v5, v5, 0x1

    .line 947
    .line 948
    goto :goto_13

    .line 949
    :cond_1b
    aget-object v3, v11, v17

    .line 950
    .line 951
    iget-object v5, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 952
    .line 953
    invoke-static {v4, v5}, LB1/d;->f([ILjava/nio/ByteOrder;)LB1/d;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    goto/16 :goto_e

    .line 961
    .line 962
    :pswitch_7
    move/from16 v16, v4

    .line 963
    .line 964
    move/from16 v17, v6

    .line 965
    .line 966
    const/16 p2, 0x0

    .line 967
    .line 968
    aget-object v3, v11, v17

    .line 969
    .line 970
    invoke-static {v2}, LB1/d;->a(Ljava/lang/String;)LB1/d;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    goto/16 :goto_e

    .line 978
    .line 979
    :pswitch_8
    move/from16 v16, v4

    .line 980
    .line 981
    move/from16 v17, v6

    .line 982
    .line 983
    const/16 p2, 0x0

    .line 984
    .line 985
    aget-object v3, v11, v17

    .line 986
    .line 987
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 988
    .line 989
    .line 990
    move-result v4

    .line 991
    move/from16 v5, v16

    .line 992
    .line 993
    move/from16 v15, p2

    .line 994
    .line 995
    if-ne v4, v5, :cond_1c

    .line 996
    .line 997
    invoke-virtual {v2, v15}, Ljava/lang/String;->charAt(I)C

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    const/16 v6, 0x30

    .line 1002
    .line 1003
    if-lt v4, v6, :cond_1c

    .line 1004
    .line 1005
    invoke-virtual {v2, v15}, Ljava/lang/String;->charAt(I)C

    .line 1006
    .line 1007
    .line 1008
    move-result v4

    .line 1009
    const/16 v7, 0x31

    .line 1010
    .line 1011
    if-gt v4, v7, :cond_1c

    .line 1012
    .line 1013
    invoke-virtual {v2, v15}, Ljava/lang/String;->charAt(I)C

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    sub-int/2addr v4, v6

    .line 1018
    int-to-byte v4, v4

    .line 1019
    new-array v6, v5, [B

    .line 1020
    .line 1021
    aput-byte v4, v6, v15

    .line 1022
    .line 1023
    new-instance v4, LB1/d;

    .line 1024
    .line 1025
    invoke-direct {v4, v5, v5, v6}, LB1/d;-><init>(II[B)V

    .line 1026
    .line 1027
    .line 1028
    goto :goto_14

    .line 1029
    :cond_1c
    sget-object v4, LB1/h;->b0:Ljava/nio/charset/Charset;

    .line 1030
    .line 1031
    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1032
    .line 1033
    .line 1034
    move-result-object v4

    .line 1035
    new-instance v6, LB1/d;

    .line 1036
    .line 1037
    array-length v7, v4

    .line 1038
    invoke-direct {v6, v5, v7, v4}, LB1/d;-><init>(II[B)V

    .line 1039
    .line 1040
    .line 1041
    move-object v4, v6

    .line 1042
    :goto_14
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    :goto_15
    add-int/lit8 v6, v17, 0x1

    .line 1046
    .line 1047
    move v4, v5

    .line 1048
    const/4 v5, 0x2

    .line 1049
    goto/16 :goto_3

    .line 1050
    .line 1051
    :cond_1d
    return-void

    .line 1052
    :cond_1e
    new-instance v1, Ljava/lang/NullPointerException;

    .line 1053
    .line 1054
    const-string v2, "tag shouldn\'t be null"

    .line 1055
    .line 1056
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    throw v1

    .line 1060
    nop

    .line 1061
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final H(LB1/b;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LB1/h;->e:[Ljava/util/HashMap;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    aget-object v2, v2, v3

    .line 9
    .line 10
    const-string v3, "Compression"

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, LB1/d;

    .line 17
    .line 18
    const/4 v4, 0x6

    .line 19
    if-eqz v3, :cond_11

    .line 20
    .line 21
    iget-object v5, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v3, v5}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iput v3, v0, LB1/h;->n:I

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    if-eq v3, v5, :cond_1

    .line 31
    .line 32
    if-eq v3, v4, :cond_0

    .line 33
    .line 34
    const/4 v6, 0x7

    .line 35
    if-eq v3, v6, :cond_1

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0, v1, v2}, LB1/h;->s(LB1/b;Ljava/util/HashMap;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const-string v3, "BitsPerSample"

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, LB1/d;

    .line 50
    .line 51
    const-string v6, "ExifInterface"

    .line 52
    .line 53
    if-eqz v3, :cond_f

    .line 54
    .line 55
    iget-object v7, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 56
    .line 57
    invoke-virtual {v3, v7}, LB1/d;->j(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, [I

    .line 62
    .line 63
    sget-object v7, LB1/h;->w:[I

    .line 64
    .line 65
    invoke-static {v7, v3}, Ljava/util/Arrays;->equals([I[I)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    iget v8, v0, LB1/h;->d:I

    .line 73
    .line 74
    const/4 v9, 0x3

    .line 75
    if-ne v8, v9, :cond_f

    .line 76
    .line 77
    const-string v8, "PhotometricInterpretation"

    .line 78
    .line 79
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, LB1/d;

    .line 84
    .line 85
    if-eqz v8, :cond_f

    .line 86
    .line 87
    iget-object v9, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    invoke-virtual {v8, v9}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-ne v8, v5, :cond_3

    .line 94
    .line 95
    sget-object v9, LB1/h;->x:[I

    .line 96
    .line 97
    invoke-static {v3, v9}, Ljava/util/Arrays;->equals([I[I)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_4

    .line 102
    .line 103
    :cond_3
    if-ne v8, v4, :cond_f

    .line 104
    .line 105
    invoke-static {v3, v7}, Ljava/util/Arrays;->equals([I[I)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_f

    .line 110
    .line 111
    :cond_4
    :goto_0
    const-string v3, " bytes."

    .line 112
    .line 113
    const-string v4, "StripOffsets"

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, LB1/d;

    .line 120
    .line 121
    const-string v7, "StripByteCounts"

    .line 122
    .line 123
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, LB1/d;

    .line 128
    .line 129
    if-eqz v4, :cond_10

    .line 130
    .line 131
    if-eqz v2, :cond_10

    .line 132
    .line 133
    iget-object v7, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 134
    .line 135
    invoke-virtual {v4, v7}, LB1/d;->j(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4}, Lgc/b;->n(Ljava/io/Serializable;)[J

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    iget-object v7, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 144
    .line 145
    invoke-virtual {v2, v7}, LB1/d;->j(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v2}, Lgc/b;->n(Ljava/io/Serializable;)[J

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-eqz v4, :cond_5

    .line 154
    .line 155
    array-length v7, v4

    .line 156
    if-nez v7, :cond_6

    .line 157
    .line 158
    :cond_5
    move-object v5, v6

    .line 159
    goto/16 :goto_5

    .line 160
    .line 161
    :cond_6
    if-eqz v2, :cond_7

    .line 162
    .line 163
    array-length v7, v2

    .line 164
    if-nez v7, :cond_8

    .line 165
    .line 166
    :cond_7
    move-object v5, v6

    .line 167
    goto/16 :goto_4

    .line 168
    .line 169
    :cond_8
    array-length v7, v4

    .line 170
    array-length v8, v2

    .line 171
    if-eq v7, v8, :cond_9

    .line 172
    .line 173
    const-string v1, "stripOffsets and stripByteCounts should have same length."

    .line 174
    .line 175
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    goto/16 :goto_6

    .line 179
    .line 180
    :cond_9
    array-length v7, v2

    .line 181
    const/4 v8, 0x0

    .line 182
    const-wide/16 v9, 0x0

    .line 183
    .line 184
    move v11, v8

    .line 185
    :goto_1
    if-ge v11, v7, :cond_a

    .line 186
    .line 187
    aget-wide v12, v2, v11

    .line 188
    .line 189
    add-long/2addr v9, v12

    .line 190
    add-int/lit8 v11, v11, 0x1

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_a
    long-to-int v7, v9

    .line 194
    new-array v9, v7, [B

    .line 195
    .line 196
    iput-boolean v5, v0, LB1/h;->j:Z

    .line 197
    .line 198
    iput-boolean v5, v0, LB1/h;->i:Z

    .line 199
    .line 200
    iput-boolean v5, v0, LB1/h;->h:Z

    .line 201
    .line 202
    move v10, v8

    .line 203
    move v11, v10

    .line 204
    move v12, v11

    .line 205
    :goto_2
    array-length v13, v4

    .line 206
    if-ge v10, v13, :cond_e

    .line 207
    .line 208
    aget-wide v13, v4, v10

    .line 209
    .line 210
    long-to-int v13, v13

    .line 211
    aget-wide v14, v2, v10

    .line 212
    .line 213
    long-to-int v14, v14

    .line 214
    array-length v15, v4

    .line 215
    sub-int/2addr v15, v5

    .line 216
    if-ge v10, v15, :cond_b

    .line 217
    .line 218
    add-int v15, v13, v14

    .line 219
    .line 220
    move-object/from16 v16, v6

    .line 221
    .line 222
    int-to-long v5, v15

    .line 223
    add-int/lit8 v15, v10, 0x1

    .line 224
    .line 225
    aget-wide v17, v4, v15

    .line 226
    .line 227
    cmp-long v5, v5, v17

    .line 228
    .line 229
    if-eqz v5, :cond_c

    .line 230
    .line 231
    iput-boolean v8, v0, LB1/h;->j:Z

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_b
    move-object/from16 v16, v6

    .line 235
    .line 236
    :cond_c
    :goto_3
    sub-int/2addr v13, v11

    .line 237
    if-gez v13, :cond_d

    .line 238
    .line 239
    const-string v1, "Invalid strip offset value"

    .line 240
    .line 241
    move-object/from16 v5, v16

    .line 242
    .line 243
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_d
    move-object/from16 v5, v16

    .line 248
    .line 249
    :try_start_0
    invoke-virtual {v1, v13}, LB1/b;->a(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    .line 250
    .line 251
    .line 252
    add-int/2addr v11, v13

    .line 253
    new-array v6, v14, [B

    .line 254
    .line 255
    :try_start_1
    invoke-virtual {v1, v6}, LB1/b;->readFully([B)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 256
    .line 257
    .line 258
    add-int/2addr v11, v14

    .line 259
    invoke-static {v6, v8, v9, v12, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 260
    .line 261
    .line 262
    add-int/2addr v12, v14

    .line 263
    add-int/lit8 v10, v10, 0x1

    .line 264
    .line 265
    move-object v6, v5

    .line 266
    const/4 v5, 0x1

    .line 267
    goto :goto_2

    .line 268
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v2, "Failed to read "

    .line 271
    .line 272
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    const-string v2, "Failed to skip "

    .line 292
    .line 293
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_e
    iput-object v9, v0, LB1/h;->m:[B

    .line 311
    .line 312
    iget-boolean v1, v0, LB1/h;->j:Z

    .line 313
    .line 314
    if-eqz v1, :cond_10

    .line 315
    .line 316
    aget-wide v1, v4, v8

    .line 317
    .line 318
    long-to-int v1, v1

    .line 319
    iput v1, v0, LB1/h;->k:I

    .line 320
    .line 321
    iput v7, v0, LB1/h;->l:I

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :goto_4
    const-string v1, "stripByteCounts should not be null or have zero length."

    .line 325
    .line 326
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    .line 328
    .line 329
    goto :goto_6

    .line 330
    :goto_5
    const-string v1, "stripOffsets should not be null or have zero length."

    .line 331
    .line 332
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_f
    move-object v5, v6

    .line 337
    sget-boolean v1, LB1/h;->t:Z

    .line 338
    .line 339
    if-eqz v1, :cond_10

    .line 340
    .line 341
    const-string v1, "Unsupported data type value"

    .line 342
    .line 343
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    .line 345
    .line 346
    :cond_10
    :goto_6
    return-void

    .line 347
    :cond_11
    iput v4, v0, LB1/h;->n:I

    .line 348
    .line 349
    invoke-virtual {v0, v1, v2}, LB1/h;->s(LB1/b;Ljava/util/HashMap;)V

    .line 350
    .line 351
    .line 352
    return-void
.end method

.method public final I(II)V
    .locals 8

    .line 1
    iget-object v0, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "ExifInterface"

    .line 10
    .line 11
    sget-boolean v3, LB1/h;->t:Z

    .line 12
    .line 13
    if-nez v1, :cond_5

    .line 14
    .line 15
    aget-object v1, v0, p2

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    aget-object v1, v0, p1

    .line 25
    .line 26
    const-string v4, "ImageLength"

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, LB1/d;

    .line 33
    .line 34
    aget-object v5, v0, p1

    .line 35
    .line 36
    const-string v6, "ImageWidth"

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, LB1/d;

    .line 43
    .line 44
    aget-object v7, v0, p2

    .line 45
    .line 46
    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, LB1/d;

    .line 51
    .line 52
    aget-object v7, v0, p2

    .line 53
    .line 54
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, LB1/d;

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    if-eqz v4, :cond_3

    .line 66
    .line 67
    if-nez v6, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object v2, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v2, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 77
    .line 78
    invoke-virtual {v5, v2}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget-object v3, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 83
    .line 84
    invoke-virtual {v4, v3}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iget-object v4, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 89
    .line 90
    invoke-virtual {v6, v4}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ge v1, v3, :cond_6

    .line 95
    .line 96
    if-ge v2, v4, :cond_6

    .line 97
    .line 98
    aget-object v1, v0, p1

    .line 99
    .line 100
    aget-object v2, v0, p2

    .line 101
    .line 102
    aput-object v2, v0, p1

    .line 103
    .line 104
    aput-object v1, v0, p2

    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    :goto_0
    if-eqz v3, :cond_6

    .line 108
    .line 109
    const-string p1, "Second image does not contain valid size information"

    .line 110
    .line 111
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    :goto_1
    if-eqz v3, :cond_6

    .line 116
    .line 117
    const-string p1, "First image does not contain valid size information"

    .line 118
    .line 119
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_5
    :goto_2
    if-eqz v3, :cond_6

    .line 124
    .line 125
    const-string p1, "Cannot perform swap since only one image data exists"

    .line 126
    .line 127
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_6
    return-void
.end method

.method public final J(LB1/g;I)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 4
    .line 5
    aget-object v3, v2, p2

    .line 6
    .line 7
    const-string v4, "DefaultCropSize"

    .line 8
    .line 9
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, LB1/d;

    .line 14
    .line 15
    aget-object v4, v2, p2

    .line 16
    .line 17
    const-string v5, "SensorTopBorder"

    .line 18
    .line 19
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, LB1/d;

    .line 24
    .line 25
    aget-object v5, v2, p2

    .line 26
    .line 27
    const-string v6, "SensorLeftBorder"

    .line 28
    .line 29
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, LB1/d;

    .line 34
    .line 35
    aget-object v6, v2, p2

    .line 36
    .line 37
    const-string v7, "SensorBottomBorder"

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, LB1/d;

    .line 44
    .line 45
    aget-object v7, v2, p2

    .line 46
    .line 47
    const-string v8, "SensorRightBorder"

    .line 48
    .line 49
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, LB1/d;

    .line 54
    .line 55
    const-string v8, "ImageLength"

    .line 56
    .line 57
    const-string v9, "ImageWidth"

    .line 58
    .line 59
    if-eqz v3, :cond_5

    .line 60
    .line 61
    iget p1, v3, LB1/d;->a:I

    .line 62
    .line 63
    const/4 v4, 0x5

    .line 64
    const-string v5, "Invalid crop size values. cropSize="

    .line 65
    .line 66
    const-string v6, "ExifInterface"

    .line 67
    .line 68
    const/4 v7, 0x2

    .line 69
    if-ne p1, v4, :cond_2

    .line 70
    .line 71
    iget-object p1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 72
    .line 73
    invoke-virtual {v3, p1}, LB1/d;->j(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, [LB1/f;

    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    array-length v3, p1

    .line 82
    if-eq v3, v7, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    aget-object v3, p1, v0

    .line 86
    .line 87
    iget-object v4, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    new-array v5, v1, [LB1/f;

    .line 90
    .line 91
    aput-object v3, v5, v0

    .line 92
    .line 93
    invoke-static {v5, v4}, LB1/d;->d([LB1/f;Ljava/nio/ByteOrder;)LB1/d;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    aget-object p1, p1, v1

    .line 98
    .line 99
    iget-object v4, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 100
    .line 101
    new-array v1, v1, [LB1/f;

    .line 102
    .line 103
    aput-object p1, v1, v0

    .line 104
    .line 105
    invoke-static {v1, v4}, LB1/d;->d([LB1/f;Ljava/nio/ByteOrder;)LB1/d;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_1

    .line 110
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_2
    iget-object p1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 131
    .line 132
    invoke-virtual {v3, p1}, LB1/d;->j(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, [I

    .line 137
    .line 138
    if-eqz p1, :cond_4

    .line 139
    .line 140
    array-length v3, p1

    .line 141
    if-eq v3, v7, :cond_3

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    aget v0, p1, v0

    .line 145
    .line 146
    iget-object v3, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 147
    .line 148
    invoke-static {v0, v3}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    aget p1, p1, v1

    .line 153
    .line 154
    iget-object v0, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 155
    .line 156
    invoke-static {p1, v0}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :goto_1
    aget-object v0, v2, p2

    .line 161
    .line 162
    invoke-virtual {v0, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    aget-object p2, v2, p2

    .line 166
    .line 167
    invoke-virtual {p2, v8, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_5
    if-eqz v4, :cond_6

    .line 192
    .line 193
    if-eqz v5, :cond_6

    .line 194
    .line 195
    if-eqz v6, :cond_6

    .line 196
    .line 197
    if-eqz v7, :cond_6

    .line 198
    .line 199
    iget-object p1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 200
    .line 201
    invoke-virtual {v4, p1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    iget-object v0, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 206
    .line 207
    invoke-virtual {v6, v0}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 212
    .line 213
    invoke-virtual {v7, v1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    iget-object v3, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 218
    .line 219
    invoke-virtual {v5, v3}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-le v0, p1, :cond_8

    .line 224
    .line 225
    if-le v1, v3, :cond_8

    .line 226
    .line 227
    sub-int/2addr v0, p1

    .line 228
    sub-int/2addr v1, v3

    .line 229
    iget-object p1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 230
    .line 231
    invoke-static {v0, p1}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    iget-object v0, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 236
    .line 237
    invoke-static {v1, v0}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    aget-object v1, v2, p2

    .line 242
    .line 243
    invoke-virtual {v1, v8, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    aget-object p1, v2, p2

    .line 247
    .line 248
    invoke-virtual {p1, v9, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_6
    aget-object v0, v2, p2

    .line 253
    .line 254
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, LB1/d;

    .line 259
    .line 260
    aget-object v1, v2, p2

    .line 261
    .line 262
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, LB1/d;

    .line 267
    .line 268
    if-eqz v0, :cond_7

    .line 269
    .line 270
    if-nez v1, :cond_8

    .line 271
    .line 272
    :cond_7
    aget-object v0, v2, p2

    .line 273
    .line 274
    const-string v1, "JPEGInterchangeFormat"

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, LB1/d;

    .line 281
    .line 282
    aget-object v1, v2, p2

    .line 283
    .line 284
    const-string v2, "JPEGInterchangeFormatLength"

    .line 285
    .line 286
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, LB1/d;

    .line 291
    .line 292
    if-eqz v0, :cond_8

    .line 293
    .line 294
    if-eqz v1, :cond_8

    .line 295
    .line 296
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 297
    .line 298
    invoke-virtual {v0, v1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    iget-object v2, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 303
    .line 304
    invoke-virtual {v0, v2}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    int-to-long v2, v1

    .line 309
    invoke-virtual {p1, v2, v3}, LB1/g;->b(J)V

    .line 310
    .line 311
    .line 312
    new-array v0, v0, [B

    .line 313
    .line 314
    invoke-virtual {p1, v0}, LB1/b;->readFully([B)V

    .line 315
    .line 316
    .line 317
    new-instance p1, LB1/b;

    .line 318
    .line 319
    invoke-direct {p1, v0}, LB1/b;-><init>([B)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, p1, v1, p2}, LB1/h;->h(LB1/b;II)V

    .line 323
    .line 324
    .line 325
    :cond_8
    return-void
.end method

.method public final K()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x5

    .line 3
    invoke-virtual {p0, v0, v1}, LB1/h;->I(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-virtual {p0, v0, v2}, LB1/h;->I(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, LB1/h;->I(II)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget-object v5, v3, v4

    .line 17
    .line 18
    const-string v6, "PixelXDimension"

    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, LB1/d;

    .line 25
    .line 26
    aget-object v4, v3, v4

    .line 27
    .line 28
    const-string v6, "PixelYDimension"

    .line 29
    .line 30
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, LB1/d;

    .line 35
    .line 36
    const-string v6, "ImageLength"

    .line 37
    .line 38
    const-string v7, "ImageWidth"

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    aget-object v8, v3, v0

    .line 45
    .line 46
    invoke-virtual {v8, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    aget-object v5, v3, v0

    .line 50
    .line 51
    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_0
    aget-object v4, v3, v2

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    aget-object v4, v3, v1

    .line 63
    .line 64
    invoke-virtual {p0, v4}, LB1/h;->t(Ljava/util/HashMap;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    aget-object v4, v3, v1

    .line 71
    .line 72
    aput-object v4, v3, v2

    .line 73
    .line 74
    new-instance v4, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    aput-object v4, v3, v1

    .line 80
    .line 81
    :cond_1
    aget-object v3, v3, v2

    .line 82
    .line 83
    invoke-virtual {p0, v3}, LB1/h;->t(Ljava/util/HashMap;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    const-string v3, "ExifInterface"

    .line 90
    .line 91
    const-string v4, "No image meets the size requirements of a thumbnail image."

    .line 92
    .line 93
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    :cond_2
    const-string v3, "ThumbnailOrientation"

    .line 97
    .line 98
    const-string v4, "Orientation"

    .line 99
    .line 100
    invoke-virtual {p0, v0, v3, v4}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v5, "ThumbnailImageLength"

    .line 104
    .line 105
    invoke-virtual {p0, v0, v5, v6}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v8, "ThumbnailImageWidth"

    .line 109
    .line 110
    invoke-virtual {p0, v0, v8, v7}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1, v3, v4}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1, v5, v6}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1, v8, v7}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v2, v4, v3}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v2, v6, v5}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v2, v7, v8}, LB1/h;->B(ILjava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final L(LB1/c;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v6, 0x1

    .line 6
    sget-object v7, LB1/h;->V:[[LB1/e;

    .line 7
    .line 8
    array-length v8, v7

    .line 9
    new-array v8, v8, [I

    .line 10
    .line 11
    array-length v9, v7

    .line 12
    new-array v9, v9, [I

    .line 13
    .line 14
    sget-object v10, LB1/h;->W:[LB1/e;

    .line 15
    .line 16
    array-length v11, v10

    .line 17
    const/4 v13, 0x0

    .line 18
    :goto_0
    if-ge v13, v11, :cond_0

    .line 19
    .line 20
    aget-object v14, v10, v13

    .line 21
    .line 22
    iget-object v14, v14, LB1/e;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v14}, LB1/h;->A(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    add-int/2addr v13, v6

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-boolean v11, v0, LB1/h;->h:Z

    .line 30
    .line 31
    const-string v13, "JPEGInterchangeFormatLength"

    .line 32
    .line 33
    const-string v14, "StripByteCounts"

    .line 34
    .line 35
    const-string v15, "JPEGInterchangeFormat"

    .line 36
    .line 37
    const/16 v16, 0x8

    .line 38
    .line 39
    const-string v2, "StripOffsets"

    .line 40
    .line 41
    if-eqz v11, :cond_2

    .line 42
    .line 43
    iget-boolean v11, v0, LB1/h;->i:Z

    .line 44
    .line 45
    if-eqz v11, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v2}, LB1/h;->A(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v14}, LB1/h;->A(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {v0, v15}, LB1/h;->A(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v13}, LB1/h;->A(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_1
    const/4 v11, 0x0

    .line 61
    const/16 v17, 0x3

    .line 62
    .line 63
    :goto_2
    array-length v4, v7

    .line 64
    const/16 v18, 0x2

    .line 65
    .line 66
    iget-object v5, v0, LB1/h;->e:[Ljava/util/HashMap;

    .line 67
    .line 68
    if-ge v11, v4, :cond_5

    .line 69
    .line 70
    aget-object v4, v5, v11

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-interface {v4}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    move/from16 v19, v6

    .line 81
    .line 82
    array-length v6, v4

    .line 83
    const/4 v3, 0x0

    .line 84
    const/16 v20, 0x4

    .line 85
    .line 86
    :goto_3
    if-ge v3, v6, :cond_4

    .line 87
    .line 88
    aget-object v21, v4, v3

    .line 89
    .line 90
    check-cast v21, Ljava/util/Map$Entry;

    .line 91
    .line 92
    invoke-interface/range {v21 .. v21}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v22

    .line 96
    if-nez v22, :cond_3

    .line 97
    .line 98
    const/16 v22, 0x0

    .line 99
    .line 100
    aget-object v12, v5, v11

    .line 101
    .line 102
    move/from16 v23, v3

    .line 103
    .line 104
    invoke-interface/range {v21 .. v21}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v12, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_3
    move/from16 v23, v3

    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    :goto_4
    add-int/lit8 v3, v23, 0x1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    const/16 v22, 0x0

    .line 120
    .line 121
    add-int/lit8 v11, v11, 0x1

    .line 122
    .line 123
    move/from16 v6, v19

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    move/from16 v19, v6

    .line 127
    .line 128
    const/16 v20, 0x4

    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    aget-object v3, v5, v19

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    const-wide/16 v11, 0x0

    .line 139
    .line 140
    if-nez v3, :cond_6

    .line 141
    .line 142
    aget-object v3, v5, v22

    .line 143
    .line 144
    aget-object v4, v10, v19

    .line 145
    .line 146
    iget-object v4, v4, LB1/e;->b:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v6, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 149
    .line 150
    invoke-static {v11, v12, v6}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v3, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :cond_6
    aget-object v3, v5, v18

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_7

    .line 164
    .line 165
    aget-object v3, v5, v22

    .line 166
    .line 167
    aget-object v4, v10, v18

    .line 168
    .line 169
    iget-object v4, v4, LB1/e;->b:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v6, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 172
    .line 173
    invoke-static {v11, v12, v6}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {v3, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    :cond_7
    aget-object v3, v5, v17

    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-nez v3, :cond_8

    .line 187
    .line 188
    aget-object v3, v5, v19

    .line 189
    .line 190
    aget-object v4, v10, v17

    .line 191
    .line 192
    iget-object v4, v4, LB1/e;->b:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v6, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 195
    .line 196
    invoke-static {v11, v12, v6}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-virtual {v3, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    :cond_8
    iget-boolean v3, v0, LB1/h;->h:Z

    .line 204
    .line 205
    if-eqz v3, :cond_a

    .line 206
    .line 207
    iget-boolean v3, v0, LB1/h;->i:Z

    .line 208
    .line 209
    if-eqz v3, :cond_9

    .line 210
    .line 211
    aget-object v3, v5, v20

    .line 212
    .line 213
    iget-object v4, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 214
    .line 215
    move/from16 v6, v22

    .line 216
    .line 217
    invoke-static {v6, v4}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    aget-object v3, v5, v20

    .line 225
    .line 226
    iget v4, v0, LB1/h;->l:I

    .line 227
    .line 228
    iget-object v6, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 229
    .line 230
    invoke-static {v4, v6}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v3, v14, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_9
    aget-object v3, v5, v20

    .line 239
    .line 240
    iget-object v4, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 241
    .line 242
    invoke-static {v11, v12, v4}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-virtual {v3, v15, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    aget-object v3, v5, v20

    .line 250
    .line 251
    iget v4, v0, LB1/h;->l:I

    .line 252
    .line 253
    int-to-long v11, v4

    .line 254
    iget-object v4, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 255
    .line 256
    invoke-static {v11, v12, v4}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v3, v13, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    :cond_a
    :goto_5
    const/4 v3, 0x0

    .line 264
    :goto_6
    array-length v4, v7

    .line 265
    sget-object v6, LB1/h;->S:[I

    .line 266
    .line 267
    if-ge v3, v4, :cond_d

    .line 268
    .line 269
    aget-object v4, v5, v3

    .line 270
    .line 271
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    const/4 v11, 0x0

    .line 280
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v12

    .line 284
    if-eqz v12, :cond_c

    .line 285
    .line 286
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    check-cast v12, Ljava/util/Map$Entry;

    .line 291
    .line 292
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    check-cast v12, LB1/d;

    .line 297
    .line 298
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget v13, v12, LB1/d;->a:I

    .line 302
    .line 303
    aget v13, v6, v13

    .line 304
    .line 305
    iget v12, v12, LB1/d;->b:I

    .line 306
    .line 307
    mul-int/2addr v13, v12

    .line 308
    move/from16 v12, v20

    .line 309
    .line 310
    if-le v13, v12, :cond_b

    .line 311
    .line 312
    add-int/2addr v11, v13

    .line 313
    :cond_b
    const/16 v20, 0x4

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_c
    aget v4, v9, v3

    .line 317
    .line 318
    add-int/2addr v4, v11

    .line 319
    aput v4, v9, v3

    .line 320
    .line 321
    add-int/lit8 v3, v3, 0x1

    .line 322
    .line 323
    const/16 v20, 0x4

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_d
    move/from16 v4, v16

    .line 327
    .line 328
    const/4 v3, 0x0

    .line 329
    :goto_8
    array-length v11, v7

    .line 330
    if-ge v3, v11, :cond_f

    .line 331
    .line 332
    aget-object v11, v5, v3

    .line 333
    .line 334
    invoke-virtual {v11}, Ljava/util/HashMap;->isEmpty()Z

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-nez v11, :cond_e

    .line 339
    .line 340
    aput v4, v8, v3

    .line 341
    .line 342
    aget-object v11, v5, v3

    .line 343
    .line 344
    invoke-virtual {v11}, Ljava/util/HashMap;->size()I

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    mul-int/lit8 v11, v11, 0xc

    .line 349
    .line 350
    add-int/lit8 v11, v11, 0x6

    .line 351
    .line 352
    aget v12, v9, v3

    .line 353
    .line 354
    add-int/2addr v11, v12

    .line 355
    add-int/2addr v4, v11

    .line 356
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_f
    iget-boolean v3, v0, LB1/h;->h:Z

    .line 360
    .line 361
    if-eqz v3, :cond_11

    .line 362
    .line 363
    iget-boolean v3, v0, LB1/h;->i:Z

    .line 364
    .line 365
    if-eqz v3, :cond_10

    .line 366
    .line 367
    const/16 v20, 0x4

    .line 368
    .line 369
    aget-object v3, v5, v20

    .line 370
    .line 371
    iget-object v11, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 372
    .line 373
    invoke-static {v4, v11}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    invoke-virtual {v3, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_10
    const/16 v20, 0x4

    .line 382
    .line 383
    aget-object v2, v5, v20

    .line 384
    .line 385
    int-to-long v11, v4

    .line 386
    iget-object v3, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 387
    .line 388
    invoke-static {v11, v12, v3}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-virtual {v2, v15, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    :goto_9
    iput v4, v0, LB1/h;->k:I

    .line 396
    .line 397
    iget v2, v0, LB1/h;->l:I

    .line 398
    .line 399
    add-int/2addr v4, v2

    .line 400
    :cond_11
    iget v2, v0, LB1/h;->d:I

    .line 401
    .line 402
    const/4 v12, 0x4

    .line 403
    if-ne v2, v12, :cond_12

    .line 404
    .line 405
    add-int/lit8 v4, v4, 0x8

    .line 406
    .line 407
    :cond_12
    sget-boolean v2, LB1/h;->t:Z

    .line 408
    .line 409
    if-eqz v2, :cond_13

    .line 410
    .line 411
    const/4 v2, 0x0

    .line 412
    :goto_a
    array-length v3, v7

    .line 413
    if-ge v2, v3, :cond_13

    .line 414
    .line 415
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    aget v11, v8, v2

    .line 420
    .line 421
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    aget-object v12, v5, v2

    .line 426
    .line 427
    invoke-virtual {v12}, Ljava/util/HashMap;->size()I

    .line 428
    .line 429
    .line 430
    move-result v12

    .line 431
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    aget v13, v9, v2

    .line 436
    .line 437
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v13

    .line 441
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v14

    .line 445
    const/4 v15, 0x5

    .line 446
    new-array v15, v15, [Ljava/lang/Object;

    .line 447
    .line 448
    const/16 v22, 0x0

    .line 449
    .line 450
    aput-object v3, v15, v22

    .line 451
    .line 452
    aput-object v11, v15, v19

    .line 453
    .line 454
    aput-object v12, v15, v18

    .line 455
    .line 456
    aput-object v13, v15, v17

    .line 457
    .line 458
    const/16 v20, 0x4

    .line 459
    .line 460
    aput-object v14, v15, v20

    .line 461
    .line 462
    const-string v3, "index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d"

    .line 463
    .line 464
    invoke-static {v3, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    const-string v11, "ExifInterface"

    .line 469
    .line 470
    invoke-static {v11, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 471
    .line 472
    .line 473
    add-int/lit8 v2, v2, 0x1

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_13
    aget-object v2, v5, v19

    .line 477
    .line 478
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-nez v2, :cond_14

    .line 483
    .line 484
    const/16 v22, 0x0

    .line 485
    .line 486
    aget-object v2, v5, v22

    .line 487
    .line 488
    aget-object v3, v10, v19

    .line 489
    .line 490
    iget-object v3, v3, LB1/e;->b:Ljava/lang/String;

    .line 491
    .line 492
    aget v9, v8, v19

    .line 493
    .line 494
    int-to-long v11, v9

    .line 495
    iget-object v9, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 496
    .line 497
    invoke-static {v11, v12, v9}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    invoke-virtual {v2, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    :cond_14
    aget-object v2, v5, v18

    .line 505
    .line 506
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-nez v2, :cond_15

    .line 511
    .line 512
    const/16 v22, 0x0

    .line 513
    .line 514
    aget-object v2, v5, v22

    .line 515
    .line 516
    aget-object v3, v10, v18

    .line 517
    .line 518
    iget-object v3, v3, LB1/e;->b:Ljava/lang/String;

    .line 519
    .line 520
    aget v9, v8, v18

    .line 521
    .line 522
    int-to-long v11, v9

    .line 523
    iget-object v9, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 524
    .line 525
    invoke-static {v11, v12, v9}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 526
    .line 527
    .line 528
    move-result-object v9

    .line 529
    invoke-virtual {v2, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    :cond_15
    aget-object v2, v5, v17

    .line 533
    .line 534
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-nez v2, :cond_16

    .line 539
    .line 540
    aget-object v2, v5, v19

    .line 541
    .line 542
    aget-object v3, v10, v17

    .line 543
    .line 544
    iget-object v3, v3, LB1/e;->b:Ljava/lang/String;

    .line 545
    .line 546
    aget v9, v8, v17

    .line 547
    .line 548
    int-to-long v9, v9

    .line 549
    iget-object v11, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 550
    .line 551
    invoke-static {v9, v10, v11}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 552
    .line 553
    .line 554
    move-result-object v9

    .line 555
    invoke-virtual {v2, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    :cond_16
    iget v2, v0, LB1/h;->d:I

    .line 559
    .line 560
    const/16 v3, 0xe

    .line 561
    .line 562
    const/4 v12, 0x4

    .line 563
    if-eq v2, v12, :cond_19

    .line 564
    .line 565
    const/16 v9, 0xd

    .line 566
    .line 567
    if-eq v2, v9, :cond_18

    .line 568
    .line 569
    if-eq v2, v3, :cond_17

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_17
    sget-object v2, LB1/h;->K:[B

    .line 573
    .line 574
    invoke-virtual {v1, v2}, LB1/c;->write([B)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1, v4}, LB1/c;->b(I)V

    .line 578
    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_18
    invoke-virtual {v1, v4}, LB1/c;->b(I)V

    .line 582
    .line 583
    .line 584
    sget-object v2, LB1/h;->F:[B

    .line 585
    .line 586
    invoke-virtual {v1, v2}, LB1/c;->write([B)V

    .line 587
    .line 588
    .line 589
    goto :goto_b

    .line 590
    :cond_19
    const v2, 0xffff

    .line 591
    .line 592
    .line 593
    if-gt v4, v2, :cond_25

    .line 594
    .line 595
    invoke-virtual {v1, v4}, LB1/c;->i(I)V

    .line 596
    .line 597
    .line 598
    sget-object v2, LB1/h;->c0:[B

    .line 599
    .line 600
    invoke-virtual {v1, v2}, LB1/c;->write([B)V

    .line 601
    .line 602
    .line 603
    :goto_b
    iget-object v2, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 604
    .line 605
    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 606
    .line 607
    if-ne v2, v9, :cond_1a

    .line 608
    .line 609
    const/16 v2, 0x4d4d

    .line 610
    .line 611
    goto :goto_c

    .line 612
    :cond_1a
    const/16 v2, 0x4949

    .line 613
    .line 614
    :goto_c
    invoke-virtual {v1, v2}, LB1/c;->d(S)V

    .line 615
    .line 616
    .line 617
    iget-object v2, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 618
    .line 619
    iput-object v2, v1, LB1/c;->b:Ljava/nio/ByteOrder;

    .line 620
    .line 621
    const/16 v2, 0x2a

    .line 622
    .line 623
    invoke-virtual {v1, v2}, LB1/c;->i(I)V

    .line 624
    .line 625
    .line 626
    const-wide/16 v9, 0x8

    .line 627
    .line 628
    invoke-virtual {v1, v9, v10}, LB1/c;->h(J)V

    .line 629
    .line 630
    .line 631
    const/4 v2, 0x0

    .line 632
    :goto_d
    array-length v9, v7

    .line 633
    if-ge v2, v9, :cond_22

    .line 634
    .line 635
    aget-object v9, v5, v2

    .line 636
    .line 637
    invoke-virtual {v9}, Ljava/util/HashMap;->isEmpty()Z

    .line 638
    .line 639
    .line 640
    move-result v9

    .line 641
    if-nez v9, :cond_21

    .line 642
    .line 643
    aget-object v9, v5, v2

    .line 644
    .line 645
    invoke-virtual {v9}, Ljava/util/HashMap;->size()I

    .line 646
    .line 647
    .line 648
    move-result v9

    .line 649
    invoke-virtual {v1, v9}, LB1/c;->i(I)V

    .line 650
    .line 651
    .line 652
    aget v9, v8, v2

    .line 653
    .line 654
    add-int/lit8 v9, v9, 0x2

    .line 655
    .line 656
    aget-object v10, v5, v2

    .line 657
    .line 658
    invoke-virtual {v10}, Ljava/util/HashMap;->size()I

    .line 659
    .line 660
    .line 661
    move-result v10

    .line 662
    mul-int/lit8 v10, v10, 0xc

    .line 663
    .line 664
    add-int/2addr v10, v9

    .line 665
    const/16 v20, 0x4

    .line 666
    .line 667
    add-int/lit8 v10, v10, 0x4

    .line 668
    .line 669
    aget-object v9, v5, v2

    .line 670
    .line 671
    invoke-virtual {v9}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 672
    .line 673
    .line 674
    move-result-object v9

    .line 675
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 676
    .line 677
    .line 678
    move-result-object v9

    .line 679
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 680
    .line 681
    .line 682
    move-result v11

    .line 683
    if-eqz v11, :cond_1d

    .line 684
    .line 685
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v11

    .line 689
    check-cast v11, Ljava/util/Map$Entry;

    .line 690
    .line 691
    sget-object v12, LB1/h;->Y:[Ljava/util/HashMap;

    .line 692
    .line 693
    aget-object v12, v12, v2

    .line 694
    .line 695
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v13

    .line 699
    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v12

    .line 703
    check-cast v12, LB1/e;

    .line 704
    .line 705
    iget v12, v12, LB1/e;->a:I

    .line 706
    .line 707
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v11

    .line 711
    check-cast v11, LB1/d;

    .line 712
    .line 713
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget v13, v11, LB1/d;->a:I

    .line 717
    .line 718
    aget v14, v6, v13

    .line 719
    .line 720
    iget v15, v11, LB1/d;->b:I

    .line 721
    .line 722
    mul-int/2addr v14, v15

    .line 723
    invoke-virtual {v1, v12}, LB1/c;->i(I)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1, v13}, LB1/c;->i(I)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1, v15}, LB1/c;->b(I)V

    .line 730
    .line 731
    .line 732
    const/4 v12, 0x4

    .line 733
    if-le v14, v12, :cond_1b

    .line 734
    .line 735
    move v13, v4

    .line 736
    int-to-long v3, v10

    .line 737
    invoke-virtual {v1, v3, v4}, LB1/c;->h(J)V

    .line 738
    .line 739
    .line 740
    add-int/2addr v10, v14

    .line 741
    goto :goto_10

    .line 742
    :cond_1b
    move v13, v4

    .line 743
    iget-object v3, v11, LB1/d;->d:[B

    .line 744
    .line 745
    invoke-virtual {v1, v3}, LB1/c;->write([B)V

    .line 746
    .line 747
    .line 748
    if-ge v14, v12, :cond_1c

    .line 749
    .line 750
    :goto_f
    if-ge v14, v12, :cond_1c

    .line 751
    .line 752
    const/4 v3, 0x0

    .line 753
    invoke-virtual {v1, v3}, LB1/c;->a(I)V

    .line 754
    .line 755
    .line 756
    add-int/lit8 v14, v14, 0x1

    .line 757
    .line 758
    goto :goto_f

    .line 759
    :cond_1c
    :goto_10
    move v4, v13

    .line 760
    const/16 v3, 0xe

    .line 761
    .line 762
    goto :goto_e

    .line 763
    :cond_1d
    move v13, v4

    .line 764
    const/4 v12, 0x4

    .line 765
    if-nez v2, :cond_1e

    .line 766
    .line 767
    aget-object v3, v5, v12

    .line 768
    .line 769
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    if-nez v3, :cond_1e

    .line 774
    .line 775
    aget v3, v8, v12

    .line 776
    .line 777
    int-to-long v3, v3

    .line 778
    invoke-virtual {v1, v3, v4}, LB1/c;->h(J)V

    .line 779
    .line 780
    .line 781
    const-wide/16 v3, 0x0

    .line 782
    .line 783
    goto :goto_11

    .line 784
    :cond_1e
    const-wide/16 v3, 0x0

    .line 785
    .line 786
    invoke-virtual {v1, v3, v4}, LB1/c;->h(J)V

    .line 787
    .line 788
    .line 789
    :goto_11
    aget-object v9, v5, v2

    .line 790
    .line 791
    invoke-virtual {v9}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 792
    .line 793
    .line 794
    move-result-object v9

    .line 795
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 796
    .line 797
    .line 798
    move-result-object v9

    .line 799
    :cond_1f
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 800
    .line 801
    .line 802
    move-result v10

    .line 803
    if-eqz v10, :cond_20

    .line 804
    .line 805
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v10

    .line 809
    check-cast v10, Ljava/util/Map$Entry;

    .line 810
    .line 811
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v10

    .line 815
    check-cast v10, LB1/d;

    .line 816
    .line 817
    iget-object v10, v10, LB1/d;->d:[B

    .line 818
    .line 819
    array-length v11, v10

    .line 820
    const/4 v12, 0x4

    .line 821
    if-le v11, v12, :cond_1f

    .line 822
    .line 823
    array-length v11, v10

    .line 824
    const/4 v14, 0x0

    .line 825
    invoke-virtual {v1, v10, v14, v11}, LB1/c;->write([BII)V

    .line 826
    .line 827
    .line 828
    goto :goto_12

    .line 829
    :cond_20
    :goto_13
    const/4 v12, 0x4

    .line 830
    goto :goto_14

    .line 831
    :cond_21
    move v13, v4

    .line 832
    const-wide/16 v3, 0x0

    .line 833
    .line 834
    goto :goto_13

    .line 835
    :goto_14
    add-int/lit8 v2, v2, 0x1

    .line 836
    .line 837
    move v4, v13

    .line 838
    const/16 v3, 0xe

    .line 839
    .line 840
    goto/16 :goto_d

    .line 841
    .line 842
    :cond_22
    move v13, v4

    .line 843
    iget-boolean v2, v0, LB1/h;->h:Z

    .line 844
    .line 845
    if-eqz v2, :cond_23

    .line 846
    .line 847
    invoke-virtual {v0}, LB1/h;->p()[B

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    invoke-virtual {v1, v2}, LB1/c;->write([B)V

    .line 852
    .line 853
    .line 854
    :cond_23
    iget v2, v0, LB1/h;->d:I

    .line 855
    .line 856
    const/16 v15, 0xe

    .line 857
    .line 858
    if-ne v2, v15, :cond_24

    .line 859
    .line 860
    rem-int/lit8 v4, v13, 0x2

    .line 861
    .line 862
    move/from16 v2, v19

    .line 863
    .line 864
    if-ne v4, v2, :cond_24

    .line 865
    .line 866
    const/4 v14, 0x0

    .line 867
    invoke-virtual {v1, v14}, LB1/c;->a(I)V

    .line 868
    .line 869
    .line 870
    :cond_24
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 871
    .line 872
    iput-object v2, v1, LB1/c;->b:Ljava/nio/ByteOrder;

    .line 873
    .line 874
    return-void

    .line 875
    :cond_25
    move v13, v4

    .line 876
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 877
    .line 878
    const-string v2, "Size of exif data ("

    .line 879
    .line 880
    const-string v3, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"

    .line 881
    .line 882
    invoke-static {v13, v2, v3}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    throw v1
.end method

.method public final a()V
    .locals 7

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v3, "DateTime"

    .line 13
    .line 14
    invoke-virtual {p0, v3}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    aget-object v4, v1, v2

    .line 21
    .line 22
    invoke-static {v0}, LB1/d;->a(Ljava/lang/String;)LB1/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v4, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    const-string v0, "ImageWidth"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    aget-object v3, v1, v2

    .line 40
    .line 41
    iget-object v6, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 42
    .line 43
    invoke-static {v4, v5, v6}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    :cond_1
    const-string v0, "ImageLength"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    aget-object v3, v1, v2

    .line 59
    .line 60
    iget-object v6, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 61
    .line 62
    invoke-static {v4, v5, v6}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_2
    const-string v0, "Orientation"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    if-nez v3, :cond_3

    .line 76
    .line 77
    aget-object v2, v1, v2

    .line 78
    .line 79
    iget-object v3, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 80
    .line 81
    invoke-static {v4, v5, v3}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_3
    const-string v0, "LightSource"

    .line 89
    .line 90
    invoke-virtual {p0, v0}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-nez v2, :cond_4

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    aget-object v1, v1, v2

    .line 98
    .line 99
    iget-object v2, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 100
    .line 101
    invoke-static {v4, v5, v2}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_4
    return-void
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    if-eqz p1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LB1/h;->f(Ljava/lang/String;)LB1/d;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v4, :cond_5

    .line 13
    .line 14
    sget-object v6, LB1/h;->Z:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {v6, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    if-nez v6, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 23
    .line 24
    invoke-virtual {v4, p1}, LB1/d;->i(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    const-string v6, "GPSTimeStamp"

    .line 30
    .line 31
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_4

    .line 36
    .line 37
    const/4 p1, 0x5

    .line 38
    const-string v6, "ExifInterface"

    .line 39
    .line 40
    iget v7, v4, LB1/d;->a:I

    .line 41
    .line 42
    if-eq v7, p1, :cond_1

    .line 43
    .line 44
    const/16 p1, 0xa

    .line 45
    .line 46
    if-eq v7, p1, :cond_1

    .line 47
    .line 48
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v0, "GPS Timestamp format is not rational. format="

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    return-object v5

    .line 66
    :cond_1
    iget-object p1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 67
    .line 68
    invoke-virtual {v4, p1}, LB1/d;->j(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, [LB1/f;

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    array-length v4, p1

    .line 77
    if-eq v4, v3, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    aget-object v4, p1, v2

    .line 81
    .line 82
    iget-wide v5, v4, LB1/f;->a:J

    .line 83
    .line 84
    long-to-float v5, v5

    .line 85
    iget-wide v6, v4, LB1/f;->b:J

    .line 86
    .line 87
    long-to-float v4, v6

    .line 88
    div-float/2addr v5, v4

    .line 89
    float-to-int v4, v5

    .line 90
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    aget-object v5, p1, v1

    .line 95
    .line 96
    iget-wide v6, v5, LB1/f;->a:J

    .line 97
    .line 98
    long-to-float v6, v6

    .line 99
    iget-wide v7, v5, LB1/f;->b:J

    .line 100
    .line 101
    long-to-float v5, v7

    .line 102
    div-float/2addr v6, v5

    .line 103
    float-to-int v5, v6

    .line 104
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    aget-object p1, p1, v0

    .line 109
    .line 110
    iget-wide v6, p1, LB1/f;->a:J

    .line 111
    .line 112
    long-to-float v6, v6

    .line 113
    iget-wide v7, p1, LB1/f;->b:J

    .line 114
    .line 115
    long-to-float p1, v7

    .line 116
    div-float/2addr v6, p1

    .line 117
    float-to-int p1, v6

    .line 118
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    new-array v3, v3, [Ljava/lang/Object;

    .line 123
    .line 124
    aput-object v4, v3, v2

    .line 125
    .line 126
    aput-object v5, v3, v1

    .line 127
    .line 128
    aput-object p1, v3, v0

    .line 129
    .line 130
    const-string p1, "%02d:%02d:%02d"

    .line 131
    .line 132
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v1, "Invalid GPS Timestamp array. array="

    .line 140
    .line 141
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    return-object v5

    .line 159
    :cond_4
    :try_start_0
    iget-object p1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 160
    .line 161
    invoke-virtual {v4, p1}, LB1/d;->g(Ljava/nio/ByteOrder;)D

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    return-object p1

    .line 170
    :catch_0
    :cond_5
    return-object v5

    .line 171
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 172
    .line 173
    const-string v0, "tag shouldn\'t be null"

    .line 174
    .line 175
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1
.end method

.method public final e()I
    .locals 2

    .line 1
    const-string v0, "Orientation"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LB1/h;->f(Ljava/lang/String;)LB1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return v0

    .line 17
    :catch_0
    :goto_0
    const/4 v0, 0x1

    .line 18
    return v0
.end method

.method public final f(Ljava/lang/String;)LB1/d;
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const-string v0, "ISOSpeedRatings"

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-boolean p1, LB1/h;->t:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string p1, "ExifInterface"

    .line 16
    .line 17
    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 18
    .line 19
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string p1, "PhotographicSensitivity"

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    sget-object v1, LB1/h;->V:[[LB1/e;

    .line 26
    .line 27
    array-length v1, v1

    .line 28
    if-ge v0, v1, :cond_3

    .line 29
    .line 30
    iget-object v1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 31
    .line 32
    aget-object v1, v1, v0

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, LB1/d;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const/4 p1, 0x0

    .line 47
    return-object p1

    .line 48
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 49
    .line 50
    const-string v0, "tag shouldn\'t be null"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public final g(LB1/g;)V
    .locals 13

    .line 1
    const-string v0, "yes"

    .line 2
    .line 3
    const-string v1, "Heif meta: "

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1c

    .line 8
    .line 9
    if-lt v2, v3, :cond_c

    .line 10
    .line 11
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance v3, LB1/a;

    .line 17
    .line 18
    invoke-direct {v3, p1}, LB1/a;-><init>(LB1/g;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, LB1/j;->a(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0x21

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/16 v4, 0x22

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/16 v5, 0x1a

    .line 37
    .line 38
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/16 v6, 0x11

    .line 43
    .line 44
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    const/16 v0, 0x1d

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/16 v5, 0x1e

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const/16 v6, 0x1f

    .line 67
    .line 68
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    const/16 v0, 0x12

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/16 v5, 0x13

    .line 89
    .line 90
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const/16 v6, 0x18

    .line 95
    .line 96
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const/4 v0, 0x0

    .line 102
    move-object v5, v0

    .line 103
    move-object v6, v5

    .line 104
    :goto_0
    iget-object v7, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    :try_start_1
    aget-object v9, v7, v8

    .line 110
    .line 111
    const-string v10, "ImageWidth"

    .line 112
    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    iget-object v12, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 118
    .line 119
    invoke-static {v11, v12}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_2
    if-eqz v5, :cond_3

    .line 127
    .line 128
    aget-object v9, v7, v8

    .line 129
    .line 130
    const-string v10, "ImageLength"

    .line 131
    .line 132
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    iget-object v12, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 137
    .line 138
    invoke-static {v11, v12}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_3
    const/4 v9, 0x6

    .line 146
    if-eqz v6, :cond_7

    .line 147
    .line 148
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    const/16 v11, 0x5a

    .line 153
    .line 154
    if-eq v10, v11, :cond_6

    .line 155
    .line 156
    const/16 v11, 0xb4

    .line 157
    .line 158
    if-eq v10, v11, :cond_5

    .line 159
    .line 160
    const/16 v11, 0x10e

    .line 161
    .line 162
    if-eq v10, v11, :cond_4

    .line 163
    .line 164
    const/4 v10, 0x1

    .line 165
    goto :goto_1

    .line 166
    :cond_4
    const/16 v10, 0x8

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    const/4 v10, 0x3

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    move v10, v9

    .line 172
    :goto_1
    aget-object v7, v7, v8

    .line 173
    .line 174
    const-string v11, "Orientation"

    .line 175
    .line 176
    iget-object v12, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 177
    .line 178
    invoke-static {v10, v12}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v7, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_7
    if-eqz v3, :cond_a

    .line 186
    .line 187
    if-eqz v4, :cond_a

    .line 188
    .line 189
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-le v4, v9, :cond_9

    .line 198
    .line 199
    int-to-long v10, v3

    .line 200
    invoke-virtual {p1, v10, v11}, LB1/g;->b(J)V

    .line 201
    .line 202
    .line 203
    new-array v7, v9, [B

    .line 204
    .line 205
    invoke-virtual {p1, v7}, LB1/b;->readFully([B)V

    .line 206
    .line 207
    .line 208
    add-int/2addr v3, v9

    .line 209
    add-int/lit8 v4, v4, -0x6

    .line 210
    .line 211
    sget-object v9, LB1/h;->c0:[B

    .line 212
    .line 213
    invoke-static {v7, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    new-array v4, v4, [B

    .line 220
    .line 221
    invoke-virtual {p1, v4}, LB1/b;->readFully([B)V

    .line 222
    .line 223
    .line 224
    iput v3, p0, LB1/h;->o:I

    .line 225
    .line 226
    invoke-virtual {p0, v8, v4}, LB1/h;->y(I[B)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 231
    .line 232
    const-string v0, "Invalid identifier"

    .line 233
    .line 234
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p1

    .line 238
    :cond_9
    new-instance p1, Ljava/io/IOException;

    .line 239
    .line 240
    const-string v0, "Invalid exif length"

    .line 241
    .line 242
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1

    .line 246
    :cond_a
    :goto_2
    sget-boolean p1, LB1/h;->t:Z

    .line 247
    .line 248
    if-eqz p1, :cond_b

    .line 249
    .line 250
    const-string p1, "ExifInterface"

    .line 251
    .line 252
    new-instance v3, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v0, "x"

    .line 261
    .line 262
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v0, ", rotation "

    .line 269
    .line 270
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    .line 282
    .line 283
    :cond_b
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :catch_0
    :try_start_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 288
    .line 289
    const-string v0, "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."

    .line 290
    .line 291
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 295
    :goto_3
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 296
    .line 297
    .line 298
    throw p1

    .line 299
    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 300
    .line 301
    const-string v0, "Reading EXIF from HEIF files is supported from SDK 28 and above"

    .line 302
    .line 303
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw p1
.end method

.method public final h(LB1/b;II)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "ExifInterface"

    .line 8
    .line 9
    sget-boolean v4, LB1/h;->t:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v6, "getJpegAttributes starting with: "

    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v5, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 31
    .line 32
    iput-object v5, v1, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 33
    .line 34
    invoke-virtual {v1}, LB1/b;->readByte()B

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const-string v6, "Invalid marker: "

    .line 39
    .line 40
    const/4 v7, -0x1

    .line 41
    if-ne v5, v7, :cond_17

    .line 42
    .line 43
    invoke-virtual {v1}, LB1/b;->readByte()B

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    const/16 v9, -0x28

    .line 48
    .line 49
    if-ne v8, v9, :cond_16

    .line 50
    .line 51
    const/4 v5, 0x2

    .line 52
    :goto_0
    invoke-virtual {v1}, LB1/b;->readByte()B

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-ne v6, v7, :cond_15

    .line 57
    .line 58
    invoke-virtual {v1}, LB1/b;->readByte()B

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    new-instance v8, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v9, "Found JPEG segment indicator: "

    .line 67
    .line 68
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    and-int/lit16 v9, v6, 0xff

    .line 72
    .line 73
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-static {v3, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_1
    const/16 v8, -0x27

    .line 88
    .line 89
    if-eq v6, v8, :cond_14

    .line 90
    .line 91
    const/16 v8, -0x26

    .line 92
    .line 93
    if-ne v6, v8, :cond_2

    .line 94
    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_2
    invoke-virtual {v1}, LB1/b;->readUnsignedShort()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    add-int/lit8 v9, v8, -0x2

    .line 102
    .line 103
    const/4 v10, 0x4

    .line 104
    add-int/2addr v5, v10

    .line 105
    if-eqz v4, :cond_3

    .line 106
    .line 107
    new-instance v11, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v12, "JPEG segment: "

    .line 110
    .line 111
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    and-int/lit16 v12, v6, 0xff

    .line 115
    .line 116
    invoke-static {v12}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v12, " (length: "

    .line 124
    .line 125
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v12, ")"

    .line 132
    .line 133
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    invoke-static {v3, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    :cond_3
    const-string v11, "Invalid length"

    .line 144
    .line 145
    if-ltz v9, :cond_13

    .line 146
    .line 147
    iget-object v12, v0, LB1/h;->e:[Ljava/util/HashMap;

    .line 148
    .line 149
    const/4 v14, 0x1

    .line 150
    const/16 v15, -0x1f

    .line 151
    .line 152
    if-eq v6, v15, :cond_8

    .line 153
    .line 154
    const/4 v15, -0x2

    .line 155
    if-eq v6, v15, :cond_6

    .line 156
    .line 157
    packed-switch v6, :pswitch_data_0

    .line 158
    .line 159
    .line 160
    packed-switch v6, :pswitch_data_1

    .line 161
    .line 162
    .line 163
    packed-switch v6, :pswitch_data_2

    .line 164
    .line 165
    .line 166
    packed-switch v6, :pswitch_data_3

    .line 167
    .line 168
    .line 169
    goto/16 :goto_8

    .line 170
    .line 171
    :pswitch_0
    invoke-virtual {v1, v14}, LB1/b;->a(I)V

    .line 172
    .line 173
    .line 174
    aget-object v6, v12, v2

    .line 175
    .line 176
    if-eq v2, v10, :cond_4

    .line 177
    .line 178
    const-string v9, "ImageLength"

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_4
    const-string v9, "ThumbnailImageLength"

    .line 182
    .line 183
    :goto_1
    invoke-virtual {v1}, LB1/b;->readUnsignedShort()I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    int-to-long v13, v13

    .line 188
    iget-object v15, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 189
    .line 190
    invoke-static {v13, v14, v15}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    invoke-virtual {v6, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    aget-object v6, v12, v2

    .line 198
    .line 199
    if-eq v2, v10, :cond_5

    .line 200
    .line 201
    const-string v9, "ImageWidth"

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_5
    const-string v9, "ThumbnailImageWidth"

    .line 205
    .line 206
    :goto_2
    invoke-virtual {v1}, LB1/b;->readUnsignedShort()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    int-to-long v12, v10

    .line 211
    iget-object v10, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 212
    .line 213
    invoke-static {v12, v13, v10}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-virtual {v6, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    add-int/lit8 v9, v8, -0x7

    .line 221
    .line 222
    goto/16 :goto_8

    .line 223
    .line 224
    :cond_6
    new-array v6, v9, [B

    .line 225
    .line 226
    invoke-virtual {v1, v6}, LB1/b;->readFully([B)V

    .line 227
    .line 228
    .line 229
    const-string v8, "UserComment"

    .line 230
    .line 231
    invoke-virtual {v0, v8}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    if-nez v9, :cond_7

    .line 236
    .line 237
    aget-object v9, v12, v14

    .line 238
    .line 239
    new-instance v10, Ljava/lang/String;

    .line 240
    .line 241
    sget-object v12, LB1/h;->b0:Ljava/nio/charset/Charset;

    .line 242
    .line 243
    invoke-direct {v10, v6, v12}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v10}, LB1/d;->a(Ljava/lang/String;)LB1/d;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-virtual {v9, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    :cond_7
    const/4 v9, 0x0

    .line 254
    goto/16 :goto_8

    .line 255
    .line 256
    :cond_8
    new-array v6, v9, [B

    .line 257
    .line 258
    invoke-virtual {v1, v6}, LB1/b;->readFully([B)V

    .line 259
    .line 260
    .line 261
    add-int v8, v5, v9

    .line 262
    .line 263
    sget-object v10, LB1/h;->c0:[B

    .line 264
    .line 265
    if-nez v10, :cond_9

    .line 266
    .line 267
    :goto_3
    const/16 v16, 0x0

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_9
    array-length v15, v10

    .line 271
    if-ge v9, v15, :cond_a

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_a
    const/4 v15, 0x0

    .line 275
    :goto_4
    array-length v7, v10

    .line 276
    if-ge v15, v7, :cond_10

    .line 277
    .line 278
    aget-byte v7, v6, v15

    .line 279
    .line 280
    const/16 v16, 0x0

    .line 281
    .line 282
    aget-byte v13, v10, v15

    .line 283
    .line 284
    if-eq v7, v13, :cond_f

    .line 285
    .line 286
    :goto_5
    sget-object v7, LB1/h;->d0:[B

    .line 287
    .line 288
    if-nez v7, :cond_b

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_b
    array-length v10, v7

    .line 292
    if-ge v9, v10, :cond_c

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_c
    move/from16 v10, v16

    .line 296
    .line 297
    :goto_6
    array-length v13, v7

    .line 298
    if-ge v10, v13, :cond_e

    .line 299
    .line 300
    aget-byte v13, v6, v10

    .line 301
    .line 302
    aget-byte v15, v7, v10

    .line 303
    .line 304
    if-eq v13, v15, :cond_d

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_e
    array-length v10, v7

    .line 311
    add-int/2addr v5, v10

    .line 312
    array-length v7, v7

    .line 313
    invoke-static {v6, v7, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    const-string v7, "Xmp"

    .line 318
    .line 319
    invoke-virtual {v0, v7}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    if-nez v9, :cond_11

    .line 324
    .line 325
    aget-object v9, v12, v16

    .line 326
    .line 327
    new-instance v17, LB1/d;

    .line 328
    .line 329
    array-length v10, v6

    .line 330
    int-to-long v12, v5

    .line 331
    const/16 v21, 0x1

    .line 332
    .line 333
    move-object/from16 v20, v6

    .line 334
    .line 335
    move/from16 v22, v10

    .line 336
    .line 337
    move-wide/from16 v18, v12

    .line 338
    .line 339
    invoke-direct/range {v17 .. v22}, LB1/d;-><init>(J[BII)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v5, v17

    .line 343
    .line 344
    invoke-virtual {v9, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    iput-boolean v14, v0, LB1/h;->s:Z

    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_f
    add-int/lit8 v15, v15, 0x1

    .line 351
    .line 352
    goto :goto_4

    .line 353
    :cond_10
    const/16 v16, 0x0

    .line 354
    .line 355
    array-length v7, v10

    .line 356
    invoke-static {v6, v7, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    add-int v5, p2, v5

    .line 361
    .line 362
    array-length v7, v10

    .line 363
    add-int/2addr v5, v7

    .line 364
    iput v5, v0, LB1/h;->o:I

    .line 365
    .line 366
    invoke-virtual {v0, v2, v6}, LB1/h;->y(I[B)V

    .line 367
    .line 368
    .line 369
    new-instance v5, LB1/b;

    .line 370
    .line 371
    invoke-direct {v5, v6}, LB1/b;-><init>([B)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v5}, LB1/h;->H(LB1/b;)V

    .line 375
    .line 376
    .line 377
    :cond_11
    :goto_7
    move v5, v8

    .line 378
    move/from16 v9, v16

    .line 379
    .line 380
    :goto_8
    if-ltz v9, :cond_12

    .line 381
    .line 382
    invoke-virtual {v1, v9}, LB1/b;->a(I)V

    .line 383
    .line 384
    .line 385
    add-int/2addr v5, v9

    .line 386
    const/4 v7, -0x1

    .line 387
    goto/16 :goto_0

    .line 388
    .line 389
    :cond_12
    new-instance v1, Ljava/io/IOException;

    .line 390
    .line 391
    invoke-direct {v1, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    throw v1

    .line 395
    :cond_13
    new-instance v1, Ljava/io/IOException;

    .line 396
    .line 397
    invoke-direct {v1, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v1

    .line 401
    :cond_14
    :goto_9
    iget-object v2, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 402
    .line 403
    iput-object v2, v1, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 404
    .line 405
    return-void

    .line 406
    :cond_15
    new-instance v1, Ljava/io/IOException;

    .line 407
    .line 408
    new-instance v2, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    const-string v3, "Invalid marker:"

    .line 411
    .line 412
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    and-int/lit16 v3, v6, 0xff

    .line 416
    .line 417
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw v1

    .line 432
    :cond_16
    new-instance v1, Ljava/io/IOException;

    .line 433
    .line 434
    new-instance v2, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    and-int/lit16 v3, v5, 0xff

    .line 440
    .line 441
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    throw v1

    .line 456
    :cond_17
    new-instance v1, Ljava/io/IOException;

    .line 457
    .line 458
    new-instance v2, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    and-int/lit16 v3, v5, 0xff

    .line 464
    .line 465
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw v1

    .line 480
    nop

    .line 481
    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()[D
    .locals 10

    .line 1
    const-string v0, "GPSLatitude"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "GPSLatitudeRef"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "GPSLongitude"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "GPSLongitudeRef"

    .line 20
    .line 21
    invoke-virtual {p0, v3}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-static {v0, v1}, LB1/h;->c(Ljava/lang/String;Ljava/lang/String;)D

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-static {v2, v3}, LB1/h;->c(Ljava/lang/String;Ljava/lang/String;)D

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    const/4 v8, 0x2

    .line 42
    new-array v8, v8, [D

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    aput-wide v4, v8, v9

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    aput-wide v6, v8, v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    return-object v8

    .line 51
    :catch_0
    const-string v4, "latValue="

    .line 52
    .line 53
    const-string v5, ", latRef="

    .line 54
    .line 55
    const-string v6, ", lngValue="

    .line 56
    .line 57
    invoke-static {v4, v0, v5, v1, v6}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", lngRef="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "Latitude/longitude values are not parsable. "

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "ExifInterface"

    .line 83
    .line 84
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_0
    const/4 v0, 0x0

    .line 88
    return-object v0
.end method

.method public final j(Ljava/io/BufferedInputStream;)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0x1388

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 8
    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    sget-object v5, LB1/h;->y:[B

    .line 20
    .line 21
    array-length v6, v5

    .line 22
    const/4 v7, 0x4

    .line 23
    if-ge v0, v6, :cond_21

    .line 24
    .line 25
    aget-byte v6, v3, v0

    .line 26
    .line 27
    aget-byte v5, v5, v0

    .line 28
    .line 29
    if-eq v6, v5, :cond_20

    .line 30
    .line 31
    const-string v0, "FUJIFILMCCD-RAW"

    .line 32
    .line 33
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v5, 0x0

    .line 42
    :goto_1
    array-length v6, v0

    .line 43
    if-ge v5, v6, :cond_1f

    .line 44
    .line 45
    aget-byte v6, v3, v5

    .line 46
    .line 47
    aget-byte v8, v0, v5

    .line 48
    .line 49
    if-eq v6, v8, :cond_1e

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    :try_start_0
    new-instance v8, LB1/b;

    .line 53
    .line 54
    invoke-direct {v8, v3}, LB1/b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v8}, LB1/b;->readInt()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    int-to-long v9, v0

    .line 62
    new-array v0, v7, [B

    .line 63
    .line 64
    invoke-virtual {v8, v0}, LB1/b;->readFully([B)V

    .line 65
    .line 66
    .line 67
    sget-object v11, LB1/h;->z:[B

    .line 68
    .line 69
    invoke-static {v0, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 70
    .line 71
    .line 72
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    :goto_2
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 76
    .line 77
    .line 78
    const/16 p1, 0x0

    .line 79
    .line 80
    goto/16 :goto_a

    .line 81
    .line 82
    :cond_0
    const-wide/16 v11, 0x1

    .line 83
    .line 84
    cmp-long v0, v9, v11

    .line 85
    .line 86
    const-wide/16 v13, 0x8

    .line 87
    .line 88
    if-nez v0, :cond_2

    .line 89
    .line 90
    :try_start_2
    invoke-virtual {v8}, LB1/b;->readLong()J

    .line 91
    .line 92
    .line 93
    move-result-wide v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    const-wide/16 v15, 0x10

    .line 95
    .line 96
    cmp-long v0, v9, v15

    .line 97
    .line 98
    if-gez v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    :goto_3
    const/16 p1, 0x0

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object v6, v8

    .line 106
    goto/16 :goto_1a

    .line 107
    .line 108
    :catch_0
    move-exception v0

    .line 109
    const/16 p1, 0x0

    .line 110
    .line 111
    goto :goto_9

    .line 112
    :cond_2
    move-wide v15, v13

    .line 113
    goto :goto_3

    .line 114
    :goto_4
    int-to-long v4, v2

    .line 115
    cmp-long v0, v9, v4

    .line 116
    .line 117
    if-lez v0, :cond_3

    .line 118
    .line 119
    move-wide v9, v4

    .line 120
    :cond_3
    sub-long/2addr v9, v15

    .line 121
    cmp-long v0, v9, v13

    .line 122
    .line 123
    if-gez v0, :cond_5

    .line 124
    .line 125
    :catch_1
    :cond_4
    :goto_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 126
    .line 127
    .line 128
    goto :goto_a

    .line 129
    :cond_5
    :try_start_3
    new-array v0, v7, [B

    .line 130
    .line 131
    const-wide/16 v4, 0x0

    .line 132
    .line 133
    move/from16 v2, p1

    .line 134
    .line 135
    move v13, v2

    .line 136
    :goto_6
    const-wide/16 v14, 0x4

    .line 137
    .line 138
    div-long v14, v9, v14
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 139
    .line 140
    cmp-long v14, v4, v14

    .line 141
    .line 142
    if-gez v14, :cond_4

    .line 143
    .line 144
    :try_start_4
    invoke-virtual {v8, v0}, LB1/b;->readFully([B)V
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 145
    .line 146
    .line 147
    cmp-long v14, v4, v11

    .line 148
    .line 149
    if-nez v14, :cond_6

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_6
    :try_start_5
    sget-object v14, LB1/h;->A:[B

    .line 153
    .line 154
    invoke-static {v0, v14}, Ljava/util/Arrays;->equals([B[B)Z

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    if-eqz v14, :cond_7

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    goto :goto_7

    .line 162
    :cond_7
    sget-object v14, LB1/h;->B:[B

    .line 163
    .line 164
    invoke-static {v0, v14}, Ljava/util/Arrays;->equals([B[B)Z

    .line 165
    .line 166
    .line 167
    move-result v14
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 168
    if-eqz v14, :cond_8

    .line 169
    .line 170
    const/4 v13, 0x1

    .line 171
    :cond_8
    :goto_7
    if-eqz v2, :cond_9

    .line 172
    .line 173
    if-eqz v13, :cond_9

    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 176
    .line 177
    .line 178
    const/16 v0, 0xc

    .line 179
    .line 180
    return v0

    .line 181
    :cond_9
    :goto_8
    add-long/2addr v4, v11

    .line 182
    goto :goto_6

    .line 183
    :catch_2
    move-exception v0

    .line 184
    goto :goto_9

    .line 185
    :catchall_1
    move-exception v0

    .line 186
    goto/16 :goto_1a

    .line 187
    .line 188
    :catch_3
    move-exception v0

    .line 189
    const/16 p1, 0x0

    .line 190
    .line 191
    move-object v8, v6

    .line 192
    :goto_9
    :try_start_6
    sget-boolean v2, LB1/h;->t:Z

    .line 193
    .line 194
    if-eqz v2, :cond_a

    .line 195
    .line 196
    const-string v2, "ExifInterface"

    .line 197
    .line 198
    const-string v4, "Exception parsing HEIF file type box."

    .line 199
    .line 200
    invoke-static {v2, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 201
    .line 202
    .line 203
    :cond_a
    if-eqz v8, :cond_b

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_b
    :goto_a
    :try_start_7
    new-instance v2, LB1/b;

    .line 207
    .line 208
    invoke-direct {v2, v3}, LB1/b;-><init>([B)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 209
    .line 210
    .line 211
    :try_start_8
    invoke-static {v2}, LB1/h;->x(LB1/b;)Ljava/nio/ByteOrder;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iput-object v0, v1, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 216
    .line 217
    iput-object v0, v2, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 218
    .line 219
    invoke-virtual {v2}, LB1/b;->readShort()S

    .line 220
    .line 221
    .line 222
    move-result v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 223
    const/16 v4, 0x4f52

    .line 224
    .line 225
    if-eq v0, v4, :cond_d

    .line 226
    .line 227
    const/16 v4, 0x5352

    .line 228
    .line 229
    if-ne v0, v4, :cond_c

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_c
    move/from16 v0, p1

    .line 233
    .line 234
    goto :goto_c

    .line 235
    :cond_d
    :goto_b
    const/4 v0, 0x1

    .line 236
    :goto_c
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 237
    .line 238
    .line 239
    goto :goto_f

    .line 240
    :catchall_2
    move-exception v0

    .line 241
    move-object v6, v2

    .line 242
    goto :goto_d

    .line 243
    :catchall_3
    move-exception v0

    .line 244
    goto :goto_d

    .line 245
    :catch_4
    move-object v2, v6

    .line 246
    goto :goto_e

    .line 247
    :goto_d
    if-eqz v6, :cond_e

    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 250
    .line 251
    .line 252
    :cond_e
    throw v0

    .line 253
    :catch_5
    :goto_e
    if-eqz v2, :cond_f

    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 256
    .line 257
    .line 258
    :cond_f
    move/from16 v0, p1

    .line 259
    .line 260
    :goto_f
    if-eqz v0, :cond_10

    .line 261
    .line 262
    const/4 v0, 0x7

    .line 263
    return v0

    .line 264
    :cond_10
    :try_start_9
    new-instance v2, LB1/b;

    .line 265
    .line 266
    invoke-direct {v2, v3}, LB1/b;-><init>([B)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 267
    .line 268
    .line 269
    :try_start_a
    invoke-static {v2}, LB1/h;->x(LB1/b;)Ljava/nio/ByteOrder;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iput-object v0, v1, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 274
    .line 275
    iput-object v0, v2, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 276
    .line 277
    invoke-virtual {v2}, LB1/b;->readShort()S

    .line 278
    .line 279
    .line 280
    move-result v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 281
    const/16 v4, 0x55

    .line 282
    .line 283
    if-ne v0, v4, :cond_11

    .line 284
    .line 285
    const/4 v0, 0x1

    .line 286
    goto :goto_10

    .line 287
    :cond_11
    move/from16 v0, p1

    .line 288
    .line 289
    :goto_10
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 290
    .line 291
    .line 292
    goto :goto_13

    .line 293
    :catchall_4
    move-exception v0

    .line 294
    move-object v6, v2

    .line 295
    goto :goto_11

    .line 296
    :catch_6
    move-object v6, v2

    .line 297
    goto :goto_12

    .line 298
    :catchall_5
    move-exception v0

    .line 299
    :goto_11
    if-eqz v6, :cond_12

    .line 300
    .line 301
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 302
    .line 303
    .line 304
    :cond_12
    throw v0

    .line 305
    :catch_7
    :goto_12
    if-eqz v6, :cond_13

    .line 306
    .line 307
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 308
    .line 309
    .line 310
    :cond_13
    move/from16 v0, p1

    .line 311
    .line 312
    :goto_13
    if-eqz v0, :cond_14

    .line 313
    .line 314
    const/16 v0, 0xa

    .line 315
    .line 316
    return v0

    .line 317
    :cond_14
    move/from16 v0, p1

    .line 318
    .line 319
    :goto_14
    sget-object v2, LB1/h;->E:[B

    .line 320
    .line 321
    array-length v4, v2

    .line 322
    if-ge v0, v4, :cond_16

    .line 323
    .line 324
    aget-byte v4, v3, v0

    .line 325
    .line 326
    aget-byte v2, v2, v0

    .line 327
    .line 328
    if-eq v4, v2, :cond_15

    .line 329
    .line 330
    move/from16 v0, p1

    .line 331
    .line 332
    goto :goto_15

    .line 333
    :cond_15
    add-int/lit8 v0, v0, 0x1

    .line 334
    .line 335
    goto :goto_14

    .line 336
    :cond_16
    const/4 v0, 0x1

    .line 337
    :goto_15
    if-eqz v0, :cond_17

    .line 338
    .line 339
    const/16 v0, 0xd

    .line 340
    .line 341
    return v0

    .line 342
    :cond_17
    move/from16 v0, p1

    .line 343
    .line 344
    :goto_16
    sget-object v2, LB1/h;->I:[B

    .line 345
    .line 346
    array-length v4, v2

    .line 347
    if-ge v0, v4, :cond_19

    .line 348
    .line 349
    aget-byte v4, v3, v0

    .line 350
    .line 351
    aget-byte v2, v2, v0

    .line 352
    .line 353
    if-eq v4, v2, :cond_18

    .line 354
    .line 355
    :goto_17
    move/from16 v5, p1

    .line 356
    .line 357
    goto :goto_19

    .line 358
    :cond_18
    add-int/lit8 v0, v0, 0x1

    .line 359
    .line 360
    goto :goto_16

    .line 361
    :cond_19
    move/from16 v0, p1

    .line 362
    .line 363
    :goto_18
    sget-object v4, LB1/h;->J:[B

    .line 364
    .line 365
    array-length v5, v4

    .line 366
    if-ge v0, v5, :cond_1b

    .line 367
    .line 368
    array-length v5, v2

    .line 369
    add-int/2addr v5, v0

    .line 370
    add-int/2addr v5, v7

    .line 371
    aget-byte v5, v3, v5

    .line 372
    .line 373
    aget-byte v4, v4, v0

    .line 374
    .line 375
    if-eq v5, v4, :cond_1a

    .line 376
    .line 377
    goto :goto_17

    .line 378
    :cond_1a
    add-int/lit8 v0, v0, 0x1

    .line 379
    .line 380
    goto :goto_18

    .line 381
    :cond_1b
    const/4 v5, 0x1

    .line 382
    :goto_19
    if-eqz v5, :cond_1c

    .line 383
    .line 384
    const/16 v0, 0xe

    .line 385
    .line 386
    return v0

    .line 387
    :cond_1c
    return p1

    .line 388
    :goto_1a
    if-eqz v6, :cond_1d

    .line 389
    .line 390
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 391
    .line 392
    .line 393
    :cond_1d
    throw v0

    .line 394
    :cond_1e
    const/16 p1, 0x0

    .line 395
    .line 396
    add-int/lit8 v5, v5, 0x1

    .line 397
    .line 398
    goto/16 :goto_1

    .line 399
    .line 400
    :cond_1f
    const/16 v0, 0x9

    .line 401
    .line 402
    return v0

    .line 403
    :cond_20
    const/16 p1, 0x0

    .line 404
    .line 405
    add-int/lit8 v0, v0, 0x1

    .line 406
    .line 407
    goto/16 :goto_0

    .line 408
    .line 409
    :cond_21
    return v7
.end method

.method public final k(LB1/g;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, LB1/h;->n(LB1/g;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    const-string v2, "MakerNote"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LB1/d;

    .line 16
    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    new-instance v2, LB1/g;

    .line 20
    .line 21
    iget-object v1, v1, LB1/d;->d:[B

    .line 22
    .line 23
    invoke-direct {v2, v1}, LB1/g;-><init>([B)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    iput-object v1, v2, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    sget-object v1, LB1/h;->C:[B

    .line 31
    .line 32
    array-length v3, v1

    .line 33
    new-array v3, v3, [B

    .line 34
    .line 35
    invoke-virtual {v2, v3}, LB1/b;->readFully([B)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    invoke-virtual {v2, v4, v5}, LB1/g;->b(J)V

    .line 41
    .line 42
    .line 43
    sget-object v4, LB1/h;->D:[B

    .line 44
    .line 45
    array-length v5, v4

    .line 46
    new-array v5, v5, [B

    .line 47
    .line 48
    invoke-virtual {v2, v5}, LB1/b;->readFully([B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    const-wide/16 v3, 0x8

    .line 58
    .line 59
    invoke-virtual {v2, v3, v4}, LB1/g;->b(J)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v5, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    const-wide/16 v3, 0xc

    .line 70
    .line 71
    invoke-virtual {v2, v3, v4}, LB1/g;->b(J)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    const/4 v1, 0x6

    .line 75
    invoke-virtual {p0, v2, v1}, LB1/h;->z(LB1/g;I)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x7

    .line 79
    aget-object v2, p1, v1

    .line 80
    .line 81
    const-string v3, "PreviewImageStart"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, LB1/d;

    .line 88
    .line 89
    aget-object v1, p1, v1

    .line 90
    .line 91
    const-string v3, "PreviewImageLength"

    .line 92
    .line 93
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, LB1/d;

    .line 98
    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    const/4 v3, 0x5

    .line 104
    aget-object v4, p1, v3

    .line 105
    .line 106
    const-string v5, "JPEGInterchangeFormat"

    .line 107
    .line 108
    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    aget-object v2, p1, v3

    .line 112
    .line 113
    const-string v3, "JPEGInterchangeFormatLength"

    .line 114
    .line 115
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_2
    const/16 v1, 0x8

    .line 119
    .line 120
    aget-object v1, p1, v1

    .line 121
    .line 122
    const-string v2, "AspectFrame"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, LB1/d;

    .line 129
    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    iget-object v2, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, LB1/d;->j(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, [I

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    array-length v2, v1

    .line 143
    const/4 v3, 0x4

    .line 144
    if-eq v2, v3, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    const/4 v2, 0x2

    .line 148
    aget v2, v1, v2

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    aget v4, v1, v3

    .line 152
    .line 153
    if-le v2, v4, :cond_6

    .line 154
    .line 155
    const/4 v5, 0x3

    .line 156
    aget v5, v1, v5

    .line 157
    .line 158
    aget v1, v1, v0

    .line 159
    .line 160
    if-le v5, v1, :cond_6

    .line 161
    .line 162
    sub-int/2addr v2, v4

    .line 163
    add-int/2addr v2, v0

    .line 164
    sub-int/2addr v5, v1

    .line 165
    add-int/2addr v5, v0

    .line 166
    if-ge v2, v5, :cond_4

    .line 167
    .line 168
    add-int/2addr v2, v5

    .line 169
    sub-int v5, v2, v5

    .line 170
    .line 171
    sub-int/2addr v2, v5

    .line 172
    :cond_4
    iget-object v0, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 173
    .line 174
    invoke-static {v2, v0}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 179
    .line 180
    invoke-static {v5, v1}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    aget-object v2, p1, v3

    .line 185
    .line 186
    const-string v4, "ImageWidth"

    .line 187
    .line 188
    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    aget-object p1, p1, v3

    .line 192
    .line 193
    const-string v0, "ImageLength"

    .line 194
    .line 195
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_5
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v0, "Invalid aspect frame values. frame="

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    const-string v0, "ExifInterface"

    .line 218
    .line 219
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    :cond_6
    return-void
.end method

.method public final l(LB1/b;)V
    .locals 6

    .line 1
    sget-boolean v0, LB1/h;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getPngAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, LB1/h;->E:[B

    .line 29
    .line 30
    array-length v1, v0

    .line 31
    invoke-virtual {p1, v1}, LB1/b;->a(I)V

    .line 32
    .line 33
    .line 34
    array-length v0, v0

    .line 35
    :goto_0
    :try_start_0
    invoke-virtual {p1}, LB1/b;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x4

    .line 40
    new-array v2, v2, [B

    .line 41
    .line 42
    invoke-virtual {p1, v2}, LB1/b;->readFully([B)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x8

    .line 46
    .line 47
    const/16 v3, 0x10

    .line 48
    .line 49
    if-ne v0, v3, :cond_2

    .line 50
    .line 51
    sget-object v3, LB1/h;->G:[B

    .line 52
    .line 53
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 61
    .line 62
    const-string v0, "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    :goto_1
    sget-object v3, LB1/h;->H:[B

    .line 69
    .line 70
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    sget-object v3, LB1/h;->F:[B

    .line 78
    .line 79
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    new-array v1, v1, [B

    .line 86
    .line 87
    invoke-virtual {p1, v1}, LB1/b;->readFully([B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, LB1/b;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    new-instance v3, Ljava/util/zip/CRC32;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    long-to-int v2, v4

    .line 110
    if-ne v2, p1, :cond_4

    .line 111
    .line 112
    iput v0, p0, LB1/h;->o:I

    .line 113
    .line 114
    const/4 p1, 0x0

    .line 115
    invoke-virtual {p0, p1, v1}, LB1/h;->y(I[B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, LB1/h;->K()V

    .line 119
    .line 120
    .line 121
    new-instance p1, LB1/b;

    .line 122
    .line 123
    invoke-direct {p1, v1}, LB1/b;-><init>([B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1}, LB1/h;->H(LB1/b;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v2, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p1, ", calculated CRC value: "

    .line 146
    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_5
    add-int/lit8 v1, v1, 0x4

    .line 166
    .line 167
    invoke-virtual {p1, v1}, LB1/b;->a(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    add-int/2addr v0, v1

    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 174
    .line 175
    const-string v0, "Encountered corrupt PNG file."

    .line 176
    .line 177
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1
.end method

.method public final m(LB1/b;)V
    .locals 9

    .line 1
    const-string v0, "ExifInterface"

    .line 2
    .line 3
    sget-boolean v1, LB1/h;->t:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "getRafAttributes starting with: "

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    const/16 v2, 0x54

    .line 25
    .line 26
    invoke-virtual {p1, v2}, LB1/b;->a(I)V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    new-array v3, v2, [B

    .line 31
    .line 32
    new-array v4, v2, [B

    .line 33
    .line 34
    new-array v2, v2, [B

    .line 35
    .line 36
    invoke-virtual {p1, v3}, LB1/b;->readFully([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v4}, LB1/b;->readFully([B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2}, LB1/b;->readFully([B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    new-array v4, v4, [B

    .line 70
    .line 71
    iget v5, p1, LB1/b;->b:I

    .line 72
    .line 73
    sub-int v5, v3, v5

    .line 74
    .line 75
    invoke-virtual {p1, v5}, LB1/b;->a(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4}, LB1/b;->readFully([B)V

    .line 79
    .line 80
    .line 81
    new-instance v5, LB1/b;

    .line 82
    .line 83
    invoke-direct {v5, v4}, LB1/b;-><init>([B)V

    .line 84
    .line 85
    .line 86
    const/4 v4, 0x5

    .line 87
    invoke-virtual {p0, v5, v3, v4}, LB1/h;->h(LB1/b;II)V

    .line 88
    .line 89
    .line 90
    iget v3, p1, LB1/b;->b:I

    .line 91
    .line 92
    sub-int/2addr v2, v3

    .line 93
    invoke-virtual {p1, v2}, LB1/b;->a(I)V

    .line 94
    .line 95
    .line 96
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 97
    .line 98
    iput-object v2, p1, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 99
    .line 100
    invoke-virtual {p1}, LB1/b;->readInt()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v4, "numberOfDirectoryEntry: "

    .line 109
    .line 110
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :cond_1
    const/4 v3, 0x0

    .line 124
    move v4, v3

    .line 125
    :goto_0
    if-ge v4, v2, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, LB1/b;->readUnsignedShort()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    invoke-virtual {p1}, LB1/b;->readUnsignedShort()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    sget-object v7, LB1/h;->U:LB1/e;

    .line 136
    .line 137
    iget v7, v7, LB1/e;->a:I

    .line 138
    .line 139
    if-ne v5, v7, :cond_2

    .line 140
    .line 141
    invoke-virtual {p1}, LB1/b;->readShort()S

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-virtual {p1}, LB1/b;->readShort()S

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    iget-object v4, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 150
    .line 151
    invoke-static {v2, v4}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iget-object v5, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 156
    .line 157
    invoke-static {p1, v5}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    iget-object v6, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 162
    .line 163
    aget-object v7, v6, v3

    .line 164
    .line 165
    const-string v8, "ImageLength"

    .line 166
    .line 167
    invoke-virtual {v7, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    aget-object v3, v6, v3

    .line 171
    .line 172
    const-string v4, "ImageWidth"

    .line 173
    .line 174
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    if-eqz v1, :cond_3

    .line 178
    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v3, "Updated to length: "

    .line 182
    .line 183
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v2, ", width: "

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_2
    invoke-virtual {p1, v6}, LB1/b;->a(I)V

    .line 206
    .line 207
    .line 208
    add-int/lit8 v4, v4, 0x1

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_3
    return-void
.end method

.method public final n(LB1/g;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, LB1/h;->v(LB1/g;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, LB1/h;->z(LB1/g;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, LB1/h;->J(LB1/g;I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-virtual {p0, p1, v0}, LB1/h;->J(LB1/g;I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-virtual {p0, p1, v0}, LB1/h;->J(LB1/g;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LB1/h;->K()V

    .line 20
    .line 21
    .line 22
    iget p1, p0, LB1/h;->d:I

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aget-object v1, p1, v0

    .line 32
    .line 33
    const-string v2, "MakerNote"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, LB1/d;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    new-instance v2, LB1/g;

    .line 44
    .line 45
    iget-object v1, v1, LB1/d;->d:[B

    .line 46
    .line 47
    invoke-direct {v2, v1}, LB1/g;-><init>([B)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    iput-object v1, v2, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 53
    .line 54
    const/4 v1, 0x6

    .line 55
    invoke-virtual {v2, v1}, LB1/b;->a(I)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x9

    .line 59
    .line 60
    invoke-virtual {p0, v2, v1}, LB1/h;->z(LB1/g;I)V

    .line 61
    .line 62
    .line 63
    aget-object v1, p1, v1

    .line 64
    .line 65
    const-string v2, "ColorSpace"

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, LB1/d;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    aget-object p1, p1, v0

    .line 76
    .line 77
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_0
    return-void
.end method

.method public final o(LB1/g;)V
    .locals 5

    .line 1
    sget-boolean v0, LB1/h;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getRw2Attributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0, p1}, LB1/h;->n(LB1/g;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    aget-object v1, p1, v0

    .line 31
    .line 32
    const-string v2, "JpgFromRaw"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, LB1/d;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance v2, LB1/b;

    .line 43
    .line 44
    iget-object v3, v1, LB1/d;->d:[B

    .line 45
    .line 46
    invoke-direct {v2, v3}, LB1/b;-><init>([B)V

    .line 47
    .line 48
    .line 49
    iget-wide v3, v1, LB1/d;->c:J

    .line 50
    .line 51
    long-to-int v1, v3

    .line 52
    const/4 v3, 0x5

    .line 53
    invoke-virtual {p0, v2, v1, v3}, LB1/h;->h(LB1/b;II)V

    .line 54
    .line 55
    .line 56
    :cond_1
    aget-object v0, p1, v0

    .line 57
    .line 58
    const-string v1, "ISO"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, LB1/d;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    aget-object v2, p1, v1

    .line 68
    .line 69
    const-string v3, "PhotographicSensitivity"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, LB1/d;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    aget-object p1, p1, v1

    .line 82
    .line 83
    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_2
    return-void
.end method

.method public final p()[B
    .locals 10

    .line 1
    const-string v0, "Error closing fd."

    .line 2
    .line 3
    const-string v1, "ExifInterfaceUtils"

    .line 4
    .line 5
    const-string v2, "ExifInterface"

    .line 6
    .line 7
    iget-boolean v3, p0, LB1/h;->h:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    iget-object v3, p0, LB1/h;->m:[B

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    return-object v3

    .line 19
    :cond_1
    :try_start_0
    iget-object v3, p0, LB1/h;->c:Landroid/content/res/AssetManager$AssetInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->markSupported()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/io/InputStream;->reset()V

    .line 30
    .line 31
    .line 32
    :goto_0
    move-object v5, v4

    .line 33
    goto :goto_2

    .line 34
    :catchall_0
    move-exception v2

    .line 35
    move-object v5, v4

    .line 36
    :goto_1
    move-object v4, v3

    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :catch_0
    move-exception v5

    .line 40
    move-object v6, v5

    .line 41
    move-object v5, v4

    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    const-string v5, "Cannot read thumbnail from inputstream without mark/reset support"

    .line 45
    .line 46
    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_3
    :try_start_2
    iget-object v3, p0, LB1/h;->a:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    new-instance v3, Ljava/io/FileInputStream;

    .line 58
    .line 59
    iget-object v5, p0, LB1/h;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v3, v5}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_1
    move-exception v2

    .line 66
    move-object v5, v4

    .line 67
    goto :goto_5

    .line 68
    :catch_1
    move-exception v5

    .line 69
    move-object v3, v4

    .line 70
    move-object v6, v5

    .line 71
    move-object v5, v3

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    iget-object v3, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 74
    .line 75
    invoke-static {v3}, LB1/i;->b(Ljava/io/FileDescriptor;)Ljava/io/FileDescriptor;

    .line 76
    .line 77
    .line 78
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    :try_start_3
    sget v5, Landroid/system/OsConstants;->SEEK_SET:I

    .line 80
    .line 81
    const-wide/16 v6, 0x0

    .line 82
    .line 83
    invoke-static {v3, v6, v7, v5}, LB1/i;->c(Ljava/io/FileDescriptor;JI)J

    .line 84
    .line 85
    .line 86
    new-instance v5, Ljava/io/FileInputStream;

    .line 87
    .line 88
    invoke-direct {v5, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 89
    .line 90
    .line 91
    move-object v9, v5

    .line 92
    move-object v5, v3

    .line 93
    move-object v3, v9

    .line 94
    :goto_2
    :try_start_4
    new-instance v6, LB1/b;

    .line 95
    .line 96
    invoke-direct {v6, v3}, LB1/b;-><init>(Ljava/io/InputStream;)V

    .line 97
    .line 98
    .line 99
    iget v7, p0, LB1/h;->k:I

    .line 100
    .line 101
    iget v8, p0, LB1/h;->o:I

    .line 102
    .line 103
    add-int/2addr v7, v8

    .line 104
    invoke-virtual {v6, v7}, LB1/b;->a(I)V

    .line 105
    .line 106
    .line 107
    iget v7, p0, LB1/h;->l:I

    .line 108
    .line 109
    new-array v7, v7, [B

    .line 110
    .line 111
    invoke-virtual {v6, v7}, LB1/b;->readFully([B)V

    .line 112
    .line 113
    .line 114
    iput-object v7, p0, LB1/h;->m:[B
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 115
    .line 116
    invoke-static {v3}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 117
    .line 118
    .line 119
    if-eqz v5, :cond_5

    .line 120
    .line 121
    :try_start_5
    invoke-static {v5}, LB1/i;->a(Ljava/io/FileDescriptor;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 122
    .line 123
    .line 124
    return-object v7

    .line 125
    :catch_2
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    :cond_5
    return-object v7

    .line 129
    :catchall_2
    move-exception v2

    .line 130
    goto :goto_1

    .line 131
    :catch_3
    move-exception v6

    .line 132
    goto :goto_3

    .line 133
    :catchall_3
    move-exception v2

    .line 134
    move-object v5, v3

    .line 135
    goto :goto_5

    .line 136
    :catch_4
    move-exception v5

    .line 137
    move-object v6, v5

    .line 138
    move-object v5, v3

    .line 139
    move-object v3, v4

    .line 140
    :goto_3
    :try_start_6
    const-string v7, "Encountered exception while getting thumbnail"

    .line 141
    .line 142
    invoke-static {v2, v7, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 143
    .line 144
    .line 145
    invoke-static {v3}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 146
    .line 147
    .line 148
    if-eqz v5, :cond_6

    .line 149
    .line 150
    :try_start_7
    invoke-static {v5}, LB1/i;->a(Ljava/io/FileDescriptor;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :catch_5
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    :cond_6
    :goto_4
    return-object v4

    .line 158
    :goto_5
    invoke-static {v4}, Lgc/b;->l(Ljava/io/Closeable;)V

    .line 159
    .line 160
    .line 161
    if-eqz v5, :cond_7

    .line 162
    .line 163
    :try_start_8
    invoke-static {v5}, LB1/i;->a(Ljava/io/FileDescriptor;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :catch_6
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    :cond_7
    :goto_6
    throw v2
.end method

.method public final q(LB1/b;)V
    .locals 5

    .line 1
    sget-boolean v0, LB1/h;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getWebpAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, LB1/h;->I:[B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    invoke-virtual {p1, v0}, LB1/b;->a(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, LB1/b;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/lit8 v0, v0, 0x8

    .line 39
    .line 40
    sget-object v1, LB1/h;->J:[B

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    invoke-virtual {p1, v2}, LB1/b;->a(I)V

    .line 44
    .line 45
    .line 46
    array-length v1, v1

    .line 47
    add-int/lit8 v1, v1, 0x8

    .line 48
    .line 49
    :goto_0
    const/4 v2, 0x4

    .line 50
    :try_start_0
    new-array v2, v2, [B

    .line 51
    .line 52
    invoke-virtual {p1, v2}, LB1/b;->readFully([B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, LB1/b;->readInt()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    add-int/lit8 v1, v1, 0x8

    .line 60
    .line 61
    sget-object v4, LB1/h;->K:[B

    .line 62
    .line 63
    invoke-static {v4, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    new-array v0, v3, [B

    .line 70
    .line 71
    invoke-virtual {p1, v0}, LB1/b;->readFully([B)V

    .line 72
    .line 73
    .line 74
    iput v1, p0, LB1/h;->o:I

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    invoke-virtual {p0, p1, v0}, LB1/h;->y(I[B)V

    .line 78
    .line 79
    .line 80
    new-instance p1, LB1/b;

    .line 81
    .line 82
    invoke-direct {p1, v0}, LB1/b;-><init>([B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1}, LB1/h;->H(LB1/b;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    rem-int/lit8 v2, v3, 0x2

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    if-ne v2, v4, :cond_2

    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    :cond_2
    add-int/2addr v1, v3

    .line 97
    if-ne v1, v0, :cond_3

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    if-gt v1, v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1, v3}, LB1/b;->a(I)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 107
    .line 108
    const-string v0, "Encountered WebP file with invalid chunk size"

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 115
    .line 116
    const-string v0, "Encountered corrupt WebP file."

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method public final s(LB1/b;Ljava/util/HashMap;)V
    .locals 3

    .line 1
    const-string v0, "JPEGInterchangeFormat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB1/d;

    .line 8
    .line 9
    const-string v1, "JPEGInterchangeFormatLength"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, LB1/d;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eqz p2, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget v1, p0, LB1/h;->d:I

    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    if-ne v1, v2, :cond_0

    .line 37
    .line 38
    iget v1, p0, LB1/h;->p:I

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    :cond_0
    if-lez v0, :cond_2

    .line 42
    .line 43
    if-lez p2, :cond_2

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    iput-boolean v1, p0, LB1/h;->h:Z

    .line 47
    .line 48
    iget-object v1, p0, LB1/h;->a:Ljava/lang/String;

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, LB1/h;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, LB1/h;->b:Ljava/io/FileDescriptor;

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    new-array v1, p2, [B

    .line 61
    .line 62
    invoke-virtual {p1, v0}, LB1/b;->a(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, LB1/b;->readFully([B)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, LB1/h;->m:[B

    .line 69
    .line 70
    :cond_1
    iput v0, p0, LB1/h;->k:I

    .line 71
    .line 72
    iput p2, p0, LB1/h;->l:I

    .line 73
    .line 74
    :cond_2
    sget-boolean p1, LB1/h;->t:Z

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    new-instance p1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v1, "Setting thumbnail attributes with offset: "

    .line 81
    .line 82
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, ", length: "

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const-string p2, "ExifInterface"

    .line 101
    .line 102
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_3
    return-void
.end method

.method public final t(Ljava/util/HashMap;)Z
    .locals 2

    .line 1
    const-string v0, "ImageLength"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB1/d;

    .line 8
    .line 9
    const-string v1, "ImageWidth"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, LB1/d;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/16 v1, 0x200

    .line 34
    .line 35
    if-gt v0, v1, :cond_0

    .line 36
    .line 37
    if-gt p1, v1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final u(Ljava/io/InputStream;)V
    .locals 7

    .line 1
    sget-boolean v0, LB1/h;->t:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    :try_start_0
    sget-object v3, LB1/h;->V:[[LB1/e;

    .line 6
    .line 7
    array-length v3, v3

    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v4, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    aput-object v4, v3, v2

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :catch_1
    move-exception p1

    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 32
    .line 33
    const/16 v3, 0x1388

    .line 34
    .line 35
    invoke-direct {v2, p1, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, LB1/h;->j(Ljava/io/BufferedInputStream;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, LB1/h;->d:I

    .line 43
    .line 44
    const/16 v3, 0xe

    .line 45
    .line 46
    const/16 v4, 0xd

    .line 47
    .line 48
    const/16 v5, 0x9

    .line 49
    .line 50
    const/4 v6, 0x4

    .line 51
    if-eq p1, v6, :cond_5

    .line 52
    .line 53
    if-eq p1, v5, :cond_5

    .line 54
    .line 55
    if-eq p1, v4, :cond_5

    .line 56
    .line 57
    if-ne p1, v3, :cond_1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    new-instance p1, LB1/g;

    .line 61
    .line 62
    invoke-direct {p1, v2}, LB1/g;-><init>(Ljava/io/InputStream;)V

    .line 63
    .line 64
    .line 65
    iget v1, p0, LB1/h;->d:I

    .line 66
    .line 67
    const/16 v2, 0xc

    .line 68
    .line 69
    if-ne v1, v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0, p1}, LB1/h;->g(LB1/g;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v2, 0x7

    .line 76
    if-ne v1, v2, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0, p1}, LB1/h;->k(LB1/g;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const/16 v2, 0xa

    .line 83
    .line 84
    if-ne v1, v2, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0, p1}, LB1/h;->o(LB1/g;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {p0, p1}, LB1/h;->n(LB1/g;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget v1, p0, LB1/h;->o:I

    .line 94
    .line 95
    int-to-long v1, v1

    .line 96
    invoke-virtual {p1, v1, v2}, LB1/g;->b(J)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, LB1/h;->H(LB1/b;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    :goto_2
    new-instance p1, LB1/b;

    .line 104
    .line 105
    invoke-direct {p1, v2}, LB1/b;-><init>(Ljava/io/InputStream;)V

    .line 106
    .line 107
    .line 108
    iget v2, p0, LB1/h;->d:I

    .line 109
    .line 110
    if-ne v2, v6, :cond_6

    .line 111
    .line 112
    invoke-virtual {p0, p1, v1, v1}, LB1/h;->h(LB1/b;II)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    if-ne v2, v4, :cond_7

    .line 117
    .line 118
    invoke-virtual {p0, p1}, LB1/h;->l(LB1/b;)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    if-ne v2, v5, :cond_8

    .line 123
    .line 124
    invoke-virtual {p0, p1}, LB1/h;->m(LB1/b;)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    if-ne v2, v3, :cond_9

    .line 129
    .line 130
    invoke-virtual {p0, p1}, LB1/h;->q(LB1/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    .line 133
    :cond_9
    :goto_3
    invoke-virtual {p0}, LB1/h;->a()V

    .line 134
    .line 135
    .line 136
    if-eqz v0, :cond_c

    .line 137
    .line 138
    invoke-virtual {p0}, LB1/h;->w()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :goto_4
    if-eqz v0, :cond_b

    .line 143
    .line 144
    :try_start_1
    const-string v1, "ExifInterface"

    .line 145
    .line 146
    const-string v2, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    .line 147
    .line 148
    invoke-static {v1, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    .line 151
    goto :goto_6

    .line 152
    :goto_5
    invoke-virtual {p0}, LB1/h;->a()V

    .line 153
    .line 154
    .line 155
    if-eqz v0, :cond_a

    .line 156
    .line 157
    invoke-virtual {p0}, LB1/h;->w()V

    .line 158
    .line 159
    .line 160
    :cond_a
    throw p1

    .line 161
    :cond_b
    :goto_6
    invoke-virtual {p0}, LB1/h;->a()V

    .line 162
    .line 163
    .line 164
    if-eqz v0, :cond_c

    .line 165
    .line 166
    invoke-virtual {p0}, LB1/h;->w()V

    .line 167
    .line 168
    .line 169
    :cond_c
    return-void
.end method

.method public final v(LB1/g;)V
    .locals 3

    .line 1
    invoke-static {p1}, LB1/h;->x(LB1/b;)Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    iput-object v0, p1, LB1/b;->c:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p1}, LB1/b;->readUnsignedShort()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, LB1/h;->d:I

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x2a

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Invalid start code: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {p1}, LB1/b;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    if-lt v0, v1, :cond_3

    .line 58
    .line 59
    add-int/lit8 v0, v0, -0x8

    .line 60
    .line 61
    if-lez v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1, v0}, LB1/b;->a(I)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 68
    .line 69
    const-string v1, "Invalid first Ifd offset: "

    .line 70
    .line 71
    invoke-static {v0, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method

.method public final w()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LB1/h;->e:[Ljava/util/HashMap;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    const-string v2, "The size of tag group["

    .line 8
    .line 9
    const-string v3, "]: "

    .line 10
    .line 11
    invoke-static {v0, v2, v3}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    aget-object v3, v1, v0

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "ExifInterface"

    .line 29
    .line 30
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    aget-object v1, v1, v0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, LB1/d;

    .line 60
    .line 61
    new-instance v5, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v6, "tagName: "

    .line 64
    .line 65
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, ", tagType: "

    .line 78
    .line 79
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, LB1/d;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v2, ", tagValue: \'"

    .line 90
    .line 91
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 95
    .line 96
    invoke-virtual {v4, v2}, LB1/d;->i(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, "\'"

    .line 104
    .line 105
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    return-void
.end method

.method public final y(I[B)V
    .locals 1

    .line 1
    new-instance v0, LB1/g;

    .line 2
    .line 3
    invoke-direct {v0, p2}, LB1/g;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LB1/h;->v(LB1/g;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, LB1/h;->z(LB1/g;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final z(LB1/g;I)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget v9, v1, LB1/b;->b:I

    .line 8
    .line 9
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    iget-object v10, v0, LB1/h;->f:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, LB1/b;->readShort()S

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    sget-boolean v11, LB1/h;->t:Z

    .line 23
    .line 24
    const-string v12, "ExifInterface"

    .line 25
    .line 26
    if-eqz v11, :cond_0

    .line 27
    .line 28
    new-instance v13, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v14, "numberOfDirectoryEntry: "

    .line 31
    .line 32
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v13

    .line 42
    invoke-static {v12, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_0
    if-gtz v9, :cond_1

    .line 46
    .line 47
    goto/16 :goto_17

    .line 48
    .line 49
    :cond_1
    const/4 v13, 0x0

    .line 50
    :goto_0
    iget-object v14, v0, LB1/h;->e:[Ljava/util/HashMap;

    .line 51
    .line 52
    if-ge v13, v9, :cond_2d

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    invoke-virtual {v1}, LB1/b;->readUnsignedShort()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    const-wide/16 v18, 0x0

    .line 61
    .line 62
    invoke-virtual {v1}, LB1/b;->readUnsignedShort()I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    const/16 v16, 0x1

    .line 67
    .line 68
    invoke-virtual {v1}, LB1/b;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    const/16 v26, 0x2

    .line 73
    .line 74
    iget v4, v1, LB1/b;->b:I

    .line 75
    .line 76
    const/16 v27, 0x3

    .line 77
    .line 78
    int-to-long v3, v4

    .line 79
    const-wide/16 v20, 0x4

    .line 80
    .line 81
    add-long v3, v3, v20

    .line 82
    .line 83
    sget-object v22, LB1/h;->X:[Ljava/util/HashMap;

    .line 84
    .line 85
    const/16 v28, 0x4

    .line 86
    .line 87
    aget-object v6, v22, v2

    .line 88
    .line 89
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, LB1/e;

    .line 98
    .line 99
    if-eqz v11, :cond_3

    .line 100
    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v22

    .line 109
    move-object/from16 v23, v6

    .line 110
    .line 111
    if-eqz v5, :cond_2

    .line 112
    .line 113
    iget-object v6, v5, LB1/e;->b:Ljava/lang/String;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    const/4 v6, 0x0

    .line 117
    :goto_1
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v24

    .line 121
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v25

    .line 125
    move-object/from16 v29, v6

    .line 126
    .line 127
    move/from16 v30, v9

    .line 128
    .line 129
    const/4 v6, 0x5

    .line 130
    new-array v9, v6, [Ljava/lang/Object;

    .line 131
    .line 132
    aput-object v23, v9, v17

    .line 133
    .line 134
    aput-object v22, v9, v16

    .line 135
    .line 136
    aput-object v29, v9, v26

    .line 137
    .line 138
    aput-object v24, v9, v27

    .line 139
    .line 140
    aput-object v25, v9, v28

    .line 141
    .line 142
    const-string v6, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    .line 143
    .line 144
    invoke-static {v6, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-static {v12, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    move/from16 v30, v9

    .line 153
    .line 154
    :goto_2
    if-nez v5, :cond_5

    .line 155
    .line 156
    if-eqz v11, :cond_4

    .line 157
    .line 158
    new-instance v6, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v9, "Skip the tag entry since tag number is not defined: "

    .line 161
    .line 162
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-static {v12, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    :cond_4
    move/from16 v25, v7

    .line 176
    .line 177
    goto/16 :goto_b

    .line 178
    .line 179
    :cond_5
    if-lez v15, :cond_6

    .line 180
    .line 181
    sget-object v6, LB1/h;->S:[I

    .line 182
    .line 183
    array-length v9, v6

    .line 184
    if-lt v15, v9, :cond_7

    .line 185
    .line 186
    :cond_6
    move/from16 v25, v7

    .line 187
    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :cond_7
    iget v9, v5, LB1/e;->c:I

    .line 191
    .line 192
    move-object/from16 v24, v6

    .line 193
    .line 194
    const/4 v6, 0x7

    .line 195
    if-eq v9, v6, :cond_9

    .line 196
    .line 197
    if-ne v15, v6, :cond_8

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_8
    if-eq v9, v15, :cond_9

    .line 201
    .line 202
    iget v6, v5, LB1/e;->d:I

    .line 203
    .line 204
    if-ne v6, v15, :cond_a

    .line 205
    .line 206
    :cond_9
    :goto_3
    move/from16 v25, v7

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_a
    move/from16 v25, v7

    .line 210
    .line 211
    move/from16 v7, v28

    .line 212
    .line 213
    if-eq v9, v7, :cond_b

    .line 214
    .line 215
    if-ne v6, v7, :cond_c

    .line 216
    .line 217
    :cond_b
    move/from16 v7, v27

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_c
    const/16 v7, 0x9

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :goto_4
    if-ne v15, v7, :cond_c

    .line 224
    .line 225
    :goto_5
    const/4 v6, 0x7

    .line 226
    goto :goto_7

    .line 227
    :goto_6
    if-eq v9, v7, :cond_d

    .line 228
    .line 229
    if-ne v6, v7, :cond_e

    .line 230
    .line 231
    :cond_d
    const/16 v7, 0x8

    .line 232
    .line 233
    if-ne v15, v7, :cond_e

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_e
    const/16 v7, 0xc

    .line 237
    .line 238
    if-eq v9, v7, :cond_f

    .line 239
    .line 240
    if-ne v6, v7, :cond_10

    .line 241
    .line 242
    :cond_f
    const/16 v6, 0xb

    .line 243
    .line 244
    if-ne v15, v6, :cond_10

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_10
    if-eqz v11, :cond_15

    .line 248
    .line 249
    new-instance v6, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v7, "Skip the tag entry since data format ("

    .line 252
    .line 253
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    sget-object v7, LB1/h;->R:[Ljava/lang/String;

    .line 257
    .line 258
    aget-object v7, v7, v15

    .line 259
    .line 260
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v7, ") is unexpected for tag: "

    .line 264
    .line 265
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    iget-object v7, v5, LB1/e;->b:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-static {v12, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    goto :goto_b

    .line 281
    :goto_7
    if-ne v15, v6, :cond_11

    .line 282
    .line 283
    move v15, v9

    .line 284
    :cond_11
    int-to-long v6, v8

    .line 285
    aget v9, v24, v15

    .line 286
    .line 287
    move-wide/from16 v31, v6

    .line 288
    .line 289
    int-to-long v6, v9

    .line 290
    mul-long v6, v6, v31

    .line 291
    .line 292
    cmp-long v9, v6, v18

    .line 293
    .line 294
    if-ltz v9, :cond_13

    .line 295
    .line 296
    const-wide/32 v31, 0x7fffffff

    .line 297
    .line 298
    .line 299
    cmp-long v9, v6, v31

    .line 300
    .line 301
    if-lez v9, :cond_12

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_12
    move/from16 v9, v16

    .line 305
    .line 306
    goto :goto_c

    .line 307
    :cond_13
    :goto_8
    if-eqz v11, :cond_14

    .line 308
    .line 309
    new-instance v9, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    move-wide/from16 v31, v6

    .line 312
    .line 313
    const-string v6, "Skip the tag entry since the number of components is invalid: "

    .line 314
    .line 315
    invoke-direct {v9, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-static {v12, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_14
    move-wide/from16 v31, v6

    .line 330
    .line 331
    :goto_9
    move/from16 v9, v17

    .line 332
    .line 333
    move-wide/from16 v6, v31

    .line 334
    .line 335
    goto :goto_c

    .line 336
    :goto_a
    if-eqz v11, :cond_15

    .line 337
    .line 338
    new-instance v6, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    const-string v7, "Skip the tag entry since data format is invalid: "

    .line 341
    .line 342
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    invoke-static {v12, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    :cond_15
    :goto_b
    move/from16 v9, v17

    .line 356
    .line 357
    move-wide/from16 v6, v18

    .line 358
    .line 359
    :goto_c
    if-nez v9, :cond_16

    .line 360
    .line 361
    invoke-virtual {v1, v3, v4}, LB1/g;->b(J)V

    .line 362
    .line 363
    .line 364
    move/from16 v31, v11

    .line 365
    .line 366
    move/from16 v32, v13

    .line 367
    .line 368
    move/from16 v11, v26

    .line 369
    .line 370
    :goto_d
    const/4 v7, 0x3

    .line 371
    goto/16 :goto_16

    .line 372
    .line 373
    :cond_16
    cmp-long v9, v6, v20

    .line 374
    .line 375
    move/from16 v20, v9

    .line 376
    .line 377
    const-string v9, "Compression"

    .line 378
    .line 379
    if-lez v20, :cond_1a

    .line 380
    .line 381
    move/from16 v31, v11

    .line 382
    .line 383
    invoke-virtual {v1}, LB1/b;->readInt()I

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    move/from16 v32, v13

    .line 388
    .line 389
    if-eqz v31, :cond_17

    .line 390
    .line 391
    new-instance v13, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    move-object/from16 v33, v14

    .line 394
    .line 395
    const-string v14, "seek to data offset: "

    .line 396
    .line 397
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v13

    .line 407
    invoke-static {v12, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 408
    .line 409
    .line 410
    goto :goto_e

    .line 411
    :cond_17
    move-object/from16 v33, v14

    .line 412
    .line 413
    :goto_e
    iget v13, v0, LB1/h;->d:I

    .line 414
    .line 415
    const/4 v14, 0x7

    .line 416
    if-ne v13, v14, :cond_18

    .line 417
    .line 418
    iget-object v13, v5, LB1/e;->b:Ljava/lang/String;

    .line 419
    .line 420
    const-string v14, "MakerNote"

    .line 421
    .line 422
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v13

    .line 426
    if-eqz v13, :cond_19

    .line 427
    .line 428
    iput v11, v0, LB1/h;->p:I

    .line 429
    .line 430
    :cond_18
    move-wide/from16 v34, v3

    .line 431
    .line 432
    goto :goto_f

    .line 433
    :cond_19
    const/4 v13, 0x6

    .line 434
    if-ne v2, v13, :cond_18

    .line 435
    .line 436
    iget-object v14, v5, LB1/e;->b:Ljava/lang/String;

    .line 437
    .line 438
    const-string v13, "ThumbnailImage"

    .line 439
    .line 440
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    if-eqz v13, :cond_18

    .line 445
    .line 446
    iput v11, v0, LB1/h;->q:I

    .line 447
    .line 448
    iput v8, v0, LB1/h;->r:I

    .line 449
    .line 450
    iget-object v13, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 451
    .line 452
    const/4 v14, 0x6

    .line 453
    invoke-static {v14, v13}, LB1/d;->e(ILjava/nio/ByteOrder;)LB1/d;

    .line 454
    .line 455
    .line 456
    move-result-object v13

    .line 457
    iget v14, v0, LB1/h;->q:I

    .line 458
    .line 459
    move-wide/from16 v34, v3

    .line 460
    .line 461
    int-to-long v2, v14

    .line 462
    iget-object v4, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 463
    .line 464
    invoke-static {v2, v3, v4}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    iget v3, v0, LB1/h;->r:I

    .line 469
    .line 470
    int-to-long v3, v3

    .line 471
    iget-object v14, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 472
    .line 473
    invoke-static {v3, v4, v14}, LB1/d;->b(JLjava/nio/ByteOrder;)LB1/d;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    const/16 v28, 0x4

    .line 478
    .line 479
    aget-object v4, v33, v28

    .line 480
    .line 481
    invoke-virtual {v4, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    aget-object v4, v33, v28

    .line 485
    .line 486
    const-string v13, "JPEGInterchangeFormat"

    .line 487
    .line 488
    invoke-virtual {v4, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    aget-object v2, v33, v28

    .line 492
    .line 493
    const-string v4, "JPEGInterchangeFormatLength"

    .line 494
    .line 495
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    :goto_f
    int-to-long v2, v11

    .line 499
    invoke-virtual {v1, v2, v3}, LB1/g;->b(J)V

    .line 500
    .line 501
    .line 502
    goto :goto_10

    .line 503
    :cond_1a
    move-wide/from16 v34, v3

    .line 504
    .line 505
    move/from16 v31, v11

    .line 506
    .line 507
    move/from16 v32, v13

    .line 508
    .line 509
    move-object/from16 v33, v14

    .line 510
    .line 511
    :goto_10
    sget-object v2, LB1/h;->a0:Ljava/util/HashMap;

    .line 512
    .line 513
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    check-cast v2, Ljava/lang/Integer;

    .line 522
    .line 523
    if-eqz v31, :cond_1b

    .line 524
    .line 525
    new-instance v3, Ljava/lang/StringBuilder;

    .line 526
    .line 527
    const-string v4, "nextIfdType: "

    .line 528
    .line 529
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    const-string v4, " byteCount: "

    .line 536
    .line 537
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-static {v12, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 548
    .line 549
    .line 550
    :cond_1b
    if-eqz v2, :cond_26

    .line 551
    .line 552
    const/4 v3, 0x3

    .line 553
    if-eq v15, v3, :cond_1f

    .line 554
    .line 555
    const/4 v7, 0x4

    .line 556
    if-eq v15, v7, :cond_1e

    .line 557
    .line 558
    const/16 v7, 0x8

    .line 559
    .line 560
    if-eq v15, v7, :cond_1d

    .line 561
    .line 562
    const/16 v7, 0x9

    .line 563
    .line 564
    if-eq v15, v7, :cond_1c

    .line 565
    .line 566
    const/16 v3, 0xd

    .line 567
    .line 568
    if-eq v15, v3, :cond_1c

    .line 569
    .line 570
    const-wide/16 v3, -0x1

    .line 571
    .line 572
    goto :goto_12

    .line 573
    :cond_1c
    invoke-virtual {v1}, LB1/b;->readInt()I

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    :goto_11
    int-to-long v3, v3

    .line 578
    goto :goto_12

    .line 579
    :cond_1d
    invoke-virtual {v1}, LB1/b;->readShort()S

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    goto :goto_11

    .line 584
    :cond_1e
    invoke-virtual {v1}, LB1/b;->readInt()I

    .line 585
    .line 586
    .line 587
    move-result v3

    .line 588
    int-to-long v3, v3

    .line 589
    const-wide v6, 0xffffffffL

    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    and-long/2addr v3, v6

    .line 595
    goto :goto_12

    .line 596
    :cond_1f
    invoke-virtual {v1}, LB1/b;->readUnsignedShort()I

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    goto :goto_11

    .line 601
    :goto_12
    if-eqz v31, :cond_20

    .line 602
    .line 603
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    iget-object v5, v5, LB1/e;->b:Ljava/lang/String;

    .line 608
    .line 609
    move/from16 v11, v26

    .line 610
    .line 611
    new-array v7, v11, [Ljava/lang/Object;

    .line 612
    .line 613
    aput-object v6, v7, v17

    .line 614
    .line 615
    aput-object v5, v7, v16

    .line 616
    .line 617
    const-string v5, "Offset: %d, tagName: %s"

    .line 618
    .line 619
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    invoke-static {v12, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 624
    .line 625
    .line 626
    goto :goto_13

    .line 627
    :cond_20
    move/from16 v11, v26

    .line 628
    .line 629
    :goto_13
    cmp-long v5, v3, v18

    .line 630
    .line 631
    iget v6, v1, LB1/b;->e:I

    .line 632
    .line 633
    const-string v7, ")"

    .line 634
    .line 635
    const/4 v8, -0x1

    .line 636
    if-lez v5, :cond_24

    .line 637
    .line 638
    if-eq v6, v8, :cond_21

    .line 639
    .line 640
    int-to-long v13, v6

    .line 641
    cmp-long v5, v3, v13

    .line 642
    .line 643
    if-gez v5, :cond_24

    .line 644
    .line 645
    :cond_21
    long-to-int v5, v3

    .line 646
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 647
    .line 648
    .line 649
    move-result-object v5

    .line 650
    invoke-virtual {v10, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    if-nez v5, :cond_23

    .line 655
    .line 656
    invoke-virtual {v1, v3, v4}, LB1/g;->b(J)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    invoke-virtual {v0, v1, v2}, LB1/h;->z(LB1/g;I)V

    .line 664
    .line 665
    .line 666
    :cond_22
    :goto_14
    move-wide/from16 v3, v34

    .line 667
    .line 668
    goto :goto_15

    .line 669
    :cond_23
    if-eqz v31, :cond_22

    .line 670
    .line 671
    new-instance v5, Ljava/lang/StringBuilder;

    .line 672
    .line 673
    const-string v6, "Skip jump into the IFD since it has already been read: IfdType "

    .line 674
    .line 675
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    const-string v2, " (at "

    .line 682
    .line 683
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 697
    .line 698
    .line 699
    goto :goto_14

    .line 700
    :cond_24
    if-eqz v31, :cond_22

    .line 701
    .line 702
    const-string v2, "Skip jump into the IFD since its offset is invalid: "

    .line 703
    .line 704
    invoke-static {v3, v4, v2}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    if-eq v6, v8, :cond_25

    .line 709
    .line 710
    new-instance v3, Ljava/lang/StringBuilder;

    .line 711
    .line 712
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    const-string v2, " (total length: "

    .line 719
    .line 720
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    :cond_25
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 734
    .line 735
    .line 736
    goto :goto_14

    .line 737
    :goto_15
    invoke-virtual {v1, v3, v4}, LB1/g;->b(J)V

    .line 738
    .line 739
    .line 740
    goto/16 :goto_d

    .line 741
    .line 742
    :cond_26
    move/from16 v11, v26

    .line 743
    .line 744
    move-wide/from16 v3, v34

    .line 745
    .line 746
    iget v2, v1, LB1/b;->b:I

    .line 747
    .line 748
    iget v13, v0, LB1/h;->o:I

    .line 749
    .line 750
    add-int/2addr v2, v13

    .line 751
    long-to-int v6, v6

    .line 752
    new-array v6, v6, [B

    .line 753
    .line 754
    invoke-virtual {v1, v6}, LB1/b;->readFully([B)V

    .line 755
    .line 756
    .line 757
    new-instance v20, LB1/d;

    .line 758
    .line 759
    int-to-long v13, v2

    .line 760
    move-object/from16 v23, v6

    .line 761
    .line 762
    move/from16 v25, v8

    .line 763
    .line 764
    move-wide/from16 v21, v13

    .line 765
    .line 766
    move/from16 v24, v15

    .line 767
    .line 768
    invoke-direct/range {v20 .. v25}, LB1/d;-><init>(J[BII)V

    .line 769
    .line 770
    .line 771
    move-object/from16 v2, v20

    .line 772
    .line 773
    aget-object v6, v33, p2

    .line 774
    .line 775
    iget-object v7, v5, LB1/e;->b:Ljava/lang/String;

    .line 776
    .line 777
    invoke-virtual {v6, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    iget-object v5, v5, LB1/e;->b:Ljava/lang/String;

    .line 781
    .line 782
    const-string v6, "DNGVersion"

    .line 783
    .line 784
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v6

    .line 788
    const/4 v7, 0x3

    .line 789
    if-eqz v6, :cond_27

    .line 790
    .line 791
    iput v7, v0, LB1/h;->d:I

    .line 792
    .line 793
    :cond_27
    const-string v6, "Make"

    .line 794
    .line 795
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v6

    .line 799
    if-nez v6, :cond_28

    .line 800
    .line 801
    const-string v6, "Model"

    .line 802
    .line 803
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v6

    .line 807
    if-eqz v6, :cond_29

    .line 808
    .line 809
    :cond_28
    iget-object v6, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 810
    .line 811
    invoke-virtual {v2, v6}, LB1/d;->i(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v6

    .line 815
    const-string v8, "PENTAX"

    .line 816
    .line 817
    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 818
    .line 819
    .line 820
    move-result v6

    .line 821
    if-nez v6, :cond_2a

    .line 822
    .line 823
    :cond_29
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    if-eqz v5, :cond_2b

    .line 828
    .line 829
    iget-object v5, v0, LB1/h;->g:Ljava/nio/ByteOrder;

    .line 830
    .line 831
    invoke-virtual {v2, v5}, LB1/d;->h(Ljava/nio/ByteOrder;)I

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    const v5, 0xffff

    .line 836
    .line 837
    .line 838
    if-ne v2, v5, :cond_2b

    .line 839
    .line 840
    :cond_2a
    const/16 v2, 0x8

    .line 841
    .line 842
    iput v2, v0, LB1/h;->d:I

    .line 843
    .line 844
    :cond_2b
    iget v2, v1, LB1/b;->b:I

    .line 845
    .line 846
    int-to-long v5, v2

    .line 847
    cmp-long v2, v5, v3

    .line 848
    .line 849
    if-eqz v2, :cond_2c

    .line 850
    .line 851
    invoke-virtual {v1, v3, v4}, LB1/g;->b(J)V

    .line 852
    .line 853
    .line 854
    :cond_2c
    :goto_16
    add-int/lit8 v13, v32, 0x1

    .line 855
    .line 856
    int-to-short v13, v13

    .line 857
    move/from16 v2, p2

    .line 858
    .line 859
    move/from16 v9, v30

    .line 860
    .line 861
    move/from16 v11, v31

    .line 862
    .line 863
    goto/16 :goto_0

    .line 864
    .line 865
    :cond_2d
    move/from16 v31, v11

    .line 866
    .line 867
    move-object/from16 v33, v14

    .line 868
    .line 869
    const/16 v16, 0x1

    .line 870
    .line 871
    const/16 v17, 0x0

    .line 872
    .line 873
    const-wide/16 v18, 0x0

    .line 874
    .line 875
    invoke-virtual {v1}, LB1/b;->readInt()I

    .line 876
    .line 877
    .line 878
    move-result v2

    .line 879
    if-eqz v31, :cond_2e

    .line 880
    .line 881
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    move/from16 v4, v16

    .line 886
    .line 887
    new-array v4, v4, [Ljava/lang/Object;

    .line 888
    .line 889
    aput-object v3, v4, v17

    .line 890
    .line 891
    const-string v3, "nextIfdOffset: %d"

    .line 892
    .line 893
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    invoke-static {v12, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 898
    .line 899
    .line 900
    :cond_2e
    int-to-long v3, v2

    .line 901
    cmp-long v5, v3, v18

    .line 902
    .line 903
    if-lez v5, :cond_31

    .line 904
    .line 905
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 906
    .line 907
    .line 908
    move-result-object v5

    .line 909
    invoke-virtual {v10, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    move-result v5

    .line 913
    if-nez v5, :cond_30

    .line 914
    .line 915
    invoke-virtual {v1, v3, v4}, LB1/g;->b(J)V

    .line 916
    .line 917
    .line 918
    const/4 v7, 0x4

    .line 919
    aget-object v2, v33, v7

    .line 920
    .line 921
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 922
    .line 923
    .line 924
    move-result v2

    .line 925
    if-eqz v2, :cond_2f

    .line 926
    .line 927
    invoke-virtual {v0, v1, v7}, LB1/h;->z(LB1/g;I)V

    .line 928
    .line 929
    .line 930
    return-void

    .line 931
    :cond_2f
    const/4 v6, 0x5

    .line 932
    aget-object v2, v33, v6

    .line 933
    .line 934
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    if-eqz v2, :cond_32

    .line 939
    .line 940
    invoke-virtual {v0, v1, v6}, LB1/h;->z(LB1/g;I)V

    .line 941
    .line 942
    .line 943
    return-void

    .line 944
    :cond_30
    if-eqz v31, :cond_32

    .line 945
    .line 946
    new-instance v1, Ljava/lang/StringBuilder;

    .line 947
    .line 948
    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    .line 949
    .line 950
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    invoke-static {v12, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 961
    .line 962
    .line 963
    return-void

    .line 964
    :cond_31
    if-eqz v31, :cond_32

    .line 965
    .line 966
    new-instance v1, Ljava/lang/StringBuilder;

    .line 967
    .line 968
    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    .line 969
    .line 970
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v1

    .line 980
    invoke-static {v12, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 981
    .line 982
    .line 983
    :cond_32
    :goto_17
    return-void
.end method
