.class public final LH7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuj;


# static fields
.field public static final b:LH7/a;

.field public static final c:LH7/a;

.field public static final d:LH7/a;

.field public static final e:LH7/a;

.field public static final f:LH7/a;

.field public static final g:LH7/a;

.field public static final h:LH7/a;

.field public static final i:LH7/a;

.field public static final j:LH7/a;

.field public static final k:LH7/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH7/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH7/a;->b:LH7/a;

    .line 8
    .line 9
    new-instance v0, LH7/a;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LH7/a;->c:LH7/a;

    .line 16
    .line 17
    new-instance v0, LH7/a;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LH7/a;->d:LH7/a;

    .line 24
    .line 25
    new-instance v0, LH7/a;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, LH7/a;->e:LH7/a;

    .line 32
    .line 33
    new-instance v0, LH7/a;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LH7/a;->f:LH7/a;

    .line 40
    .line 41
    new-instance v0, LH7/a;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LH7/a;->g:LH7/a;

    .line 48
    .line 49
    new-instance v0, LH7/a;

    .line 50
    .line 51
    const/4 v1, 0x6

    .line 52
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LH7/a;->h:LH7/a;

    .line 56
    .line 57
    new-instance v0, LH7/a;

    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, LH7/a;->i:LH7/a;

    .line 64
    .line 65
    new-instance v0, LH7/a;

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, LH7/a;->j:LH7/a;

    .line 73
    .line 74
    new-instance v0, LH7/a;

    .line 75
    .line 76
    const/16 v1, 0x9

    .line 77
    .line 78
    invoke-direct {v0, v1}, LH7/a;-><init>(I)V

    .line 79
    .line 80
    .line 81
    sput-object v0, LH7/a;->k:LH7/a;

    .line 82
    .line 83
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LH7/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zba(I)Z
    .locals 2

    .line 1
    iget v0, p0, LH7/a;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0

    :pswitch_0
    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x0

    :cond_1
    return v0

    :pswitch_1
    const/4 v0, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v0, 0x0

    :cond_2
    return v0

    :pswitch_2
    if-eqz p1, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 p1, 0x0

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1

    :pswitch_3
    const/4 v0, 0x1

    if-eqz p1, :cond_4

    if-eq p1, v0, :cond_4

    const/4 v0, 0x0

    :cond_4
    return v0

    :pswitch_4
    const/4 v0, 0x1

    if-eqz p1, :cond_5

    if-eq p1, v0, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/4 v1, 0x3

    if-eq p1, v1, :cond_5

    const/4 v1, 0x4

    if-eq p1, v1, :cond_5

    const/4 v0, 0x0

    :cond_5
    return v0

    :pswitch_5
    const/4 v0, 0x1

    if-eqz p1, :cond_6

    if-eq p1, v0, :cond_6

    const/4 v1, 0x2

    if-eq p1, v1, :cond_6

    const/4 v1, 0x3

    if-eq p1, v1, :cond_6

    const/4 v1, 0x4

    if-eq p1, v1, :cond_6

    const/4 v0, 0x0

    :cond_6
    return v0

    :pswitch_6
    const/4 v0, 0x1

    if-eqz p1, :cond_7

    if-eq p1, v0, :cond_7

    const/4 v1, 0x2

    if-eq p1, v1, :cond_7

    const/4 v0, 0x0

    :cond_7
    return v0

    :pswitch_7
    const/4 v0, 0x1

    if-eqz p1, :cond_8

    if-eq p1, v0, :cond_8

    const/4 v0, 0x0

    :cond_8
    return v0

    :pswitch_8
    const/4 v0, 0x1

    if-eqz p1, :cond_9

    if-eq p1, v0, :cond_9

    const/4 v1, 0x2

    if-eq p1, v1, :cond_9

    const/4 v0, 0x0

    :cond_9
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
