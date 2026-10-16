.class public final LE/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/n;


# static fields
.field public static final b:LE/m;

.field public static final c:LE/m;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LE/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LE/m;->b:LE/m;

    .line 8
    .line 9
    new-instance v0, LE/m;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LE/m;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LE/m;->c:LE/m;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LE/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lt0/r;LP/a;J)LD0/b;
    .locals 3

    .line 1
    iget p2, p0, LE/m;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p2, "$this$measure"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-ne p2, v0, :cond_0

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v1

    .line 25
    :goto_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move p2, v1

    .line 33
    :goto_1
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-ne v0, v2, :cond_2

    .line 42
    .line 43
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :cond_2
    sget-object p3, LE/l;->l:LE/l;

    .line 48
    .line 49
    invoke-static {p1, p2, v1, p3}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :pswitch_0
    const-string p2, "$this$MeasurePolicy"

    .line 55
    .line 56
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    sget-object p4, LE/l;->j:LE/l;

    .line 68
    .line 69
    invoke-static {p1, p2, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
