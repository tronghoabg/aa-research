.class public final LE/u;
.super Landroid/support/v4/media/session/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LE/u;->a:I

    iput-object p1, p0, LE/u;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final J(ILL0/i;Lr0/t;)I
    .locals 1

    .line 1
    iget p3, p0, LE/u;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p3, "layoutDirection"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, LE/u;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, LZ/c;

    .line 14
    .line 15
    int-to-float p1, p1

    .line 16
    const/high16 p3, 0x40000000    # 2.0f

    .line 17
    .line 18
    div-float/2addr p1, p3

    .line 19
    const/4 p3, 0x1

    .line 20
    int-to-float p3, p3

    .line 21
    iget p2, p2, LZ/c;->a:F

    .line 22
    .line 23
    add-float/2addr p3, p2

    .line 24
    mul-float/2addr p3, p1

    .line 25
    invoke-static {p3}, Lvf/a;->H(F)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :pswitch_0
    const-string p3, "layoutDirection"

    .line 31
    .line 32
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p3, p0, LE/u;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p3, LZ/b;

    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const-string v0, "layoutDirection"

    .line 43
    .line 44
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    int-to-float p1, p1

    .line 48
    const/high16 v0, 0x40000000    # 2.0f

    .line 49
    .line 50
    div-float/2addr p1, v0

    .line 51
    sget-object v0, LL0/i;->a:LL0/i;

    .line 52
    .line 53
    iget p3, p3, LZ/b;->a:F

    .line 54
    .line 55
    if-ne p2, v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 p2, -0x1

    .line 59
    int-to-float p2, p2

    .line 60
    mul-float/2addr p3, p2

    .line 61
    :goto_0
    const/4 p2, 0x1

    .line 62
    int-to-float p2, p2

    .line 63
    add-float/2addr p2, p3

    .line 64
    mul-float/2addr p2, p1

    .line 65
    invoke-static {p2}, Lvf/a;->H(F)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
