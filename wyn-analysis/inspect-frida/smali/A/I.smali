.class public final LA/I;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:Lkotlin/jvm/internal/G;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:LA/L;

.field public final synthetic l:LA/n;

.field public final synthetic m:LA/j;

.field public final synthetic n:F

.field public final synthetic o:LA/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/G;Ljava/lang/Object;LA/L;LA/n;LA/j;FLA/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/I;->i:Lkotlin/jvm/internal/G;

    .line 2
    .line 3
    iput-object p2, p0, LA/I;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LA/I;->k:LA/L;

    .line 6
    .line 7
    iput-object p4, p0, LA/I;->l:LA/n;

    .line 8
    .line 9
    iput-object p5, p0, LA/I;->m:LA/j;

    .line 10
    .line 11
    iput p6, p0, LA/I;->n:F

    .line 12
    .line 13
    iput-object p7, p0, LA/I;->o:LA/a;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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
    new-instance v0, LA/h;

    .line 8
    .line 9
    iget-object p1, p0, LA/I;->k:LA/L;

    .line 10
    .line 11
    move-wide v4, v1

    .line 12
    iget-object v2, p1, LA/L;->b:LS3/e;

    .line 13
    .line 14
    new-instance v9, LA/H;

    .line 15
    .line 16
    iget-object v1, p0, LA/I;->m:LA/j;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v9, v1, v3}, LA/H;-><init>(LA/j;I)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, LA/I;->l:LA/n;

    .line 23
    .line 24
    iget-object v1, p0, LA/I;->j:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v6, p1, LA/L;->d:Ljava/lang/Object;

    .line 27
    .line 28
    move-wide v7, v4

    .line 29
    invoke-direct/range {v0 .. v9}, LA/h;-><init>(Ljava/lang/Object;LS3/e;LA/n;JLjava/lang/Object;JLtf/a;)V

    .line 30
    .line 31
    .line 32
    iget v3, p0, LA/I;->n:F

    .line 33
    .line 34
    move-wide v1, v4

    .line 35
    iget-object v4, p0, LA/I;->k:LA/L;

    .line 36
    .line 37
    iget-object v5, p0, LA/I;->m:LA/j;

    .line 38
    .line 39
    iget-object v6, p0, LA/I;->o:LA/a;

    .line 40
    .line 41
    invoke-static/range {v0 .. v6}, LA/t;->g(LA/h;JFLA/L;LA/j;Ltf/l;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LA/I;->i:Lkotlin/jvm/internal/G;

    .line 45
    .line 46
    iput-object v0, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object p1, Lef/C;->a:Lef/C;

    .line 49
    .line 50
    return-object p1
.end method
