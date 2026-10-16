.class public Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;
    }
.end annotation


# static fields
.field public static SKIP:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig; = null

.field private static final serialVersionUID:J = -0x35976799b9d89314L


# instance fields
.field private embeddedIdPrefix:Ljava/lang/String;

.field private emitKeyBase:Ljava/lang/String;

.field private emitter:Ljava/lang/String;

.field private extractEmbeddedDocumentBytes:Z

.field private includeOriginal:Z

.field private suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

.field private zeroPadName:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->SKIP:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 3
    sget-object v1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;->NONE:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 4
    const-string v1, "-"

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 6
    const-string v0, ""

    iput-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 10
    sget-object v1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;->NONE:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 11
    const-string v1, "-"

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 12
    iput-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 14
    iput-boolean p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    return-void
.end method

.method public static getSKIP()Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->SKIP:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 20
    .line 21
    iget-boolean v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 22
    .line 23
    iget-boolean v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 28
    .line 29
    iget v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    iget-boolean v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 34
    .line 35
    iget-boolean v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 36
    .line 37
    if-ne v2, v3, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 40
    .line 41
    iget-object v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 66
    .line 67
    iget-object p1, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v2, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    return v0

    .line 76
    :cond_2
    :goto_0
    return v1
.end method

.method public getEmbeddedIdPrefix()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmitKeyBase()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmitter()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSuffixStrategy()Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 2
    .line 3
    return-object v0
.end method

.method public getZeroPadName()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    const/16 v1, 0x4d5

    .line 4
    .line 5
    const/16 v2, 0x4cf

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget v3, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 15
    .line 16
    add-int/2addr v0, v3

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget-object v3, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 20
    .line 21
    invoke-static {v3}, Lj$/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    add-int/2addr v3, v0

    .line 26
    mul-int/lit8 v3, v3, 0x1f

    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Lj$/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/2addr v0, v3

    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    iget-object v3, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v3}, Lj$/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/2addr v3, v0

    .line 44
    mul-int/lit8 v3, v3, 0x1f

    .line 45
    .line 46
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    move v1, v2

    .line 51
    :cond_1
    add-int/2addr v3, v1

    .line 52
    mul-int/lit8 v3, v3, 0x1f

    .line 53
    .line 54
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0}, Lj$/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v3

    .line 61
    return v0
.end method

.method public isExtractEmbeddedDocumentBytes()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    return v0
.end method

.method public isIncludeOriginal()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 2
    .line 3
    return v0
.end method

.method public setEmbeddedIdPrefix(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEmitKeyBase(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEmitter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setExtractEmbeddedDocumentBytes(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIncludeOriginal(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSuffixStrategy(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;->valueOf(Ljava/lang/String;)Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->setSuffixStrategy(Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;)V

    return-void
.end method

.method public setSuffixStrategy(Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    return-void
.end method

.method public setZeroPadName(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 6
    .line 7
    iget-object v3, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean v5, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 12
    .line 13
    iget-object v6, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v8, "EmbeddedDocumentBytesConfig{extractEmbeddedDocumentBytes="

    .line 18
    .line 19
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", zeroPadName="

    .line 26
    .line 27
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", suffixStrategy="

    .line 34
    .line 35
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ", embeddedIdPrefix=\'"

    .line 42
    .line 43
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, "\', emitter=\'"

    .line 50
    .line 51
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, "\', includeOriginal="

    .line 58
    .line 59
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", emitKeyBase=\'"

    .line 66
    .line 67
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, "\'}"

    .line 71
    .line 72
    invoke-static {v7, v6, v0}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
.end method
