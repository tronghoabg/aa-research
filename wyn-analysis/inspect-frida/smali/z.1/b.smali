.class public final Lz/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# static fields
.field public static final j:Lz/b;

.field public static final k:Lz/b;

.field public static final l:Lz/b;

.field public static final m:Lz/b;

.field public static final n:Lz/b;

.field public static final o:Lz/b;

.field public static final p:Lz/b;


# instance fields
.field public final synthetic i:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lz/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lz/b;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lz/b;->j:Lz/b;

    .line 9
    .line 10
    new-instance v0, Lz/b;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Lz/b;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lz/b;->k:Lz/b;

    .line 18
    .line 19
    new-instance v0, Lz/b;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, v2}, Lz/b;-><init>(II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lz/b;->l:Lz/b;

    .line 27
    .line 28
    new-instance v0, Lz/b;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v0, v1, v2}, Lz/b;-><init>(II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lz/b;->m:Lz/b;

    .line 36
    .line 37
    new-instance v0, Lz/b;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v0, v1, v2}, Lz/b;-><init>(II)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lz/b;->n:Lz/b;

    .line 45
    .line 46
    new-instance v0, Lz/b;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    const/4 v2, 0x5

    .line 50
    invoke-direct {v0, v1, v2}, Lz/b;-><init>(II)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lz/b;->o:Lz/b;

    .line 54
    .line 55
    new-instance v0, Lz/b;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    const/4 v2, 0x6

    .line 59
    invoke-direct {v0, v1, v2}, Lz/b;-><init>(II)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lz/b;->p:Lz/b;

    .line 63
    .line 64
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lz/b;->i:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lz/b;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LA/N;

    .line 7
    .line 8
    const-string v0, "$this$animate"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lz/i;->d:LA/F;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, LL0/h;

    .line 17
    .line 18
    iget-wide v0, p1, LL0/h;->a:J

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-static {p1, p1}, LBa/c;->a(II)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    new-instance p1, LL0/h;

    .line 26
    .line 27
    invoke-direct {p1, v0, v1}, LL0/h;-><init>(J)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_1
    check-cast p1, LL0/h;

    .line 32
    .line 33
    iget-wide v0, p1, LL0/h;->a:J

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-static {p1, p1}, LBa/c;->a(II)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    new-instance p1, LL0/h;

    .line 41
    .line 42
    invoke-direct {p1, v0, v1}, LL0/h;-><init>(J)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_2
    check-cast p1, LA/l;

    .line 47
    .line 48
    const-string v0, "it"

    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget v0, p1, LA/l;->a:F

    .line 54
    .line 55
    iget p1, p1, LA/l;->b:F

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    int-to-long v0, v0

    .line 62
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    int-to-long v2, p1

    .line 67
    const/16 p1, 0x20

    .line 68
    .line 69
    shl-long/2addr v0, p1

    .line 70
    const-wide v4, 0xffffffffL

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v2, v4

    .line 76
    or-long/2addr v0, v2

    .line 77
    new-instance p1, Le0/J;

    .line 78
    .line 79
    invoke-direct {p1, v0, v1}, Le0/J;-><init>(J)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_3
    check-cast p1, Le0/J;

    .line 84
    .line 85
    iget-wide v0, p1, Le0/J;->a:J

    .line 86
    .line 87
    new-instance p1, LA/l;

    .line 88
    .line 89
    const/16 v2, 0x20

    .line 90
    .line 91
    shr-long v2, v0, v2

    .line 92
    .line 93
    long-to-int v2, v2

    .line 94
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const-wide v3, 0xffffffffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr v0, v3

    .line 104
    long-to-int v0, v0

    .line 105
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-direct {p1, v2, v0}, LA/l;-><init>(FF)V

    .line 110
    .line 111
    .line 112
    :pswitch_4
    return-object p1

    .line 113
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    return-object p1

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
