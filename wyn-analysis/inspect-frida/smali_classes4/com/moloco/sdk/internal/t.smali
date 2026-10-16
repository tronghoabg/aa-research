.class public final synthetic Lcom/moloco/sdk/internal/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:LZ/k;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ltf/a;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(LZ/k;Ljava/lang/String;Ljava/lang/String;JJLtf/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/internal/t;->a:LZ/k;

    iput-object p2, p0, Lcom/moloco/sdk/internal/t;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/moloco/sdk/internal/t;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/moloco/sdk/internal/t;->d:J

    iput-wide p6, p0, Lcom/moloco/sdk/internal/t;->e:J

    iput-object p8, p0, Lcom/moloco/sdk/internal/t;->f:Ltf/a;

    iput p9, p0, Lcom/moloco/sdk/internal/t;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/moloco/sdk/internal/t;->g:I

    .line 10
    .line 11
    or-int/lit8 v9, p1, 0x1

    .line 12
    .line 13
    iget-wide v5, p0, Lcom/moloco/sdk/internal/t;->e:J

    .line 14
    .line 15
    iget-object v7, p0, Lcom/moloco/sdk/internal/t;->f:Ltf/a;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/moloco/sdk/internal/t;->a:LZ/k;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/moloco/sdk/internal/t;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/moloco/sdk/internal/t;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v3, p0, Lcom/moloco/sdk/internal/t;->d:J

    .line 24
    .line 25
    invoke-static/range {v0 .. v9}, Lcom/moloco/sdk/internal/x;->a(LZ/k;Ljava/lang/String;Ljava/lang/String;JJLtf/a;LN/o;I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    return-object p1
.end method
