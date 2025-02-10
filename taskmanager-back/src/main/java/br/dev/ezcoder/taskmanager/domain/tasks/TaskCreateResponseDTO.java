package br.dev.ezcoder.taskmanager.domain.tasks;

import br.dev.ezcoder.taskmanager.domain.categories.CategoryModel;

import java.time.LocalDateTime;
import java.util.List;

public record TaskCreateResponseDTO(
        String title,
        String description,
        LocalDateTime createdAt,
        TaskStatus status,
        List<CategoryModel> categories) {
}
