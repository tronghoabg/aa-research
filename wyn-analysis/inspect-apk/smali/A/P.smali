.class public final LA/P;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:LA/U;

.field public final synthetic j:F


# direct methods
.method public constructor <init>(LA/U;F)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/P;->i:LA/U;

    .line 2
    .line 3
    iput p2, p0, LA/P;->j:F

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, LA/P;->i:LA/U;

    .line 8
    .line 9
    invoke-virtual {p1}, LA/U;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget v2, p0, LA/P;->j:F

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1, v2}, LA/U;->e(JF)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    return-object p1
.end method
