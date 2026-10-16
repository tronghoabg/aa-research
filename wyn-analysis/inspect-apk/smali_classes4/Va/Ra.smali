.class public final LVa/Ra;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Ia;
.implements LVa/ya;
.implements LVa/rb;


# static fields
.field public static b:Landroid/os/Handler; = null

.field public static c:I = 0x0

.field public static d:I = 0x1

.field public static final e:[C

.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/Ra;->e:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x41s
        0x6es
        0x61s
        0x6cs
        0x79s
        0x74s
        0x69s
        0x63s
        0x73s
        0x47s
        0x6fs
        0x20s
        0x75s
        0x65s
        0x72s
        0x70s
        0x66s
        0x64s
        0x45s
        0x76s
        0x21s
        0x53s
        0x6ds
        0x68s
        0x67s
        0x77s
        0x2es
        0x3as
        0x42s
        0x43s
        0x44s
        0x46s
        0x48s
        0x49s
        0x4as
        0x4bs
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p3

    const/16 v1, 0x12

    const/16 v2, 0xa

    const/4 v3, 0x6

    .line 2
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v4, LVa/ib;

    .line 4
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    iput-object v5, v4, LVa/ib;->a:Ljava/lang/Object;

    .line 6
    new-instance v6, LVa/ra;

    move-object/from16 v7, p2

    invoke-direct {v6, v5, v7}, LVa/ra;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v6, v4, LVa/ib;->c:Ljava/lang/Object;

    .line 7
    new-instance v6, LVa/ba;

    sget-object v7, LVa/Ab;->k:[B

    .line 8
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    .line 9
    sget v9, LVa/a;->d:I

    add-int/lit8 v9, v9, 0x4f

    rem-int/lit16 v10, v9, 0x80

    sput v10, LVa/a;->c:I

    rem-int/lit8 v9, v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    if-eqz v9, :cond_0

    .line 10
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    new-array v14, v3, [I

    fill-array-data v14, :array_0

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v15

    const/high16 v16, 0x40000000    # 2.0f

    cmpl-float v15, v15, v16

    const/16 v16, 0x53

    rem-int v15, v16, v15

    invoke-static {v15, v14}, LVa/a;->d(I[I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v14

    invoke-static {v9, v14}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_3

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    new-array v14, v3, [I

    fill-array-data v14, :array_1

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v15

    const/16 v16, 0x0

    cmpl-float v15, v15, v16

    rsub-int/lit8 v15, v15, 0xa

    invoke-static {v15, v14}, LVa/a;->d(I[I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v14

    invoke-static {v9, v14}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_3

    .line 11
    :goto_0
    new-array v9, v1, [I

    fill-array-data v9, :array_2

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v14

    cmp-long v14, v14, v12

    rsub-int/lit8 v14, v14, 0x22

    invoke-static {v14, v9}, LVa/a;->d(I[I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    const/16 v14, 0x18

    new-array v14, v14, [I

    fill-array-data v14, :array_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    cmp-long v15, v15, v12

    rsub-int/lit8 v15, v15, 0x2f

    invoke-static {v15, v14}, LVa/a;->d(I[I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v14

    .line 12
    sget v15, LVa/a;->c:I

    add-int/lit8 v15, v15, 0x23

    move/from16 v16, v1

    rem-int/lit16 v1, v15, 0x80

    sput v1, LVa/a;->d:I

    rem-int/lit8 v15, v15, 0x2

    invoke-static {v9, v14}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v15, :cond_1

    const/16 v1, 0x2c

    div-int/2addr v1, v11

    .line 13
    :cond_1
    new-array v1, v3, [I

    fill-array-data v1, :array_4

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v9

    shr-int/lit8 v9, v9, 0x8

    add-int/lit8 v9, v9, 0xb

    invoke-static {v9, v1}, LVa/a;->d(I[I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v11}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 14
    new-array v5, v2, [I

    fill-array-data v5, :array_5

    invoke-static {v12, v13}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v9

    rsub-int/lit8 v9, v9, 0x11

    invoke-static {v9, v5}, LVa/a;->d(I[I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_2

    :goto_1
    move-object v9, v5

    goto :goto_2

    .line 16
    :cond_2
    sget v5, LVa/a;->c:I

    add-int/lit8 v5, v5, 0x59

    rem-int/lit16 v5, v5, 0x80

    sput v5, LVa/a;->d:I

    .line 17
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    new-array v2, v2, [I

    fill-array-data v2, :array_6

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    add-int/lit8 v9, v9, 0x12

    invoke-static {v9, v2}, LVa/a;->d(I[I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 19
    sget v1, LVa/a;->c:I

    add-int/lit8 v1, v1, 0x35

    rem-int/lit16 v1, v1, 0x80

    sput v1, LVa/a;->d:I

    goto :goto_1

    .line 20
    :goto_2
    sget v1, LVa/a;->c:I

    add-int/lit8 v1, v1, 0x4d

    rem-int/lit16 v1, v1, 0x80

    sput v1, LVa/a;->d:I

    .line 21
    :cond_3
    sget v1, LVa/a;->d:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v1, v1, 0x80

    sput v1, LVa/a;->c:I

    .line 22
    const-string v1, ""

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 23
    :try_start_0
    invoke-static {v11}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x14

    shr-int/2addr v2, v3

    int-to-short v2, v2

    invoke-static {v11, v11}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v5

    const v14, -0xcdb9be

    add-int/2addr v5, v14

    invoke-static {v11, v11}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v14

    rsub-int/lit8 v14, v14, -0x61

    invoke-static {v11, v11}, Landroid/view/View;->resolveSize(II)I

    move-result v15
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    const v16, -0x7d7e229e

    sub-int v15, v16, v15

    move/from16 v16, v3

    :try_start_1
    invoke-static {v1, v11, v11}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v3

    int-to-byte v3, v3

    invoke-static {v5, v14, v3, v2, v15}, LVa/ba;->o(IIBSI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v2

    .line 24
    new-instance v3, Ljavax/crypto/spec/PBEKeySpec;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 25
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    const/16 v14, 0x400

    const/16 v15, 0x100

    invoke-direct {v3, v5, v7, v14, v15}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    .line 26
    invoke-virtual {v2, v3}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_0
    move/from16 v16, v3

    .line 27
    :catch_1
    invoke-static {v11}, Landroid/graphics/Color;->green(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x13

    const-string v3, "\u8faa\u5a13\u9671\u7c31\u043a\uf6b8\u8d77\u25ef\ufab7\u65e1\u2e3e\u607a\ue28d\uc7e2\u8b26\ufb30\u41d4\u24fe\u1821\u6d0c"

    invoke-static {v3, v2}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x3b

    const-string v5, "\u1000\u9dfe\u00a9\uffdd\u26de\u504f\u28fb\u0606\u8105\uc8a7\u9402\ucf94\u7506\uc2f4\u8d4f\ud13f\u759a\u3740\ud1f9\u764a\u943e\ub512\u805c\u7379\u6083\u60d5\u6329\u74c2\ucc71\u0c4f\ue510\u694e\u5946\ubf33\u6319\ufd2e\u7506\uc2f4\uba1d\ua75d\u29a3\u7b0a\uf075\ube9b\ud995\u1bd9\ue6c5\u5cfe\u47a4\u8761\u6cde\ua40c\u1051\u7cd9\u1b27\u59ea\u3537\u472c\u2dbe\u10e9"

    invoke-static {v5, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    .line 28
    sget v5, LVa/a;->d:I

    add-int/lit8 v5, v5, 0xf

    rem-int/lit16 v7, v5, 0x80

    sput v7, LVa/a;->c:I

    rem-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_5

    invoke-static {v2, v3}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    :try_start_2
    const-string v2, "\u1747\u9dd2\uc2ee\u4368"

    const/16 v3, 0x30

    invoke-static {v1, v3, v11, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    invoke-static {v2, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    move v3, v11

    .line 31
    :goto_3
    array-length v5, v0

    if-ge v3, v5, :cond_4

    .line 32
    aget-char v5, v0, v3

    int-to-byte v5, v5

    invoke-virtual {v2, v5}, Ljava/security/MessageDigest;->update(B)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :catch_2
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_5

    .line 33
    :cond_4
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_2

    .line 34
    :goto_4
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    cmp-long v3, v7, v12

    rsub-int/lit8 v3, v3, 0x1

    int-to-short v3, v3

    const v5, -0xcdb9cd

    invoke-static {v12, v13}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v7

    sub-int/2addr v5, v7

    invoke-static {v11}, Landroid/graphics/Color;->green(I)I

    move-result v7

    add-int/lit8 v7, v7, -0x7b

    const v8, -0x7d7e2282

    invoke-static {v1, v1, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    sub-int/2addr v8, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    int-to-byte v1, v1

    invoke-static {v5, v7, v1, v3, v8}, LVa/ba;->o(IIBSI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v2, v6, LVa/ba;->c:Ljava/lang/Object;

    .line 35
    invoke-virtual {v6}, LVa/ba;->g()V

    .line 36
    iput-object v6, v4, LVa/ib;->b:Ljava/lang/Object;

    move-object/from16 v1, p0

    .line 37
    iput-object v4, v1, LVa/Ra;->a:Ljava/lang/Object;

    return-void

    .line 38
    :goto_5
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-static {v11}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x14

    shr-int/lit8 v3, v3, 0x6

    add-int/lit8 v3, v3, 0x13

    const-string v4, "\ua280\u2732\u9cbd\uccf1\uf9d8\u71b9\u5c6f\udf03\ue6c5\u5cfe\u186d\u4320\u56dd\u4526\u5014\udaf5\ue6c5\u5cfe\uea27\u16ba"

    invoke-static {v4, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_5
    move-object/from16 v1, p0

    .line 39
    invoke-static {v2, v3}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    throw v10

    :array_0
    .array-data 4
        0xbb3fe5a
        0xdcd1e1f
        -0x5dbb992a
        0x9c88123
        0x61201e69
        -0x2ecd9b58
    .end array-data

    :array_1
    .array-data 4
        0xbb3fe5a
        0xdcd1e1f
        -0x5dbb992a
        0x9c88123
        0x61201e69
        -0x2ecd9b58
    .end array-data

    :array_2
    .array-data 4
        0x29239225
        -0x7ea519fb
        0x71498bf3
        0x7fb9f641
        0x23806671
        -0x182bec8
        0x31f184fd
        0x2575316d
        -0x64c4302f
        -0x368ef682
        0x26614885
        0x70a0253f
        0x11d75dbf
        0x606d516c
        0x782ec1d0
        0x4b6736f1    # 1.5152881E7f
        -0x7e55068
        -0x874301d
    .end array-data

    :array_3
    .array-data 4
        0x6fb86407
        -0x6721e942
        0x77fcae0c
        0x55196ad3
        0x102a81e6
        -0x786ea918
        -0x1cc2721a
        -0x76038eff
        0x5b86fa78
        0x4a5ac6f9    # 3584446.2f
        -0xe06e86
        0x600b114a
        -0x621657a4
        -0x679d794a
        -0x6bab6f0d
        0x3f5e3514
        0x11e1018
        0x7f7c26d1
        0x16fe8714
        -0x52d6b9c3
        -0xcc3f62a
        0xd2aa1c8
        -0x5ad58efa
        0x7c4474b4
    .end array-data

    :array_4
    .array-data 4
        0x787cd695
        -0x77f7ec34
        0x2de62b60
        -0x13dfb103
        0x5de7c411
        -0x5598ea4f
    .end array-data

    :array_5
    .array-data 4
        -0x3a30ae36
        -0x3a706c50
        0x36c2afc8
        -0x79a3ddf2
        0x6f225577
        0x24da225d
        0x5dcaf705
        -0x11c24ee3
        0x61201e69
        -0x2ecd9b58
    .end array-data

    :array_6
    .array-data 4
        -0x3a30ae36
        -0x3a706c50
        0x36c2afc8
        -0x79a3ddf2
        0x6f225577
        0x24da225d
        0x5dcaf705
        -0x11c24ee3
        0x61201e69
        -0x2ecd9b58
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/Ra;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(ILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/pb;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const-wide v1, -0x11fecca00a762181L    # -7.771995009145101E221

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2, p1, p0}, LVa/pb;->z(J[CI)[C

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    sput p1, LVa/pb;->C:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/pb;->C:I

    .line 23
    .line 24
    array-length v4, p0

    .line 25
    if-ge v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, -0x4

    .line 28
    .line 29
    aget-char v5, p0, v3

    .line 30
    .line 31
    rem-int/lit8 v6, v3, 0x4

    .line 32
    .line 33
    aget-char v6, p0, v6

    .line 34
    .line 35
    xor-int/2addr v5, v6

    .line 36
    int-to-long v5, v5

    .line 37
    int-to-long v7, v4

    .line 38
    mul-long/2addr v7, v1

    .line 39
    xor-long/2addr v5, v7

    .line 40
    long-to-int v4, v5

    .line 41
    int-to-char v4, v4

    .line 42
    aput-char v4, p0, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput v3, LVa/pb;->C:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, p0

    .line 54
    sub-int/2addr v2, p1

    .line 55
    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object v1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p0
.end method

.method public static synthetic g(LVa/Ra;)V
    .locals 2

    .line 1
    sget v0, LVa/Ra;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Ra;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, LVa/Ra;->i()V

    .line 15
    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/16 p0, 0x32

    .line 20
    .line 21
    div-int/lit8 p0, p0, 0x0

    .line 22
    .line 23
    :cond_0
    sget p0, LVa/Ra;->c:I

    .line 24
    .line 25
    add-int/lit8 p0, p0, 0x51

    .line 26
    .line 27
    rem-int/lit16 p0, p0, 0x80

    .line 28
    .line 29
    sput p0, LVa/Ra;->d:I

    .line 30
    .line 31
    return-void
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    shr-int/lit8 v0, v0, 0x10

    .line 10
    .line 11
    rsub-int/lit8 v0, v0, 0xb

    .line 12
    .line 13
    const-string v1, "\u1dfe\u1ed5\u7c6d\u891c\u2bc7\ucecc\ue3dd\u2f79\uebdf\u4f41\ua05f\u4ffd"

    .line 14
    .line 15
    invoke-static {v1, v0}, LVa/Ra;->o(Ljava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget v0, LVa/Ra;->c:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x6f

    .line 33
    .line 34
    rem-int/lit16 v0, v0, 0x80

    .line 35
    .line 36
    sput v0, LVa/Ra;->d:I

    .line 37
    .line 38
    return-object p0
.end method

.method public static i()V
    .locals 2

    .line 1
    sget v0, LVa/Ra;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Ra;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    throw v0
.end method

.method public static k()Landroid/os/Handler;
    .locals 6

    .line 1
    const-class v0, LVa/Ra;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LVa/Ra;->b:Landroid/os/Handler;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroid/os/HandlerThread;

    .line 9
    .line 10
    const-string v2, "\u0581\ub81e\udb73\u37bb\u8665\u2245\ufdba\ue6da\u9d8f\u93c9\u43a2\u1813\u29ed\u2e60\ua05f\u4ffd"

    .line 11
    .line 12
    const-string v3, ""

    .line 13
    .line 14
    const-string v4, ""

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-static {v3, v4, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-int/lit8 v3, v3, 0xf

    .line 22
    .line 23
    invoke-static {v2, v3}, LVa/Ra;->o(Ljava/lang/String;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 35
    .line 36
    .line 37
    new-instance v2, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    sput-object v2, LVa/Ra;->b:Landroid/os/Handler;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :goto_0
    sget-object v1, LVa/Ra;->b:Landroid/os/Handler;

    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object v1

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw v1
.end method

.method public static l(BILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->B:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, LVa/Ra;->e:[C

    .line 11
    .line 12
    new-array v2, p1, [C

    .line 13
    .line 14
    rem-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    aget-char v3, p2, p1

    .line 21
    .line 22
    sub-int/2addr v3, p0

    .line 23
    int-to-char v3, v3

    .line 24
    aput-char v3, v2, p1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    const/4 v3, 0x1

    .line 30
    if-le p1, v3, :cond_4

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    sput v3, LVa/Ab;->A:I

    .line 34
    .line 35
    :goto_1
    sget v3, LVa/Ab;->A:I

    .line 36
    .line 37
    if-ge v3, p1, :cond_4

    .line 38
    .line 39
    aget-char v4, p2, v3

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    aget-char v6, p2, v5

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    sub-int/2addr v4, p0

    .line 48
    int-to-char v4, v4

    .line 49
    aput-char v4, v2, v3

    .line 50
    .line 51
    sub-int/2addr v6, p0

    .line 52
    int-to-char v4, v6

    .line 53
    aput-char v4, v2, v5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    div-int/lit8 v7, v4, 0x6

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x6

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x6

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x6

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x5

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x6

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x5

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x6

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x6

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x6

    .line 78
    .line 79
    add-int/2addr v8, v6

    .line 80
    aget-char v4, v1, v7

    .line 81
    .line 82
    aput-char v4, v2, v3

    .line 83
    .line 84
    aget-char v4, v1, v8

    .line 85
    .line 86
    aput-char v4, v2, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    if-ne v7, v8, :cond_3

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x5

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x6

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x5

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x6

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x6

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x6

    .line 103
    .line 104
    add-int/2addr v8, v6

    .line 105
    aget-char v4, v1, v7

    .line 106
    .line 107
    aput-char v4, v2, v3

    .line 108
    .line 109
    aget-char v4, v1, v8

    .line 110
    .line 111
    aput-char v4, v2, v5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    mul-int/lit8 v7, v7, 0x6

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x6

    .line 118
    .line 119
    add-int/2addr v8, v4

    .line 120
    aget-char v4, v1, v7

    .line 121
    .line 122
    aput-char v4, v2, v3

    .line 123
    .line 124
    aget-char v4, v1, v8

    .line 125
    .line 126
    aput-char v4, v2, v5

    .line 127
    .line 128
    :goto_2
    add-int/lit8 v3, v3, 0x2

    .line 129
    .line 130
    sput v3, LVa/Ab;->A:I

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_3
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static o(Ljava/lang/String;I)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p0

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p0

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p0, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p0, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    add-int/lit16 v10, v10, 0x6d96

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    const v11, 0xaf9c

    .line 57
    .line 58
    .line 59
    add-int/2addr v10, v11

    .line 60
    xor-int/2addr v9, v10

    .line 61
    sub-int/2addr v7, v9

    .line 62
    int-to-char v7, v7

    .line 63
    aput-char v7, v3, v5

    .line 64
    .line 65
    add-int v9, v7, v4

    .line 66
    .line 67
    shl-int/lit8 v10, v7, 0x4

    .line 68
    .line 69
    const v11, 0xc33c

    .line 70
    .line 71
    .line 72
    add-int/2addr v10, v11

    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    const v10, 0x827f

    .line 77
    .line 78
    .line 79
    add-int/2addr v7, v10

    .line 80
    xor-int/2addr v7, v9

    .line 81
    sub-int/2addr v8, v7

    .line 82
    int-to-char v7, v8

    .line 83
    aput-char v7, v3, v2

    .line 84
    .line 85
    const v7, 0x9e37

    .line 86
    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 95
    .line 96
    aget-char v6, v3, v2

    .line 97
    .line 98
    aput-char v6, v1, v4

    .line 99
    .line 100
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    aget-char v5, v3, v5

    .line 103
    .line 104
    aput-char v5, v1, v6

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x2

    .line 107
    .line 108
    sput v4, LVa/Ab;->E:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return-object p0

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, LVa/W;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/W;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LVa/W;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, LVa/W;->f(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/16 p1, 0x43

    .line 21
    .line 22
    div-int/lit8 p1, p1, 0x0

    .line 23
    .line 24
    :cond_0
    sget p1, LVa/W;->h:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x2f

    .line 27
    .line 28
    rem-int/lit16 p1, p1, 0x80

    .line 29
    .line 30
    sput p1, LVa/W;->g:I

    .line 31
    .line 32
    return-void
.end method

.method public b(LVa/lb;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Da;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, LVa/Da;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p1, v0, LVa/Da;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, v0, LVa/Da;->e:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c(LVa/lb;)V
    .locals 8

    .line 1
    iget-object v0, p1, LVa/lb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/Aa;

    .line 4
    .line 5
    iget v1, v0, LVa/Aa;->a:I

    .line 6
    .line 7
    iget-object v0, v0, LVa/Aa;->b:Ljava/lang/String;

    .line 8
    .line 9
    const/16 v2, 0xc8

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-lt v1, v2, :cond_2

    .line 13
    .line 14
    const/16 v2, 0x12b

    .line 15
    .line 16
    if-gt v1, v2, :cond_2

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    const-string v1, ""

    .line 21
    .line 22
    invoke-static {v0, v1, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    rsub-int/lit8 v0, v0, 0x22

    .line 27
    .line 28
    int-to-byte v0, v0

    .line 29
    invoke-static {v3, v3}, Landroid/view/View;->getDefaultSize(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    rsub-int/lit8 v1, v1, 0x9

    .line 34
    .line 35
    const-string v2, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0095"

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, LVa/Ra;->l(BILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, ""

    .line 46
    .line 47
    invoke-static {v1, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    rsub-int/lit8 v1, v1, 0x6f

    .line 52
    .line 53
    int-to-byte v1, v1

    .line 54
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    shr-int/lit8 v2, v2, 0x8

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x25

    .line 61
    .line 62
    const-string v3, "\n\u000b\u000b\u0011\u0005\u0008\u0006\u000e\u00d2\u00d2\u000e\u0007\t\u0006\u000f\u000e\t\u000e\u0007\u0004\u0007\u000e\n\u0011\u0008\u0010\u0006\t\u0013\u0007\u000c\u0017\u0019\u0013\u0002\u0000\u0090"

    .line 63
    .line 64
    invoke-static {v1, v2, v3}, LVa/Ra;->l(BILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v2, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, LS3/i;

    .line 75
    .line 76
    iget-object v2, v2, LS3/i;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lorg/json/JSONArray;

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, LVa/Ab;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, LS3/i;

    .line 86
    .line 87
    iget-object v0, v0, LS3/i;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_1

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, LVa/l;

    .line 106
    .line 107
    iget-object v2, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, LS3/i;

    .line 110
    .line 111
    iget-object v2, v2, LS3/i;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, LVa/x;

    .line 114
    .line 115
    sget v3, LVa/x;->s:I

    .line 116
    .line 117
    add-int/lit8 v3, v3, 0x7

    .line 118
    .line 119
    rem-int/lit16 v4, v3, 0x80

    .line 120
    .line 121
    sput v4, LVa/x;->r:I

    .line 122
    .line 123
    rem-int/lit8 v3, v3, 0x2

    .line 124
    .line 125
    if-nez v3, :cond_0

    .line 126
    .line 127
    iget-object v2, v2, LVa/x;->d:LVa/cb;

    .line 128
    .line 129
    invoke-virtual {v1}, LVa/l;->d()LVa/Sa;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {}, LVa/Ra;->k()Landroid/os/Handler;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    new-instance v4, LVa/y;

    .line 141
    .line 142
    const/16 v5, 0x10

    .line 143
    .line 144
    invoke-direct {v4, v5}, LVa/y;-><init>(I)V

    .line 145
    .line 146
    .line 147
    iput-object v2, v4, LVa/y;->e:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v1, v4, LVa/y;->d:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 152
    .line 153
    .line 154
    sget v1, LVa/cb;->k:I

    .line 155
    .line 156
    add-int/lit8 v1, v1, 0x4d

    .line 157
    .line 158
    rem-int/lit16 v1, v1, 0x80

    .line 159
    .line 160
    sput v1, LVa/cb;->l:I

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_0
    iget-object p1, v2, LVa/x;->d:LVa/cb;

    .line 164
    .line 165
    const/4 p1, 0x0

    .line 166
    throw p1

    .line 167
    :cond_1
    new-instance v0, LVa/y;

    .line 168
    .line 169
    const/16 v1, 0x9

    .line 170
    .line 171
    invoke-direct {v0, v1}, LVa/y;-><init>(I)V

    .line 172
    .line 173
    .line 174
    iput-object p0, v0, LVa/y;->e:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object p1, v0, LVa/y;->d:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_2
    const/16 v2, 0x193

    .line 183
    .line 184
    if-ne v1, v2, :cond_5

    .line 185
    .line 186
    iget-object v2, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v2, LS3/i;

    .line 189
    .line 190
    iget-object v2, v2, LS3/i;->d:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, LVa/x;

    .line 193
    .line 194
    monitor-enter v2

    .line 195
    :try_start_0
    iget-object v4, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v4, LS3/i;

    .line 198
    .line 199
    iget-object v4, v4, LS3/i;->d:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v4, LVa/x;

    .line 202
    .line 203
    sget v5, LVa/x;->s:I

    .line 204
    .line 205
    add-int/lit8 v5, v5, 0x3f

    .line 206
    .line 207
    rem-int/lit16 v6, v5, 0x80

    .line 208
    .line 209
    sput v6, LVa/x;->r:I

    .line 210
    .line 211
    rem-int/lit8 v5, v5, 0x2

    .line 212
    .line 213
    if-eqz v5, :cond_3

    .line 214
    .line 215
    iget-object v4, v4, LVa/x;->j:Ljava/util/ArrayList;

    .line 216
    .line 217
    const/16 v5, 0x41

    .line 218
    .line 219
    div-int/2addr v5, v3

    .line 220
    goto :goto_1

    .line 221
    :cond_3
    iget-object v4, v4, LVa/x;->j:Ljava/util/ArrayList;

    .line 222
    .line 223
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-eqz v4, :cond_4

    .line 232
    .line 233
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    check-cast v4, LVa/Db;

    .line 238
    .line 239
    new-instance v5, LVa/v;

    .line 240
    .line 241
    const/4 v6, 0x3

    .line 242
    invoke-direct {v5, v6}, LVa/v;-><init>(I)V

    .line 243
    .line 244
    .line 245
    iput-object v4, v5, LVa/v;->d:Ljava/lang/Object;

    .line 246
    .line 247
    invoke-static {v5}, LVa/Cb;->g(LVa/Ba;)V

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :catchall_0
    move-exception p1

    .line 252
    goto :goto_3

    .line 253
    :cond_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 254
    goto :goto_4

    .line 255
    :goto_3
    monitor-exit v2

    .line 256
    throw p1

    .line 257
    :cond_5
    const-string v2, ""

    .line 258
    .line 259
    invoke-static {v2, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    rsub-int/lit8 v2, v2, 0x22

    .line 264
    .line 265
    int-to-byte v2, v2

    .line 266
    const-string v4, ""

    .line 267
    .line 268
    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    add-int/lit8 v4, v4, 0xa

    .line 273
    .line 274
    const-string v5, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0095"

    .line 275
    .line 276
    invoke-static {v2, v4, v5}, LVa/Ra;->l(BILjava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    new-instance v4, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 287
    .line 288
    .line 289
    const/4 v5, 0x0

    .line 290
    invoke-static {v3, v5, v5}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    cmpl-float v5, v6, v5

    .line 295
    .line 296
    add-int/lit8 v5, v5, 0x74

    .line 297
    .line 298
    int-to-byte v5, v5

    .line 299
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    shr-int/lit8 v6, v6, 0x10

    .line 304
    .line 305
    add-int/lit8 v6, v6, 0x33

    .line 306
    .line 307
    const-string v7, "\u0016\t\u0013\u0010\u000b\u001d\u0007\u0000\u001d\u0006\u001f\u0013\u0002\u0000\u0007\u001d\u0010\u0008\u0000\u0019\u0007\u001d\u000b\u0000\u001d\u0011\u0007\u000e\u0005\r\u0013\u0014\u0013\u0007\u0002\u001d\u0006\n\u000b\u0004\u0008\u0011\u000e\u0007\u0010\t\u0002\u0007\u000f\u0019\u0094"

    .line 308
    .line 309
    invoke-static {v5, v6, v7}, LVa/Ra;->l(BILjava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v5, ""

    .line 324
    .line 325
    invoke-static {v5, v3}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    rsub-int/lit8 v3, v3, 0x20

    .line 330
    .line 331
    int-to-byte v3, v3

    .line 332
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    shr-int/lit8 v5, v5, 0x10

    .line 337
    .line 338
    add-int/lit8 v5, v5, 0x1

    .line 339
    .line 340
    const-string v6, "@"

    .line 341
    .line 342
    invoke-static {v3, v5, v6}, LVa/Ra;->l(BILjava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v2, v3}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    :goto_4
    new-instance v2, LVa/t;

    .line 364
    .line 365
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 366
    .line 367
    .line 368
    iput-object p0, v2, LVa/t;->f:LVa/Ra;

    .line 369
    .line 370
    iput-object p1, v2, LVa/t;->c:LVa/lb;

    .line 371
    .line 372
    iput v1, v2, LVa/t;->d:I

    .line 373
    .line 374
    iput-object v0, v2, LVa/t;->e:Ljava/lang/String;

    .line 375
    .line 376
    invoke-static {v2}, LVa/Cb;->g(LVa/Ba;)V

    .line 377
    .line 378
    .line 379
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, LVa/y;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, LVa/y;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/y;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p1, v0, LVa/y;->d:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e(Ljava/lang/String;)I
    .locals 1

    .line 1
    sget v0, LVa/Ra;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Ra;->d:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/ib;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, v0, LVa/ib;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LVa/ra;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LVa/ra;->c(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    sget v0, LVa/Ra;->c:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x41

    .line 29
    .line 30
    rem-int/lit16 v0, v0, 0x80

    .line 31
    .line 32
    sput v0, LVa/Ra;->d:I

    .line 33
    .line 34
    return p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, LVa/Ra;->k()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LVa/Qa;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, LVa/Qa;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p0, v1, LVa/Qa;->f:LVa/Ra;

    .line 12
    .line 13
    iput-object p1, v1, LVa/Qa;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, v1, LVa/Qa;->e:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    sget p1, LVa/Ra;->c:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x65

    .line 23
    .line 24
    rem-int/lit16 p2, p1, 0x80

    .line 25
    .line 26
    sput p2, LVa/Ra;->d:I

    .line 27
    .line 28
    rem-int/lit8 p1, p1, 0x2

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    throw p1
.end method

.method public m(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/Ra;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Ra;->c:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/ib;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, v0, LVa/ib;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LVa/ra;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, LVa/ra;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    :try_start_1
    iget-object v0, v0, LVa/ib;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LVa/ba;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, LVa/ba;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_1
    .catch LVa/pa; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    :try_start_2
    const-string p1, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    const/4 p1, 0x0

    .line 45
    :cond_0
    :goto_0
    sget v0, LVa/Ra;->d:I

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x67

    .line 48
    .line 49
    rem-int/lit16 v0, v0, 0x80

    .line 50
    .line 51
    sput v0, LVa/Ra;->c:I

    .line 52
    .line 53
    return-object p1
.end method

.method public n(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/16 v2, 0x1b

    .line 4
    .line 5
    new-instance v3, LVa/g8;

    .line 6
    .line 7
    iget-object v4, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v4, LVa/b8;

    .line 10
    .line 11
    invoke-static {v4}, LVa/b8;->g(LVa/b8;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, v3, LVa/g8;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    const-wide/16 v7, 0x0

    .line 33
    .line 34
    cmp-long p1, v5, v7

    .line 35
    .line 36
    rsub-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    int-to-char p1, p1

    .line 39
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    const-wide/16 v9, -0x1

    .line 44
    .line 45
    cmp-long v5, v5, v9

    .line 46
    .line 47
    add-int/lit8 v5, v5, -0x1

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-static {v6, v6}, Landroid/graphics/PointF;->length(FF)F

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    cmpl-float v9, v9, v6

    .line 55
    .line 56
    add-int/lit8 v9, v9, 0x5

    .line 57
    .line 58
    invoke-static {v5, v9, p1}, LVa/g8;->c(IIC)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, v3, LVa/g8;->b:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    int-to-char p1, p1

    .line 81
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    shr-int/lit8 v5, v5, 0x10

    .line 86
    .line 87
    rsub-int/lit8 v5, v5, 0x5

    .line 88
    .line 89
    const-string v9, ""

    .line 90
    .line 91
    invoke-static {v9, v9, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    add-int/lit8 v10, v10, 0x8

    .line 96
    .line 97
    invoke-static {v5, v10, p1}, LVa/g8;->c(IIC)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    iput-boolean p1, v3, LVa/g8;->c:Z

    .line 110
    .line 111
    const/high16 p1, 0x1000000

    .line 112
    .line 113
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    add-int/2addr v5, p1

    .line 118
    int-to-char p1, v5

    .line 119
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    shr-int/lit8 v5, v5, 0x8

    .line 124
    .line 125
    rsub-int/lit8 v5, v5, 0xd

    .line 126
    .line 127
    invoke-static {v0}, Landroid/os/Process;->getThreadPriority(I)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    add-int/lit8 v10, v10, 0x14

    .line 132
    .line 133
    shr-int/lit8 v10, v10, 0x6

    .line 134
    .line 135
    rsub-int/lit8 v10, v10, 0x7

    .line 136
    .line 137
    invoke-static {v5, v10, p1}, LVa/g8;->c(IIC)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance v5, Lx9/d;

    .line 150
    .line 151
    invoke-direct {v5, v2}, Lx9/d;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v5}, LVa/Ab;->d0(Lorg/json/JSONArray;LVa/sb;)Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p1}, LVa/g8;->b(Ljava/util/ArrayList;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iput-object p1, v3, LVa/g8;->d:Ljava/util/List;

    .line 163
    .line 164
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    rsub-int p1, p1, 0x72df

    .line 169
    .line 170
    int-to-char p1, p1

    .line 171
    const v5, -0xffffec

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    sub-int/2addr v5, v10

    .line 179
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 180
    .line 181
    .line 182
    move-result-wide v10

    .line 183
    cmp-long v7, v10, v7

    .line 184
    .line 185
    add-int/lit8 v7, v7, 0x4

    .line 186
    .line 187
    invoke-static {v5, v7, p1}, LVa/g8;->c(IIC)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    new-instance v5, Lya/b;

    .line 200
    .line 201
    invoke-direct {v5, v2}, Lya/b;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-static {p1, v5}, LVa/Ab;->d0(Lorg/json/JSONArray;LVa/sb;)Ljava/util/ArrayList;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-static {p1}, LVa/g8;->b(Ljava/util/ArrayList;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, v3, LVa/g8;->e:Ljava/util/List;

    .line 213
    .line 214
    invoke-static {v0}, Landroid/os/Process;->getThreadPriority(I)I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    add-int/lit8 p1, p1, 0x14

    .line 219
    .line 220
    shr-int/lit8 p1, p1, 0x6

    .line 221
    .line 222
    rsub-int p1, p1, 0x4aa1

    .line 223
    .line 224
    int-to-char p1, p1

    .line 225
    const/16 v5, 0x30

    .line 226
    .line 227
    invoke-static {v9, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    rsub-int/lit8 v5, v5, 0x18

    .line 232
    .line 233
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    shr-int/lit8 v7, v7, 0x10

    .line 238
    .line 239
    add-int/lit8 v7, v7, 0x6

    .line 240
    .line 241
    invoke-static {v5, v7, p1}, LVa/g8;->c(IIC)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    new-instance v5, Lza/a;

    .line 254
    .line 255
    invoke-direct {v5, v2}, Lza/a;-><init>(I)V

    .line 256
    .line 257
    .line 258
    invoke-static {p1, v5}, LVa/Ab;->M(Lorg/json/JSONObject;LVa/rb;)Ljava/util/HashMap;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-static {p1}, LVa/g8;->a(Ljava/util/HashMap;)Ljava/util/Map;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iput-object p1, v3, LVa/g8;->f:Ljava/util/Map;

    .line 267
    .line 268
    new-array p1, v1, [LVa/r8;

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    aput-object v1, p1, v0

    .line 272
    .line 273
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    shr-int/lit8 v1, v1, 0x8

    .line 278
    .line 279
    int-to-char v1, v1

    .line 280
    invoke-static {v9}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    add-int/lit8 v2, v2, 0x1f

    .line 285
    .line 286
    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    cmpl-float v0, v0, v6

    .line 291
    .line 292
    add-int/lit8 v0, v0, 0x7

    .line 293
    .line 294
    invoke-static {v2, v0, v1}, LVa/g8;->c(IIC)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    new-instance v0, LVa/cb;

    .line 307
    .line 308
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 309
    .line 310
    .line 311
    iput-object v3, v0, LVa/cb;->c:Ljava/lang/Object;

    .line 312
    .line 313
    iput-object v4, v0, LVa/cb;->a:Ljava/lang/Object;

    .line 314
    .line 315
    iput-object p1, v0, LVa/cb;->b:Ljava/lang/Object;

    .line 316
    .line 317
    invoke-static {p2, v0}, LVa/Ab;->M(Lorg/json/JSONObject;LVa/rb;)Ljava/util/HashMap;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-static {p1}, LVa/g8;->a(Ljava/util/HashMap;)Ljava/util/Map;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    iput-object p1, v3, LVa/g8;->g:Ljava/util/Map;

    .line 326
    .line 327
    return-object v3
.end method

.method public p(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, LVa/Ra;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Ra;->d:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/ib;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, v0, LVa/ib;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LVa/ra;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LVa/ra;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :catchall_0
    sget p1, LVa/Ra;->c:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x7d

    .line 26
    .line 27
    rem-int/lit16 p1, p1, 0x80

    .line 28
    .line 29
    sput p1, LVa/Ra;->d:I

    .line 30
    .line 31
    return-void
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, LVa/Ra;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Ra;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, LVa/Ra;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, LVa/Ra;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, LVa/pb;->g0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p0, p1, p2}, LVa/Ra;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/16 p1, 0x8

    .line 32
    .line 33
    div-int/lit8 p1, p1, 0x0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0, p1, p2}, LVa/Ra;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, LVa/Ra;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {}, LVa/pb;->g0()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p0, p1, p2}, LVa/Ra;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    sget p1, LVa/Ra;->d:I

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x63

    .line 57
    .line 58
    rem-int/lit16 p2, p1, 0x80

    .line 59
    .line 60
    sput p2, LVa/Ra;->c:I

    .line 61
    .line 62
    rem-int/lit8 p1, p1, 0x2

    .line 63
    .line 64
    if-nez p1, :cond_1

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    const/4 p1, 0x0

    .line 68
    throw p1
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, LVa/Ra;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x29

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Ra;->d:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Ra;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/ib;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, v0, LVa/ib;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LVa/ba;

    .line 19
    .line 20
    invoke-virtual {v1, p2}, LVa/ba;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iget-object v0, v0, LVa/ib;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LVa/ra;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, LVa/ra;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :catchall_0
    sget p1, LVa/Ra;->d:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x53

    .line 34
    .line 35
    rem-int/lit16 p2, p1, 0x80

    .line 36
    .line 37
    sput p2, LVa/Ra;->c:I

    .line 38
    .line 39
    rem-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    const/16 p1, 0x5c

    .line 44
    .line 45
    div-int/lit8 p1, p1, 0x0

    .line 46
    .line 47
    :cond_0
    return-void
.end method
