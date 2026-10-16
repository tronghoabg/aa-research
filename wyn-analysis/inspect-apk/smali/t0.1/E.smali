.class public final Lt0/E;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:Lt0/F;

.field public final synthetic j:J

.field public final synthetic k:F

.field public final synthetic l:Ltf/l;


# direct methods
.method public constructor <init>(Lt0/F;JFLtf/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/E;->i:Lt0/F;

    .line 2
    .line 3
    iput-wide p2, p0, Lt0/E;->j:J

    .line 4
    .line 5
    iput p4, p0, Lt0/E;->k:F

    .line 6
    .line 7
    iput-object p5, p0, Lt0/E;->l:Ltf/l;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lt0/E;->k:F

    .line 2
    .line 3
    iget-object v1, p0, Lt0/E;->l:Ltf/l;

    .line 4
    .line 5
    iget-object v2, p0, Lt0/E;->i:Lt0/F;

    .line 6
    .line 7
    iget-wide v3, p0, Lt0/E;->j:J

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v2, Lt0/F;->f:Lt0/y;

    .line 12
    .line 13
    invoke-static {v1, v3, v4, v0}, Lr0/s;->b(Lr0/t;JF)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v2, v2, Lt0/F;->f:Lt0/y;

    .line 18
    .line 19
    invoke-static {v2, v3, v4, v0, v1}, Lr0/s;->f(Lr0/t;JFLtf/l;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    return-object v0
.end method
