.class public final LE/r;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/s;


# static fields
.field public static final j:LE/r;

.field public static final k:LE/r;


# instance fields
.field public final synthetic i:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LE/r;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LE/r;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LE/r;->j:LE/r;

    .line 9
    .line 10
    new-instance v0, LE/r;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, LE/r;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LE/r;->k:LE/r;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LE/r;->i:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LE/r;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    move-object v3, p2

    .line 13
    check-cast v3, [I

    .line 14
    .line 15
    move-object v4, p3

    .line 16
    check-cast v4, LL0/i;

    .line 17
    .line 18
    move-object v1, p4

    .line 19
    check-cast v1, LL0/b;

    .line 20
    .line 21
    move-object v5, p5

    .line 22
    check-cast v5, [I

    .line 23
    .line 24
    const-string p1, "size"

    .line 25
    .line 26
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "layoutDirection"

    .line 30
    .line 31
    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p1, "density"

    .line 35
    .line 36
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string p1, "outPosition"

    .line 40
    .line 41
    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, LE/i;->a:LE/f;

    .line 45
    .line 46
    invoke-virtual/range {v0 .. v5}, LE/f;->c(LL0/b;I[ILL0/i;[I)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lef/C;->a:Lef/C;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    check-cast p2, [I

    .line 59
    .line 60
    check-cast p3, LL0/i;

    .line 61
    .line 62
    check-cast p4, LL0/b;

    .line 63
    .line 64
    check-cast p5, [I

    .line 65
    .line 66
    const-string v0, "size"

    .line 67
    .line 68
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "<anonymous parameter 2>"

    .line 72
    .line 73
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p3, "density"

    .line 77
    .line 78
    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string p3, "outPosition"

    .line 82
    .line 83
    invoke-static {p5, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sget-object p3, LE/i;->b:LE/f;

    .line 87
    .line 88
    invoke-virtual {p3, p4, p1, p2, p5}, LE/f;->a(LL0/b;I[I[I)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lef/C;->a:Lef/C;

    .line 92
    .line 93
    return-object p1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
