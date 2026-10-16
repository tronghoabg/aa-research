.class public final LE/A;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Lr0/t;

.field public final synthetic l:I


# direct methods
.method public constructor <init>(ILr0/t;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LE/A;->i:I

    .line 1
    iput p1, p0, LE/A;->j:I

    iput-object p2, p0, LE/A;->k:Lr0/t;

    iput p3, p0, LE/A;->l:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lr0/t;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LE/A;->i:I

    .line 2
    iput-object p1, p0, LE/A;->k:Lr0/t;

    iput p2, p0, LE/A;->j:I

    iput p3, p0, LE/A;->l:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LE/A;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr0/s;

    .line 7
    .line 8
    const-string v0, "$this$layout"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LE/A;->k:Lr0/t;

    .line 14
    .line 15
    iget v0, p1, Lr0/t;->a:I

    .line 16
    .line 17
    iget v1, p0, LE/A;->j:I

    .line 18
    .line 19
    sub-int/2addr v1, v0

    .line 20
    int-to-float v0, v1

    .line 21
    const/high16 v1, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr v0, v1

    .line 24
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p1, Lr0/t;->b:I

    .line 29
    .line 30
    iget v3, p0, LE/A;->l:I

    .line 31
    .line 32
    sub-int/2addr v3, v2

    .line 33
    int-to-float v2, v3

    .line 34
    div-float/2addr v2, v1

    .line 35
    invoke-static {v2}, Lvf/a;->H(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {p1, v0, v1, v2}, Lr0/s;->a(Lr0/t;IIF)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lef/C;->a:Lef/C;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_0
    check-cast p1, Lr0/s;

    .line 47
    .line 48
    const-string v0, "$this$layout"

    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, LE/A;->k:Lr0/t;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iget v1, p0, LE/A;->j:I

    .line 57
    .line 58
    iget v2, p0, LE/A;->l:I

    .line 59
    .line 60
    invoke-static {p1, v1, v2, v0}, Lr0/s;->a(Lr0/t;IIF)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lef/C;->a:Lef/C;

    .line 64
    .line 65
    return-object p1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
