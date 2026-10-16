.class public final LK/r;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Lh0/c;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:LZ/k;

.field public final synthetic l:J

.field public final synthetic m:I


# direct methods
.method public constructor <init>(Lh0/c;Ljava/lang/String;LZ/k;JI)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/r;->i:Lh0/c;

    .line 2
    .line 3
    iput-object p2, p0, LK/r;->j:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LK/r;->k:LZ/k;

    .line 6
    .line 7
    iput-wide p4, p0, LK/r;->l:J

    .line 8
    .line 9
    iput p6, p0, LK/r;->m:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LK/r;->m:I

    .line 10
    .line 11
    or-int/lit8 v6, p1, 0x1

    .line 12
    .line 13
    iget-object v2, p0, LK/r;->k:LZ/k;

    .line 14
    .line 15
    iget-object v0, p0, LK/r;->i:Lh0/c;

    .line 16
    .line 17
    iget-object v1, p0, LK/r;->j:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v3, p0, LK/r;->l:J

    .line 20
    .line 21
    invoke-static/range {v0 .. v6}, LK/t;->a(Lh0/c;Ljava/lang/String;LZ/k;JLN/o;I)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    return-object p1
.end method
