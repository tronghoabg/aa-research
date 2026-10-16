.class public final LA/J;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:Lkotlin/jvm/internal/G;

.field public final synthetic j:F

.field public final synthetic k:LA/L;

.field public final synthetic l:LA/j;

.field public final synthetic m:Ltf/l;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/G;FLA/L;LA/j;Ltf/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/J;->i:Lkotlin/jvm/internal/G;

    .line 2
    .line 3
    iput p2, p0, LA/J;->j:F

    .line 4
    .line 5
    iput-object p3, p0, LA/J;->k:LA/L;

    .line 6
    .line 7
    iput-object p4, p0, LA/J;->l:LA/j;

    .line 8
    .line 9
    iput-object p5, p0, LA/J;->m:Ltf/l;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object p1, p0, LA/J;->i:Lkotlin/jvm/internal/G;

    .line 8
    .line 9
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, LA/h;

    .line 16
    .line 17
    iget-object v5, p0, LA/J;->l:LA/j;

    .line 18
    .line 19
    iget-object v6, p0, LA/J;->m:Ltf/l;

    .line 20
    .line 21
    iget v3, p0, LA/J;->j:F

    .line 22
    .line 23
    iget-object v4, p0, LA/J;->k:LA/L;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, LA/t;->g(LA/h;JFLA/L;LA/j;Ltf/l;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    return-object p1
.end method
